/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.bibliotheque.connaissances.vista;

import com.diplomado.bibliotheque.connaissances.conexion.Conexion;
import com.diplomado.bibliotheque.connaissances.controlador.AfiliadoController;
import com.diplomado.bibliotheque.connaissances.enums.EnumRol;
import com.diplomado.bibliotheque.connaissances.modelo.Usuario;
import com.diplomado.bibliotheque.connaissances.modelo.Afiliado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class afiliados extends javax.swing.JFrame {

    private Conexion conn;
    private Ventana principal;
    private Usuario usuario;
    DefaultTableModel modelo;
    AfiliadoController AfCon;
   
    public afiliados(Conexion conn) {
         initComponents();
        this.conn = conn;
        this.principal = principal;
        this.usuario = usuario;
        jLabel1.setText("Hola Afiliaado " + this.usuario.getUsuario());
        System.out.println("Hola Afiliado");
         this.AfCon = new AfiliadoController(conn.getConnection());
        modelo = (DefaultTableModel) tblafiliado.getModel();
        listar();
        
    }

    

     public void listar(){
      List<Afiliado> listaAfiliado = new ArrayList<>();
      listaAfiliado = AfCon.consultarAfiliado();
      
      Object ob[] = new Object[10];
      for(int i=0; i<listaAfiliado.size();i++){
       ob[0]=listaAfiliado.get(i).getId();
       ob[1]=listaAfiliado.get(i).getTipoDocumento();
       ob[2]=listaAfiliado.get(i).getNumeroDocumento();
       ob[3]=listaAfiliado.get(i).getNombre();
       ob[4]=listaAfiliado.get(i).getApellido();
       ob[5]=listaAfiliado.get(i).getFechaNacimiento();
       ob[6]=listaAfiliado.get(i).getGenero();
       ob[7]=listaAfiliado.get(i).getEstado();
       ob[8]=listaAfiliado.get(i).getUsuario();
       ob[9]=listaAfiliado.get(i).getFechaAfiliacion();
       modelo.addRow(ob);
      
      }
      
    }
      public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) { //siempre va a eliminar la fila cero
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblafiliado = new javax.swing.JTable();
        RegistrarA = new javax.swing.JButton();
        EliminarA = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Home Afiliados");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/diplomado/bibliotheque/connaissances/images/afiliados.png"))); // NOI18N

        tblafiliado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO D", "DOCUMENTO", "NOMBRE", "APELLIDO", "FECHA N", "GENERO", "ESTADO", "USUARIO", "FECHA A"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblafiliado);

        RegistrarA.setBackground(new java.awt.Color(153, 255, 0));
        RegistrarA.setText("Registrar");
        RegistrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarAActionPerformed(evt);
            }
        });

        EliminarA.setBackground(new java.awt.Color(255, 102, 102));
        EliminarA.setText("Eliminar");
        EliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Opciones");

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(RegistrarA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EliminarA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(RegistrarA)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarA)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2)
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarAActionPerformed
        Registrar registrar = new Registrar(conn, this.principal,EnumRol.AFILIADO, null);
        this.principal.cambiarPanel(registrar);
    }//GEN-LAST:event_RegistrarAActionPerformed

    private void EliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAActionPerformed
        int fila = tblafiliado.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        } else {
          int idlibro = Integer.parseInt(tblafiliado.getValueAt(fila, 0).toString());
          AfCon.eliminarAfiliado(idlibro);
          limpiarTabla();
          listar();
        }
    }//GEN-LAST:event_EliminarAActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarA;
    private javax.swing.JButton RegistrarA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblafiliado;
    // End of variables declaration//GEN-END:variables
}
