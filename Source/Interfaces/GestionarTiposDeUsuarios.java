/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Clases.TipoDeUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author jbeltran2
 */
public class GestionarTiposDeUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form GestionarTiposDeUsuarios
     */
    public GestionarTiposDeUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdTipoUsuario = new javax.swing.JTextField();
        txtDescripcionTipoUsuario = new javax.swing.JTextField();
        btnIngresarTipo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultar = new javax.swing.JTable();
        btnIngresarTipo1 = new javax.swing.JButton();
        txtDescripcionTipoUsuario1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setBackground(new java.awt.Color(47, 72, 85));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/top.png"))); // NOI18N

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/little logo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TIPOS DE USUARIO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIPOS DE USUARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel2.setText("ID Tipo De Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("Privilegio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtIdTipoUsuario.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtIdTipoUsuario.setToolTipText("Ej: 01");
        getContentPane().add(txtIdTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 50, -1));

        txtDescripcionTipoUsuario.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtDescripcionTipoUsuario.setToolTipText("Ej: Usuario técnico");
        getContentPane().add(txtDescripcionTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 80, -1));

        btnIngresarTipo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        btnIngresarTipo.setText("Eliminar");
        btnIngresarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarTipoActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/little logo.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 63, 67));

        jLabel5.setBackground(new java.awt.Color(47, 72, 85));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/top.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 70));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 410, 20));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 410, 50));

        tblConsultar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblConsultar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 370, 90));

        btnIngresarTipo1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        btnIngresarTipo1.setText("Agregar");
        btnIngresarTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarTipo1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        txtDescripcionTipoUsuario1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtDescripcionTipoUsuario1.setToolTipText("Ej: Usuario técnico");
        getContentPane().add(txtDescripcionTipoUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 230, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("Descripción ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarTipoActionPerformed
        // TODO add your handling code here:
        
        TipoDeUsuario tipo = new TipoDeUsuario();
        tipo.setDescripciontipousuario(txtDescripcionTipoUsuario.getText());
        
         if(tipo.NuevoTipoDeUsuario()){
            JOptionPane.showMessageDialog(this, "Tipo de usuario Ingreso al Sistema");
        }else{
            JOptionPane.showMessageDialog(this, "Error al ingresar el tipo de usuario");
        }
    }//GEN-LAST:event_btnIngresarTipoActionPerformed

    private void btnIngresarTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarTipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarTipo1ActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarTiposDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarTiposDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarTiposDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarTiposDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarTiposDeUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarTipo;
    private javax.swing.JButton btnIngresarTipo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblConsultar;
    private javax.swing.JTextField txtDescripcionTipoUsuario;
    private javax.swing.JTextField txtDescripcionTipoUsuario1;
    private javax.swing.JTextField txtIdTipoUsuario;
    // End of variables declaration//GEN-END:variables
 public void datos(){
     
 }

}
