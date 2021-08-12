package com.diplomado.bibliotheque.connaissances.vista;

import com.diplomado.bibliotheque.connaissances.conexion.Conexion;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    private static Conexion conn;
    private static Login login;
    
    public Ventana(){
        this.setSize(500, 500);
        conn = new Conexion();
        login = new Login(conn,this);
        this.getContentPane().add(login);
    }
    
    protected void cambiarPanel(JPanel nombrePanel) {
        this.getContentPane().removeAll();
        this.getContentPane().add(nombrePanel);
        this.getContentPane().repaint();
        this.getContentPane().revalidate();
        System.out.println("INGRESO");
    }
}
