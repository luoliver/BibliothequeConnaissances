/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.bibliotheque.connaissances.convertidor;

import com.diplomado.bibliotheque.connaissances.modelo.TipoDocumento;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class TipoDocumentoConverter {
    
    public static TipoDocumento sentenciaATipoDocumento(ResultSet sentencia) throws SQLException {
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setId(sentencia.getInt(1));
        tipoDocumento.setNombre(sentencia.getString(2));
        tipoDocumento.setDescripcion(sentencia.getString(3));
        return tipoDocumento;
    }
}
