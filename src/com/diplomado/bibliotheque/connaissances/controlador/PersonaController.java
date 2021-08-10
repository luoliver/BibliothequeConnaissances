/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.bibliotheque.connaissances.controlador;

import com.diplomado.bibliotheque.connaissances.convertidor.FechaConverter;
import com.diplomado.bibliotheque.connaissances.modelo.Afiliado;
import com.diplomado.bibliotheque.connaissances.modelo.Usuario;
import com.diplomado.bibliotheque.connaissances.utils.UtilidadSeguridad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.Format;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class PersonaController {
    
    private Connection conn;
    
    public PersonaController(Connection conn) {
        this.conn = conn;
    }
    
    public Boolean registrarUsuario(Afiliado afiliado) {
        String query = " insert into PERSONA_AFILIADO (TIPO_DOCUMENTO, NUMERO_DOCUMENTO, NOMBRE, APELLIDO, FECHA_NACIMIENTO, GENERO, ESTADO, USUARIO, FECHA_AFILIACION)"
               + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement s = this.conn.prepareStatement(query);
            s.setInt(1, afiliado.getTipoDocumento().getId());
            s.setString(2, afiliado.getNumeroDocumento());
            s.setString(3, afiliado.getNombre());
            s.setString(4, afiliado.getApellido());
            s.setString(5, FechaConverter.dateAString(afiliado.getFechaNacimiento()));
            s.setString(6, afiliado.getGenero().getGenero());
            s.setString(7, afiliado.getEstado().getValor());
            s.setInt(8, afiliado.getUsuario().getId());
            s.setString(9, FechaConverter.dateAString(afiliado.getFechaAfiliacion()));
            boolean execute = s.execute();
            System.out.println("execute "+execute);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;      
    }
}
