
package com.diplomado.bibliotheque.connaissances.convertidor;

import com.diplomado.bibliotheque.connaissances.enums.EnumBoolean;
import com.diplomado.bibliotheque.connaissances.enums.EnumGenero;
import com.diplomado.bibliotheque.connaissances.modelo.Afiliado;
 import java.sql.ResultSet;
 import java.sql.SQLException;


public class AfiliadoConverter {
    
    public static Afiliado sentenciaAAfiliado (ResultSet sentencia) throws SQLException {
        Afiliado afiliado = new Afiliado();
        afiliado.setId(sentencia.getInt("id"));
        
        afiliado.setNumeroDocumento(sentencia.getNString("Numero_documento"));
        afiliado.setNombre(sentencia.getNString("nombre"));
        afiliado.setApellido(sentencia.getNString("apellido"));
        afiliado.setFechaNacimiento(sentencia.getDate("fecha_Nacimiento"));
        afiliado.setFechaAfiliacion(sentencia.getDate("Fecha_afiliacion"));
        
        
        return afiliado;
    
    }
}
