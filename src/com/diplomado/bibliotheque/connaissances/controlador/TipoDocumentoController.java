package com.diplomado.bibliotheque.connaissances.controlador;

import com.diplomado.bibliotheque.connaissances.convertidor.TipoDocumentoConverter;
import com.diplomado.bibliotheque.connaissances.modelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoDocumentoController {
    
    private Connection conn;
    
    public TipoDocumentoController(Connection conn) {
        this.conn = conn;
    }
    
    public List<TipoDocumento> consultarTiposDocumentos() {
        Statement s;
        try {
            s = this.conn.createStatement();
            ResultSet rs = s.executeQuery ("select * from TIPO_DOCUMENTO");
            List<TipoDocumento> listaTipoDocumento = new ArrayList<>();
            while (rs.next())
            {
                listaTipoDocumento.add(TipoDocumentoConverter.sentenciaATipoDocumento(rs));
            }
            return listaTipoDocumento;
        } catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public TipoDocumento consultarTipoDocumentoPorDescripcion(String descripcion) {
        try {
            System.out.println("TipoDocumetno consultar descripcion " + descripcion);
            PreparedStatement s = this.conn.prepareStatement("select * from TIPO_DOCUMENTO where DESCRIPCION = ?");
            s.setString(1, descripcion);
            ResultSet rs = s.executeQuery();
            System.out.println("TipoDocumetno consultar descripcion " + rs);
            while (rs.next()){
                return (TipoDocumentoConverter.sentenciaATipoDocumento(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
