/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Controlador.ControladorClases;

/**
 *
 * @author Kevin
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        frmIComparativoDeRendimiento = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        frmIExpedientesQueVenceran = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu9 = new javax.swing.JMenu();
        frmICantidadDeDiasExpedientes = new javax.swing.JMenuItem();
        frmICantidadDeDenunciasPorJuez = new javax.swing.JMenuItem();
        frmICantidadDeJuecesPorGenero = new javax.swing.JMenuItem();
        frmICantidadDeAsignaciones = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Logo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Informes");

        jMenu7.setText("Informes comparativos");

        frmIComparativoDeRendimiento.setText("Comparativo de rendimientos de colaboradores juridicos");
        frmIComparativoDeRendimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmIComparativoDeRendimientoActionPerformed(evt);
            }
        });
        jMenu7.add(frmIComparativoDeRendimiento);

        jMenu2.add(jMenu7);

        jMenu8.setText("Informes de Expedientes");

        frmIExpedientesQueVenceran.setText("Expedientes que venceran en cierto periodo de tiempo");
        frmIExpedientesQueVenceran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmIExpedientesQueVenceranActionPerformed(evt);
            }
        });
        jMenu8.add(frmIExpedientesQueVenceran);

        jMenu2.add(jMenu8);
        jMenu2.add(jSeparator1);

        jMenu9.setText("Informes de cantidad");

        frmICantidadDeDiasExpedientes.setText("Cantidad de dias de los expedientes por fases");
        frmICantidadDeDiasExpedientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmICantidadDeDiasExpedientesActionPerformed(evt);
            }
        });
        jMenu9.add(frmICantidadDeDiasExpedientes);

        frmICantidadDeDenunciasPorJuez.setText("Cantidad de denuncias por Juez en periodos de tiempo");
        frmICantidadDeDenunciasPorJuez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmICantidadDeDenunciasPorJuezActionPerformed(evt);
            }
        });
        jMenu9.add(frmICantidadDeDenunciasPorJuez);

        frmICantidadDeJuecesPorGenero.setText("Cantidad de jueces procesados por genero");
        frmICantidadDeJuecesPorGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmICantidadDeJuecesPorGeneroActionPerformed(evt);
            }
        });
        jMenu9.add(frmICantidadDeJuecesPorGenero);

        frmICantidadDeAsignaciones.setText("Cantidad de expedientes asignados a colaboradores juridicos");
        frmICantidadDeAsignaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmICantidadDeAsignacionesActionPerformed(evt);
            }
        });
        jMenu9.add(frmICantidadDeAsignaciones);

        jMenu2.add(jMenu9);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Índices");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Mapa");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Perfil");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Usuarios");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frmICantidadDeDiasExpedientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmICantidadDeDiasExpedientesActionPerformed
        // TODO add your handling code here:
        ControladorClases cc = new ControladorClases();
        cc.AbrirCantidadDeDiasExpedientes();
    }//GEN-LAST:event_frmICantidadDeDiasExpedientesActionPerformed

    private void frmICantidadDeDenunciasPorJuezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmICantidadDeDenunciasPorJuezActionPerformed
        // TODO add your handling code here:
        ControladorClases cc = new ControladorClases();
        cc.AbrirCantidadDeDenunciasPorJuez();
        
    }//GEN-LAST:event_frmICantidadDeDenunciasPorJuezActionPerformed

    private void frmICantidadDeJuecesPorGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmICantidadDeJuecesPorGeneroActionPerformed
        // TODO add your handling code here:
        ControladorClases cc = new ControladorClases();
        cc.AbrirCantidadDeJuecesPorGenero();
    }//GEN-LAST:event_frmICantidadDeJuecesPorGeneroActionPerformed

    private void frmICantidadDeAsignacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmICantidadDeAsignacionesActionPerformed
        // TODO add your handling code here:
        ControladorClases cc = new ControladorClases();
        cc.AbrirCantidadDeAsignaciones();
    }//GEN-LAST:event_frmICantidadDeAsignacionesActionPerformed

    private void frmIExpedientesQueVenceranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmIExpedientesQueVenceranActionPerformed
        // TODO add your handling code here:
        ControladorClases cc = new ControladorClases();
        cc.AbrirExpedientesQueVenceran();
    }//GEN-LAST:event_frmIExpedientesQueVenceranActionPerformed

    private void frmIComparativoDeRendimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmIComparativoDeRendimientoActionPerformed
        // TODO add your handling code here:
        ControladorClases cc = new ControladorClases();
        cc.AbrirComparativoDeRendimiento();
    }//GEN-LAST:event_frmIComparativoDeRendimientoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem frmICantidadDeAsignaciones;
    private javax.swing.JMenuItem frmICantidadDeDenunciasPorJuez;
    private javax.swing.JMenuItem frmICantidadDeDiasExpedientes;
    private javax.swing.JMenuItem frmICantidadDeJuecesPorGenero;
    private javax.swing.JMenuItem frmIComparativoDeRendimiento;
    private javax.swing.JMenuItem frmIExpedientesQueVenceran;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
