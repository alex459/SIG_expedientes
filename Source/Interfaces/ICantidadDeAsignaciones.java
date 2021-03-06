/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import Clases.Expediente;
import Controlador.ControladorClases;
import Controlador.Validar;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class ICantidadDeAsignaciones extends javax.swing.JFrame {
    ControladorClases cc = new ControladorClases();
    Expediente exp = new Expediente();
    Validar val = new Validar();
    ArrayList lista;
    String[] Meses = new String[] {"Enero", "Febrero","Marzo", "Abril","Mayo", "Junio","Julio", "Agosto","Septiembre", "Octubre","Noviembre", "Diciembre"};
    String[] Anios = new String[] {"1995", "1996","1997", "1998","1999", "2000","2001", "2002","2003", "2004","2005", "2006","2007","2008","2009","2010","2011","2012","2013","2014","2015"};
    int intervalo;
    Date fecha;
    SimpleDateFormat formato;

    String[] columnNames = {"Nombres","Apellidos","Total Expedientes","X Holgura","X Vencimiento"};
    Object data[][] = {};
   DefaultTableModel md;    

    String MesDesde = "";
//    String MesHasta = "";
    String AnioDesde = "";
//    String AnioHasta = "";
    
    /**
     * Creates new form RendimientoDeExpediente
     */
    public ICantidadDeAsignaciones() {
        initComponents();
        llenarIntervalo();
        md = new DefaultTableModel(data, columnNames);
        tblRendimientoExp.setModel(md);
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
        tblRendimientoExp = new javax.swing.JTable();
        txtGenerar = new javax.swing.JButton();
        txtImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbIntervalo = new javax.swing.JComboBox();
        cbMesDesde = new javax.swing.JComboBox();
        cbAnioDesde = new javax.swing.JComboBox();
        txtConsultar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ASIGNACIONES DE EXPEDIENTES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRendimientoExp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblRendimientoExp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 199, 616, 280));

        txtGenerar.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtGenerar.setText("Agregar");
        txtGenerar.setToolTipText("Agrega un nuevo colaborador al listado");
        txtGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(txtGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 80, -1));

        txtImprimir.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        txtImprimir.setText("Imprimir");
        getContentPane().add(txtImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ASIGNACIONES DE EXPEDIENTES A COLABORADORES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel14.setText("Fecha desde");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setText("Intervalo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(31, 33, 32));
        jLabel16.setText("Parámetros");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jSeparator3.setFont(new java.awt.Font("Cambria", 0, 11)); // NOI18N
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 210, 10));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 10, 60));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/little logo.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 63, 67));

        jLabel7.setBackground(new java.awt.Color(47, 72, 85));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/top.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 70));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 660, 20));

        btnConsulta.setText("Consultar");
        btnConsulta.setToolTipText("Consulta los colaboradores existentes en la base de datos");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setText("Consultar Colaboradores");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        cbIntervalo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cbIntervalo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbIntervalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 90, -1));

        cbMesDesde.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cbMesDesde.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbMesDesde.setToolTipText("Mes");
        getContentPane().add(cbMesDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        cbAnioDesde.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cbAnioDesde.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAnioDesde.setToolTipText("Año");
        getContentPane().add(cbAnioDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        getContentPane().add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenerarActionPerformed
        // TODO add your handling code here:

        String MesDesde = "";
        //String MesHasta = "";
        String AnioDesde = "";
        //String AnioHasta = "";
        
        if(cbMesDesde.getSelectedItem() == ""){
            JOptionPane.showMessageDialog(this, "Seleccione un mes de inicio");
        }else{
            MesDesde = (String) cbMesDesde.getSelectedItem();
        }
        
//        if(cbMesHasta.getSelectedItem() == ""){
//            JOptionPane.showMessageDialog(this, "Seleccione un mes de inicio");
//        }else{
//            MesHasta = (String) cbMesHasta.getSelectedItem();
//        }
        
        if(cbAnioDesde.getSelectedItem() == ""){
            JOptionPane.showMessageDialog(this, "Seleccione un mes de inicio");
        }else{
            AnioDesde = (String) cbAnioDesde.getSelectedItem();
        }

//        if(cbAnioHasta.getSelectedItem() == ""){
//            JOptionPane.showMessageDialog(this, "Seleccione un mes de inicio");
//        }else{
//            AnioHasta = (String) cbAnioDesde.getSelectedItem();
//        }
        
        if(MesDesde.equals("") & AnioDesde.equals("") ){
            JOptionPane.showMessageDialog(this, "Selecciones los parametros de fecha requeridos");    
        }else{     
                datos();
        }
        
//        if(cbIntervalo.getSelectedIndex() == 0){
//            exp.consultarAsignados(Integer.parseInt(txtConsultar.getText()), null, null, null, null);
//            
//        } else if(cbIntervalo.getSelectedIndex() == 1){
//        
//        }
    }//GEN-LAST:event_txtGenerarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
        
        cc.AbrirPerfilDeColaboradoresParametros();
    }//GEN-LAST:event_btnConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(ICantidadDeAsignaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ICantidadDeAsignaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ICantidadDeAsignaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ICantidadDeAsignaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ICantidadDeAsignaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JComboBox cbAnioDesde;
    private javax.swing.JComboBox cbIntervalo;
    private javax.swing.JComboBox cbMesDesde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tblRendimientoExp;
    private javax.swing.JTextField txtConsultar;
    private javax.swing.JButton txtGenerar;
    private javax.swing.JButton txtImprimir;
    // End of variables declaration//GEN-END:variables

    private void llenarIntervalo(){
        cbIntervalo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Mensual", "Anual"}));
        cbMesDesde.setModel(new javax.swing.DefaultComboBoxModel(Meses));
        cbAnioDesde.setModel(new javax.swing.DefaultComboBoxModel(Anios));
        
//        cbMesHasta.setModel(new javax.swing.DefaultComboBoxModel(Meses));
//        cbAnioHasta.setModel(new javax.swing.DefaultComboBoxModel(Anios));    
    }
    
    public void CambiarParametros(){
        if(cbIntervalo.getSelectedIndex() == 1){
            cbMesDesde.setEnabled(FALSE);
//            cbMesHasta.setEnabled(FALSE);
        }else{
            cbMesDesde.setEnabled(TRUE);
//            cbMesHasta.setEnabled(TRUE);
        }
        
    }
    
    public void datos(){
        lista = new ArrayList();
        lista.addAll(exp.consultarAsignados(Integer.parseInt(txtConsultar.getText()), cbMesDesde.getSelectedIndex()+1 , Integer.parseInt((String) cbAnioDesde.getSelectedItem()), cbIntervalo.getSelectedIndex()));
        
        
        System.out.println(cbMesDesde.getSelectedIndex()+1);
        System.out.println(cbAnioDesde.getSelectedItem());
        System.out.println(cbIntervalo.getSelectedIndex());
        
        String a = (String) lista.get(0); System.out.println(lista.get(0));
        String b = (String) lista.get(1); System.out.println(lista.get(1));
        int c = (int) lista.get(2); System.out.println(lista.get(2));
        int d = (int) lista.get(3); System.out.println(lista.get(3));
        int f = (int) lista.get(4); System.out.println(lista.get(4));
        
        Object elementos[] = {a,b,c,d,f};
        md.addRow(elementos);
        
        
    }
    
}
