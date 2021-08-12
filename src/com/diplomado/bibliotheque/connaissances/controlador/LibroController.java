
package com.diplomado.bibliotheque.connaissances.controlador;
 import com.diplomado.bibliotheque.connaissances.modelo.Libro;
 
import com.diplomado.bibliotheque.connaissances.convertidor.LibroConverter;
 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.logging.Level;
 import java.util.logging.Logger;

public class LibroController {
    
    
    private final Connection conn;
    
    public LibroController(Connection conn) {
        this.conn = conn;
    }
    //Metodo para poder generar un registro 
    
    public void registrarLibro (Libro lib){
     try{
         String sql= "insert into Libro(CODIGO,NOMBRE,EDITORIAL,CATEGORIA,AUTOR,CANTIDAD_COPIAS,FECHA_PUBLICACION) values(?,?,?,?,?,?,?)";
         
         PreparedStatement s = this.conn.prepareStatement(sql);
         s.setObject(1, lib.getCodigo());
         s.setObject(2, lib.getNombre());
         s.setObject(3, lib.getEditorial());
         s.setObject(4, lib.getCategoria());
         s.setObject(5, lib.getAutor());
         s.setObject(6, lib.getCantidad());
         s.setObject(7, lib.getFechaPublicacion());
         s.executeUpdate();
     
     }catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);}
    } 
    // Metodo para poder listar los libros
    public List<Libro> consultarLibros() {
        Statement s;
        try {
            s = this.conn.createStatement();
            ResultSet rs = s.executeQuery ("select * from Libro");
            List<Libro> listaLibro = new ArrayList<>();
            while (rs.next())
            {
                listaLibro.add(LibroConverter.sentenciaALibro(rs));
            }
            
            return listaLibro;
        } catch (SQLException ex) {
            Logger.getLogger(TipoDocumentoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //Metodo para poder eliminar un libro
    
    public void eliminarLibro(int id){
      String sql = "delete from libro where id=?";
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
