/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.bibliotheque.connaissances.controlador;

import com.diplomado.bibliotheque.connaissances.convertidor.TipoDocumentoConverter;
import com.diplomado.bibliotheque.connaissances.modelo.TipoDocumento;
import java.sql.Connection;
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
            conn.close();
            return listaTipoDocumento;
        } catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
