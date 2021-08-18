
package com.diplomado.bibliotheque.connaissances.controlador;

import com.diplomado.bibliotheque.connaissances.modelo.Afiliado;
 
import com.diplomado.bibliotheque.connaissances.convertidor.AfiliadoConverter;


 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.logging.Level;
 import java.util.logging.Logger;

public class AfiliadoController {
    
     private final Connection conn;
    
    public AfiliadoController(Connection conn) {
        this.conn = conn;
    }
    // Metodo para poder listar los libros
    public List<Afiliado> consultarAfiliado() {
            Statement s;
        try {
            s = this.conn.createStatement();
            ResultSet rs = s.executeQuery ("select * from persona_Afiliado");
            List<Afiliado> listaAfiliado = new ArrayList<>();
            TipoDocumentoController tpc = new TipoDocumentoController(conn);
            UsuarioController uc = new UsuarioController(conn);
            while (rs.next())
            {
                Afiliado afiliado = AfiliadoConverter.sentenciaAAfiliado(rs);
                afiliado.setTipoDocumento(tpc.consultarTipoDocumentoPorId(afiliado.getTipoDocumento().getId()));
                afiliado.setUsuario(uc.consultarUsuarioPorId(afiliado.getUsuario().getId()));
                listaAfiliado.add(afiliado);
            }            
            return listaAfiliado;
        } catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void eliminarAfiliado(int id){
      String sql = "delete from persona_Afiliado where id=?";
       try{
         
         PreparedStatement s = this.conn.prepareStatement(sql);
         s.setObject(1, id);
         s.executeUpdate();
       }
     catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
