/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Controlador.ControladorClases;
import Controlador.VariablesGlobales;
import java.util.Calendar;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class MenuPrincipal extends javax.swing.JFrame {
    ControladorClases cc = new ControladorClases();
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
         //if (Integer.parseInt(VariablesGlobales.IDTIPOUSUARIO)==1){
             
        // }
         
         if (Integer.parseInt(VariablesGlobales.IDTIPOUSUARIO)==2){
             jMenu6.setVisible(false);//
             frmICantidadDeAsignaciones.setVisible(false); //cantidad de expedientes asignados
             jMenu7.setVisible(false); //informe comparativo
              jMenu8.setVisible(false); //vencimiento en 5 10 y 15
              frmRendimientoDeExpedientes.setVisible(false); // holgura
              jMenu5.setVisible(false);
             
         }
         
         if (Integer.parseInt(VariablesGlobales.IDTIPOUSUARIO)==2){
             frmRendimientoDeDepartamento.setVisible(false); //RENDIMIENTO DE DEP
             jMenu4.setVisible(false); //MAPA
             frmICantidadDeDiasExpedientes.setVisible(false); // cantidad de dias
             frmICantidadDeDenunciasPorJuez.setVisible(false); //cantidad de denuncias por Juez
             frmICantidadDeJuecesPorGenero.setVisible(false); //Cantidad de jueces por genero
         }
         
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
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
        jMenu4 = new javax.swing.JMenu();
        frmMapaDeDenuncias = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        frmRendimientoDeDepartamento = new javax.swing.JMenuItem();
        frmRendimientoDeExpedientes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        frmPerfilDeJueces = new javax.swing.JMenuItem();
        frmPerfilDeColaboradores = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        frmGestionarUsuarios = new javax.swing.JMenuItem();
        frmGestionarTipoDeUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CORTE SUPREMA DE JUSTICIA - CONTROL DE DENUNCIAS A LOS JUECES- SISTEMA DE INFORMACION GERENCIAL");

        jLabel1.setBackground(new java.awt.Color(47, 72, 85));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CORTE SUPREMA DE JUSTICIA");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabel1.setOpaque(true);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBackground(new java.awt.Color(47, 72, 85));
        jLabel4.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CONTROL DE DENUNCIAS A JUECES");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(31, 33, 32));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario: ______  Fecha: ______  Privilegios: ______");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setOpaque(true);
        jLabel3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel3PropertyChange(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jMenuItem1.setText("Cerrar sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Informes");
        jMenu2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        jMenu7.setText("Informes comparativos");
        jMenu7.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        frmIComparativoDeRendimiento.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmIComparativoDeRendimiento.setText("Comparativo de rendimientos de colaboradores juridicos");
        frmIComparativoDeRendimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmIComparativoDeRendimientoActionPerformed(evt);
            }
        });
        jMenu7.add(frmIComparativoDeRendimiento);

        jMenu2.add(jMenu7);

        jMenu8.setText("Informes de Expedientes");
        jMenu8.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        frmIExpedientesQueVenceran.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
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
        jMenu9.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        frmICantidadDeDiasExpedientes.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmICantidadDeDiasExpedientes.setText("Cantidad de dias de los expedientes por fases");
        frmICantidadDeDiasExpedientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmICantidadDeDiasExpedientesActionPerformed(evt);
            }
        });
        jMenu9.add(frmICantidadDeDiasExpedientes);

        frmICantidadDeDenunciasPorJuez.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmICantidadDeDenunciasPorJuez.setText("Cantidad de denuncias por Juez en periodos de tiempo");
        frmICantidadDeDenunciasPorJuez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmICantidadDeDenunciasPorJuezActionPerformed(evt);
            }
        });
        jMenu9.add(frmICantidadDeDenunciasPorJuez);

        frmICantidadDeJuecesPorGenero.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmICantidadDeJuecesPorGenero.setText("Cantidad de jueces procesados por genero");
        frmICantidadDeJuecesPorGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmICantidadDeJuecesPorGeneroActionPerformed(evt);
            }
        });
        jMenu9.add(frmICantidadDeJuecesPorGenero);

        frmICantidadDeAsignaciones.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmICantidadDeAsignaciones.setText("Cantidad de expedientes asignados a colaboradores juridicos");
        frmICantidadDeAsignaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmICantidadDeAsignacionesActionPerformed(evt);
            }
        });
        jMenu9.add(frmICantidadDeAsignaciones);

        jMenu2.add(jMenu9);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Mapa");
        jMenu4.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        frmMapaDeDenuncias.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmMapaDeDenuncias.setText("Mapa estadístico de denuncias");
        frmMapaDeDenuncias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmMapaDeDenunciasActionPerformed(evt);
            }
        });
        jMenu4.add(frmMapaDeDenuncias);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Índices");
        jMenu3.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        frmRendimientoDeDepartamento.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmRendimientoDeDepartamento.setText("Rendimiento del Departamento");
        frmRendimientoDeDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmRendimientoDeDepartamentoActionPerformed(evt);
            }
        });
        jMenu3.add(frmRendimientoDeDepartamento);

        frmRendimientoDeExpedientes.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmRendimientoDeExpedientes.setText("Rendimiento de Expedientes");
        frmRendimientoDeExpedientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmRendimientoDeExpedientesActionPerformed(evt);
            }
        });
        jMenu3.add(frmRendimientoDeExpedientes);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Perfil");
        jMenu5.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        frmPerfilDeJueces.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmPerfilDeJueces.setText("Perfil de Jueces");
        frmPerfilDeJueces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmPerfilDeJuecesActionPerformed(evt);
            }
        });
        jMenu5.add(frmPerfilDeJueces);

        frmPerfilDeColaboradores.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmPerfilDeColaboradores.setText("Perfil de Colaboradores Jurídicos");
        frmPerfilDeColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmPerfilDeColaboradoresActionPerformed(evt);
            }
        });
        jMenu5.add(frmPerfilDeColaboradores);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Usuarios");
        jMenu6.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N

        frmGestionarUsuarios.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmGestionarUsuarios.setText("Gestionar Usuarios");
        frmGestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmGestionarUsuariosActionPerformed(evt);
            }
        });
        jMenu6.add(frmGestionarUsuarios);

        frmGestionarTipoDeUsuario.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        frmGestionarTipoDeUsuario.setText("Gestionar tipo de Usuario");
        frmGestionarTipoDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmGestionarTipoDeUsuarioActionPerformed(evt);
            }
        });
        jMenu6.add(frmGestionarTipoDeUsuario);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(525, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frmICantidadDeDiasExpedientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmICantidadDeDiasExpedientesActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirCantidadDeDiasExpedientes();
    }//GEN-LAST:event_frmICantidadDeDiasExpedientesActionPerformed

    private void frmICantidadDeDenunciasPorJuezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmICantidadDeDenunciasPorJuezActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirCantidadDeDenunciasPorJuez();
        
    }//GEN-LAST:event_frmICantidadDeDenunciasPorJuezActionPerformed

    private void frmICantidadDeJuecesPorGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmICantidadDeJuecesPorGeneroActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirCantidadDeJuecesPorGenero();
    }//GEN-LAST:event_frmICantidadDeJuecesPorGeneroActionPerformed

    private void frmICantidadDeAsignacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmICantidadDeAsignacionesActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirCantidadDeAsignaciones();
    }//GEN-LAST:event_frmICantidadDeAsignacionesActionPerformed

    private void frmIExpedientesQueVenceranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmIExpedientesQueVenceranActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirExpedientesQueVenceran();
    }//GEN-LAST:event_frmIExpedientesQueVenceranActionPerformed

    private void frmIComparativoDeRendimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmIComparativoDeRendimientoActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirComparativoDeRendimiento();
    }//GEN-LAST:event_frmIComparativoDeRendimientoActionPerformed

    private void frmMapaDeDenunciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmMapaDeDenunciasActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirMapaDeDenuncias();
    }//GEN-LAST:event_frmMapaDeDenunciasActionPerformed

    private void frmRendimientoDeDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmRendimientoDeDepartamentoActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirRendimientoDeDepartamento();
    }//GEN-LAST:event_frmRendimientoDeDepartamentoActionPerformed

    private void frmRendimientoDeExpedientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmRendimientoDeExpedientesActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirRendimientoDeExpedientes();
    }//GEN-LAST:event_frmRendimientoDeExpedientesActionPerformed

    private void frmPerfilDeJuecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmPerfilDeJuecesActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirPerfilDeJuecesParametros();
    }//GEN-LAST:event_frmPerfilDeJuecesActionPerformed

    private void frmPerfilDeColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmPerfilDeColaboradoresActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirPerfilDeColaboradores();
    }//GEN-LAST:event_frmPerfilDeColaboradoresActionPerformed

    private void frmGestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGestionarUsuariosActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirGestionarUsuarios();
    }//GEN-LAST:event_frmGestionarUsuariosActionPerformed

    private void frmGestionarTipoDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmGestionarTipoDeUsuarioActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirGestionarTiposDeUsuarios();
    }//GEN-LAST:event_frmGestionarTipoDeUsuarioActionPerformed

    private void jLabel3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel3PropertyChange
        Calendar cal=Calendar.getInstance();
        String fecha = cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        jLabel3.setText("Usuario: "+ VariablesGlobales.NOMBREUSUARIO+"            Fecha: "+fecha );
    }//GEN-LAST:event_jLabel3PropertyChange

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        VariablesGlobales.IDUSUARIO = "";
        VariablesGlobales.IDTIPOUSUARIO = "";
        VariablesGlobales.NOMBREUSUARIO = "";
        VariablesGlobales.ESTADOUSUARIO = "";
        ControladorClases cc = new ControladorClases();
        cc.AbrirLogin();
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenuItem frmGestionarTipoDeUsuario;
    private javax.swing.JMenuItem frmGestionarUsuarios;
    private javax.swing.JMenuItem frmICantidadDeAsignaciones;
    private javax.swing.JMenuItem frmICantidadDeDenunciasPorJuez;
    private javax.swing.JMenuItem frmICantidadDeDiasExpedientes;
    private javax.swing.JMenuItem frmICantidadDeJuecesPorGenero;
    private javax.swing.JMenuItem frmIComparativoDeRendimiento;
    private javax.swing.JMenuItem frmIExpedientesQueVenceran;
    private javax.swing.JMenuItem frmMapaDeDenuncias;
    private javax.swing.JMenuItem frmPerfilDeColaboradores;
    private javax.swing.JMenuItem frmPerfilDeJueces;
    private javax.swing.JMenuItem frmRendimientoDeDepartamento;
    private javax.swing.JMenuItem frmRendimientoDeExpedientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
