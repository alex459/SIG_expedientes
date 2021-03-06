/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Clases.Usuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class GestionarUsuarios extends javax.swing.JFrame {
    DefaultTableModel modelo;
    Usuario user = new Usuario();
    /**
     * Creates new form GNuevoUsuario
     */
    public GestionarUsuarios() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Id Uduario");
        modelo.addColumn("Id Tipo");
        modelo.addColumn("Nombre de Usuario");
        modelo.addColumn("Clave");
        modelo.addColumn("Estado");
        this.tblUsuarios.setModel(modelo);
        
        this.datos();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTipoUsuario = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        btnIngresarUsuario = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GESTIONAR USUARIO");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVO USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("Tipo de Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("Clave");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        txtTipoUsuario.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtTipoUsuario.setToolTipText("Ingrese un tipo de usuario Ej. 1,2 ó 3");
        txtTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 120, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtNombreUsuario.setToolTipText("Ej: Usuario01");
        getContentPane().add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 220, -1));

        btnIngresarUsuario.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        btnIngresarUsuario.setText("Ingresar");
        btnIngresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        btnLimpiar.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("Limpia los campos de la pantalla");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(77, 23));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        tblUsuarios.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsuarios.setSelectionBackground(new java.awt.Color(255, 255, 168));
        jScrollPane1.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 191, 630, 240));

        btnConsultar.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setToolTipText("Consulta los usuarios existentes en la base de datos");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/little logo.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 63, 67));

        jLabel6.setBackground(new java.awt.Color(47, 72, 85));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/top.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 700, 10));

        txtClave.setToolTipText("Ingrese una contraseña");
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarUsuarioActionPerformed
        // TODO add your handling code here:
        //user.setIdusuario(Integer.parseInt(txtIdUsuario.getText()));
        
        user.setIdtipousuario(Integer.parseInt(txtTipoUsuario.getText()));
        user.setNombreusuario(txtNombreUsuario.getText());
        user.setClave(txtClave.getText());
        user.setEstadousuario(1);
        if(user.NuevoUsuario()){
            JOptionPane.showMessageDialog(this, "Usuario Ingreso al Sistema");
            limpiar();
            datos();
        }else{
            JOptionPane.showMessageDialog(this, "Error al ingresar usuario");
        }
    }//GEN-LAST:event_btnIngresarUsuarioActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        tblUsuarios.setModel(user.consultarUsuario());
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnIngresarUsuario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTipoUsuario;
    // End of variables declaration//GEN-END:variables
    
    public void limpiar(){
        txtTipoUsuario.setText("");
        txtNombreUsuario.setText("");
        txtClave.setText("");
        }

    public void datos(){
             tblUsuarios.setModel(user.consultarUsuario());
    }
}
