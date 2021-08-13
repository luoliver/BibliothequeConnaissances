
package com.diplomado.bibliotheque.connaissances.controlador;

import com.diplomado.bibliotheque.connaissances.convertidor.categoriaConverter;
import com.diplomado.bibliotheque.connaissances.modelo.Categoria;
import java.util.List;
import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.logging.Level;
 import java.util.logging.Logger;

public class CategoriaController {
    
    
    private final Connection conn;
    
    public CategoriaController(Connection conn) {
        this.conn = conn;
    }
    
      // Metodo para poder listar los libros
    public List<Categoria> consultarcategoria() {
        Statement s;
        try {
            s = this.conn.createStatement();
            ResultSet rs = s.executeQuery ("select * from categoria");
            List<Categoria> listacategoria = new ArrayList<>();
            while (rs.next())
            {
                listacategoria.add(categoriaConverter.sentenciaACategoria(rs));
            }
            
            return listacategoria;
        } catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
