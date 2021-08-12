package com.diplomado.bibliotheque.connaissances.conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private String nombreBd = "bibliothequeconnaissances";
    private String usuario="root";
    private String contrasena="";
    private String url="jdbc:mysql://localhost:3306/"+nombreBd+"?useUnicode=true&useJDBCCompliantTimeZoneShift=true&useLegacyDateTimeCode=false&serverTimezone=UTC";
    
    Connection conn = null;
   
   public Conexion() {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn=DriverManager.getConnection(url,usuario,contrasena);
           if(conn!= null) {
               System.out.println("Conexión Exitosa a la BD "+ nombreBd);
           }
       } catch (ClassNotFoundException classNotFoundExcepcion){
           System.out.println("Ocurrio un error classNotFoundException: "+classNotFoundExcepcion.getMessage());
       } catch(SQLException sqlExcepcion){
           System.out.println("Ocurrio un error sqlException: "+sqlExcepcion.getMessage());
       }
   }
   
   public Connection getConnection(){
       return conn;
   }
   
    public void cerrarConexion(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
