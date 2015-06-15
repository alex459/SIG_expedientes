/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Clases.Juez;
import Controlador.ControladorClases;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FlordeMaria
 */
public class PerfilDeJuecesParametros extends javax.swing.JFrame {
    DefaultTableModel modelo;
    Juez juez = new Juez();
    ControladorClases cc = new ControladorClases();
    /**
     * Creates new form PerfilDeJuecesParametros
     */
    public PerfilDeJuecesParametros() {
        initComponents();
        datos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblJuez = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtIdJuez = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(47, 72, 85));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblJuez.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        tblJuez.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblJuez.setSelectionBackground(new java.awt.Color(255, 255, 168));
        jScrollPane1.setViewportView(tblJuez);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, 375, 245));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JUECES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 11, -1, -1));

        txtIdJuez.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        getContentPane().add(txtIdJuez, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 63, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search icon.png"))); // NOI18N
        jLabel2.setText("Id Juez :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(47, 72, 85));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bgr.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        txtBuscar.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtBuscar.setText("Buscar");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 18, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    if(txtIdJuez.getText().equals(""))
    {
    JOptionPane.showMessageDialog(this, "Ingrese un id de Juez");
    }
    else{
         juez.setIdjueSeleccionado(Integer.parseInt(txtIdJuez.getText()));
         cc.AbrirPerfilDeJueces();
        }
    }//GEN-LAST:event_txtBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PerfilDeJuecesParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilDeJuecesParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilDeJuecesParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilDeJuecesParametros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilDeJuecesParametros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblJuez;
    private javax.swing.JButton txtBuscar;
    private javax.swing.JTextField txtIdJuez;
    // End of variables declaration//GEN-END:variables
 
    public void datos(){
             tblJuez.setModel(juez.consultarJuez());
    }

}
