/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.bibliotheque.connaissances.convertidor;

import com.diplomado.bibliotheque.connaissances.enums.EnumRol;
import com.diplomado.bibliotheque.connaissances.modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class UsuarioConverter {
    
    public static Usuario sentenciaAUsuario(ResultSet sentencia) throws SQLException{
        Usuario usuario = new Usuario();
        usuario.setId(sentencia.getInt("Id"));
        usuario.setUsuario(sentencia.getString("usuario"));
        usuario.setContrasena(sentencia.getString("contrasena"));
        usuario.setCorreo(sentencia.getString("correo"));
        usuario.setFechaModificacionClave(sentencia.getDate("FECHA_MODIFICACION_CLAVE"));
        usuario.setRol(EnumRol.consultarRol(sentencia.getString("rol")));
        return usuario;
    }
}
