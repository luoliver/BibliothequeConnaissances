
package com.diplomado.bibliotheque.connaissances.convertidor;

import com.diplomado.bibliotheque.connaissances.modelo.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;


public class categoriaConverter {
      public static Categoria sentenciaACategoria (ResultSet sentencia) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setId(sentencia.getInt("Id"));
        categoria.setNombre(sentencia.getString("Nombre"));
        categoria.setDescripcion(sentencia.getString("Descripcion"));
        return categoria;
    }
}
