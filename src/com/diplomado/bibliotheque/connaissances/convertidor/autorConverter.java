
package com.diplomado.bibliotheque.connaissances.convertidor;

import com.diplomado.bibliotheque.connaissances.modelo.Autor;
import java.sql.ResultSet;
import java.sql.SQLException;
public class autorConverter {
    
    public static Autor sentenciaAautor (ResultSet sentencia) throws SQLException {
        Autor autor = new Autor();
        autor.setId(sentencia.getInt("Id"));
        autor.setNombre(sentencia.getString("Nombre"));
        autor.setApellido(sentencia.getString("Apellido"));

        

        return autor;
    }
    
}
