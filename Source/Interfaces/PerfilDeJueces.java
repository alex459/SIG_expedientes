/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Clases.Juez;
import Controlador.VariablesGlobales;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Kevin
 */
public class PerfilDeJueces extends javax.swing.JFrame {
    Juez jz = new Juez();
    ArrayList lista;
    /**
     * Creates new form PerfilDeJueces
     */
    public PerfilDeJueces() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdJuez = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDependencia = new javax.swing.JTextField();
        txtDepartamento = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtdenuncias = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtSuspension = new javax.swing.JTextField();
        txtAdmitidas = new javax.swing.JTextField();
        txtOmitidas = new javax.swing.JTextField();
        txtExoneracion = new javax.swing.JTextField();
        txtAmonestacion = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtRemocion = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PERFIL DE JUEZ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(47, 72, 85));
        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERFIL DE JUEZ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search icon.png"))); // NOI18N
        jLabel2.setText("Id de Juez:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 370, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("Nombre de dependencia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setText("Departamento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("Municipio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("Apellido");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setText("Género");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel10.setText("Título");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        txtIdJuez.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        txtIdJuez.setToolTipText("Ingrese un Id de un juez");
        getContentPane().add(txtIdJuez, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 86, -1));

        txtApellido.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 370, -1));

        txtGenero.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, -1));

        txtTitulo.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 250, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("FOTO");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.gray));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 84, 140, 150));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/little logo.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 63, 67));

        txtDependencia.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        getContentPane().add(txtDependencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 430, -1));

        txtDepartamento.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        getContentPane().add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 200, -1));

        txtMunicipio.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        getContentPane().add(txtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 200, -1));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel13.setText("Denuncias totales");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        txtdenuncias.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        getContentPane().add(txtdenuncias, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 110, -1));

        jLabel3.setBackground(new java.awt.Color(47, 72, 85));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/top.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 70));

        jSeparator1.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 600, 10));

        jSeparator2.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 600, 10));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 550, 30));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel19.setText("Denuncias con remocion");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel20.setText("Denuncias omitidas");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel21.setText("Denuncias admitidas");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel22.setText("Denuncias con exoneracion");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel23.setText("Denuncias con amonestacion");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));
        getContentPane().add(txtSuspension, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 110, -1));
        getContentPane().add(txtAdmitidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 120, -1));
        getContentPane().add(txtOmitidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 120, -1));
        getContentPane().add(txtExoneracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 110, -1));
        getContentPane().add(txtAmonestacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 110, -1));

        jButton2.setText("Buscar por ID de juez");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, -1, -1));

        jButton1.setText("Informe");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, -1, -1));
        getContentPane().add(txtRemocion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, 120, -1));

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel24.setText("Denuncias con suspencion");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        jz.setIdjueSeleccionado(Integer.parseInt(txtIdJuez.getText()));
        datos();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
           try{
               
            //conectandose a la base
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = VariablesGlobales.URLcon;
            Connection cn = DriverManager.getConnection(url);
            
            //proceso de jasper report---------------------------------------------------------------------------
            JasperReport jreport = (JasperReport) JRLoader.loadObjectFromFile("PerfilJuez.jasper");
            Map parametros = new HashMap();
            parametros.put("autor", VariablesGlobales.NOMBREUSUARIO); //metiendo variables
            parametros.put("idjuez", Integer.parseInt(txtIdJuez.getText())); //metiendo variables
            JasperPrint jasperPrint = JasperFillManager.fillReport(jreport, parametros, cn);
            JasperViewer ventanavisor = new JasperViewer(jasperPrint, false);
            ventanavisor.setTitle("CORTE SUPREMA DE JUSTICIA");
            ventanavisor.setVisible(true);
               
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, "jasper error:"+e);
               }
                    

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PerfilDeJueces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilDeJueces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilDeJueces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilDeJueces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilDeJueces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtAdmitidas;
    private javax.swing.JTextField txtAmonestacion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDependencia;
    private javax.swing.JTextField txtExoneracion;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIdJuez;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOmitidas;
    private javax.swing.JTextField txtRemocion;
    private javax.swing.JTextField txtSuspension;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtdenuncias;
    // End of variables declaration//GEN-END:variables

   public void datos(){
       lista = new ArrayList();
       lista.addAll(jz.consultarJuez(jz.getIdjueSeleccionado()));
       txtIdJuez.setText(String.valueOf(jz.getIdjueSeleccionado()));
       txtNombre.setText((String) lista.get(0));
       txtApellido.setText((String) lista.get(1));
       txtGenero.setText((String) lista.get(2));
       txtTitulo.setText((String) lista.get(3));
       txtDependencia.setText((String) lista.get(4));
       txtMunicipio.setText((String) lista.get(5));
       txtDepartamento.setText((String) lista.get(6));
       txtdenuncias.setText((String) lista.get(7));
       txtSuspension.setText((String) lista.get(8));
       txtAmonestacion.setText((String) lista.get(9));
       txtExoneracion.setText((String) lista.get(10));
       txtAdmitidas.setText((String) lista.get(11));
       txtOmitidas.setText((String) lista.get(12));
       txtRemocion.setText((String) lista.get(13));
   }
}
