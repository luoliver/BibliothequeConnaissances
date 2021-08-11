/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.bibliotheque.connaissances.vista;

import com.diplomado.bibliotheque.connaissances.enums.EnumRol;
import com.diplomado.bibliotheque.connaissances.modelo.Conexion;
import com.diplomado.bibliotheque.connaissances.modelo.Usuario;

/**
 *
 * @author HP
 */
public class HomeAdministrador extends javax.swing.JPanel {

    private Conexion conn;
    private Ventana principal;
    private Usuario usuario;
    /**
     * Creates new form Home
     */
    public HomeAdministrador(Conexion conn,Ventana principal, Usuario usuario) {
        initComponents();
        this.conn = conn;
        this.principal = principal;
        this.usuario = usuario;
        jLabel1.setText("Hola " + usuario.getUsuario());
        System.out.println("Hola Home");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegistrarBibliotecario = new javax.swing.JButton();

        jLabel1.setText("Hola");

        btnRegistrarBibliotecario.setText("Registrar Bibliotecario");
        btnRegistrarBibliotecario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarBibliotecarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnRegistrarBibliotecario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarBibliotecario)
                .addContainerGap(246, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarBibliotecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarBibliotecarioActionPerformed
        Registrar registrar = new Registrar(conn, this.principal,EnumRol.BIBLIOTECARIO,this.usuario);
        this.principal.cambiarPanel(registrar);
    }//GEN-LAST:event_btnRegistrarBibliotecarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarBibliotecario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
