/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Controlador.ControladorBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jbeltran2
 */
public class Expediente {
    private String nombrejuridico;
    private String apellidojuridico;
    private Date fechadenuncia;
    private Date fechavencimiento;
    private int diasparavencerse;
    private Connection cn;
    /**
     * @return the nombrejuridico
     */
    public String getNombrejuridico() {
        return nombrejuridico;
    }

    /**
     * @param nombrejuridico the nombrejuridico to set
     */
    public void setNombrejuridico(String nombrejuridico) {
        this.nombrejuridico = nombrejuridico;
    }

    /**
     * @return the apellidojuridico
     */
    public String getApellidojuridico() {
        return apellidojuridico;
    }

    /**
     * @param apellidojuridico the apellidojuridico to set
     */
    public void setApellidojuridico(String apellidojuridico) {
        this.apellidojuridico = apellidojuridico;
    }

    /**
     * @return the fechadenuncia
     */
    public Date getFechadenuncia() {
        return fechadenuncia;
    }

    /**
     * @param fechadenuncia the fechadenuncia to set
     */
    public void setFechadenuncia(Date fechadenuncia) {
        this.fechadenuncia = fechadenuncia;
    }

    /**
     * @return the fechavencimiento
     */
    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    /**
     * @param fechavencimiento the fechavencimiento to set
     */
    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    /**
     * @return the diasparavencerse
     */
    public int getDiasparavencerse() {
        return diasparavencerse;
    }

    /**
     * @param diasparavencerse the diasparavencerse to set
     */
    public void setDiasparavencerse(int diasparavencerse) {
        this.diasparavencerse = diasparavencerse;
    }

     public TableModel consultarVencimiento(String fecha, int day){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaVencimiento = new DefaultTableModel();
        try {
            TablaVencimiento.addColumn("NOMBREJURIDICO");
            TablaVencimiento.addColumn("APELLIDOJURIDICO");
            TablaVencimiento.addColumn("FECHADENUNCIA");
            TablaVencimiento.addColumn("FECHAVENCIMIENTO");          
            TablaVencimiento.addColumn("VENCE EN (DIAS)");          
            String sql = "EXECUTE ExpedientesQueVenceran "+"'"+fecha+"'"+", "+day;
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Object dato[] = new Object[TablaVencimiento.getColumnCount()];
                for (int i = 0; i < TablaVencimiento.getColumnCount(); i++) {
                    dato[i] = rs.getString(i + 1);
                }
                TablaVencimiento.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return TablaVencimiento;
    }
    

     public TableModel consultarFases(int YEAR){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaFases = new DefaultTableModel();
        try {
            TablaFases.addColumn("FASE INCIO");
            TablaFases.addColumn("FASE PROCESO");
            TablaFases.addColumn("FASE SENTENCIA");
            
            String sql = "EXECUTE Fases "+ YEAR;
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Object dato[] = new Object[TablaFases.getColumnCount()];
                for (int i = 0; i < TablaFases.getColumnCount(); i++) {
                    dato[i] = rs.getString(i + 1);
                }
                TablaFases.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return TablaFases;
    }
     
    
}
