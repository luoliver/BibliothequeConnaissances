
package com.diplomado.bibliotheque.connaissances.controlador;

import com.diplomado.bibliotheque.connaissances.convertidor.UsuarioConverter;
import com.diplomado.bibliotheque.connaissances.convertidor.autorConverter;
import com.diplomado.bibliotheque.connaissances.modelo.Autor;
import java.sql.Connection;
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

public class AutorController {
    
    private final Connection conn;
    
    public AutorController(Connection conn) {
        this.conn = conn;
    }
    public List<Autor> consultarAutor() {
        Statement s;
        try {
            s = this.conn.createStatement();
            ResultSet rs = s.executeQuery ("select * from persona_autor");
            List<Autor> listaautor = new ArrayList<>();
            while (rs.next())
            {
                listaautor.add(autorConverter.sentenciaAautor(rs));
            }
            
            return listaautor;
        } catch (SQLException ex) {
            Logger.getLogger(AutorController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
