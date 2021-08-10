/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.bibliotheque.connaissances.controlador;

import com.diplomado.bibliotheque.connaissances.convertidor.FechaConverter;
import com.diplomado.bibliotheque.connaissances.convertidor.UsuarioConverter;
import com.diplomado.bibliotheque.connaissances.modelo.Usuario;
import com.diplomado.bibliotheque.connaissances.utils.UtilidadSeguridad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class UsuarioController {
    
    private Connection conn;
    
    public UsuarioController(Connection conn) {
        this.conn = conn;
    }
    
    public Usuario logearUsuario(String usuario, String contrasena){
        try {
            PreparedStatement s = this.conn.prepareStatement("select * from USUARIO where usuario = ?");
            s.setString(1, usuario);
            ResultSet rs = s.executeQuery();
            List<Usuario> listaUsuario = new ArrayList<>();
            while (rs.next())
            {
                listaUsuario.add(UsuarioConverter.sentenciaAUsuario(rs));
            }
            Usuario usuarioTemp = listaUsuario.iterator().next();
            if(usuarioTemp.getContrasena().equals(UtilidadSeguridad.encript(contrasena)))
                return usuarioTemp;
        } catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;        
    }
    
    public Usuario registrarUsuario(Usuario usuario) {
        String query = " insert into USUARIO (USUARIO, CONTRASENA, CORREO, FECHA_MODIFICACION_CLAVE, ROL)"
               + " values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement s = this.conn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            s.setString(1, usuario.getUsuario());
            s.setString(2, UtilidadSeguridad.encript(usuario.getContrasena()));
            s.setString(3, usuario.getCorreo());
            s.setString(4, FechaConverter.dateAString(usuario.getFechaModificacionClave()));
            s.setString(5, usuario.getRol().getNombre());
            int execute = s.executeUpdate();
            System.out.println("execute "+execute);
            if (execute == 0) {
                throw new SQLException("Creacion de usuario fallida, no se a modificado registros");
            }
            try (ResultSet generatedKeys = s.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    usuario.setId(generatedKeys.getInt(1));
                }
                else {
                    throw new SQLException("Creacion de usuario fallida, no se a obtenido ID.");
                }
            }
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;  
    }
}
