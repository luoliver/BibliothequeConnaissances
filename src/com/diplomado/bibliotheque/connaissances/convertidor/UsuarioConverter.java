package com.diplomado.bibliotheque.connaissances.convertidor;

import com.diplomado.bibliotheque.connaissances.enums.EnumRol;
import com.diplomado.bibliotheque.connaissances.modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

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
