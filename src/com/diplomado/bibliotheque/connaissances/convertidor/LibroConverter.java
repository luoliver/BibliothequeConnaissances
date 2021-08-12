
package com.diplomado.bibliotheque.connaissances.convertidor;

 import com.diplomado.bibliotheque.connaissances.modelo.Libro;
 import java.sql.ResultSet;
 import java.sql.SQLException;

public class LibroConverter {
    
     public static Libro sentenciaALibro (ResultSet sentencia) throws SQLException {
        Libro libro = new Libro();
        libro.setId(sentencia.getInt(1));
        libro.setCodigo(sentencia.getString(2));
        libro.setNombre(sentencia.getString(3));
        libro.setEditorial(sentencia.getString(4));
        libro.setCategoria(sentencia.getInt(5));
        libro.setAutor(sentencia.getInt(6));
        libro.setCantidad(sentencia.getInt(7));
        libro.setFechaPublicacion(sentencia.getDate(8));
        return libro;
    }
}
