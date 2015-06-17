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

     public TableModel consultarVencimiento(java.util.Date fecha , int day){
        
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
            
            String sql = "EXECUTE FASECURSOR "+ YEAR;
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
     
      public ArrayList consultarAsignados(int id, int MesDesde, int AnioDesde, int parametro){
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        ArrayList dato = new ArrayList();
        try {           //1,3,2003,0
            String sql = "EXECUTE Asignaciones  "+id+", "+MesDesde+", "+AnioDesde+", "+parametro;
            //String sql = "SELECT NUMEROEXPEDIENTE, IDJURIDICO, IDJUEZ, IDESTADO, IDDENUNCIA FROM EXPEDIENTE WHERE NUMEROEXPEDIENTE = 500";
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                dato.add(rs.getString(1)); //nombre
                dato.add(rs.getString(2)); //apellido
                dato.add(rs.getInt(3)); //total entre fechas
                dato.add(rs.getInt(4)); //promedio de holgura
                dato.add(rs.getInt(5)); //promedio de vencidos
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
       return dato;
    }     

       public ArrayList Mapa(int id, int MesDesde, int AnioDesde, int parametro){
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        ArrayList dato = new ArrayList();
        try {           //1,3,2003,0
            String sql = "EXECUTE Asignaciones  "+id+", "+MesDesde+", "+AnioDesde+", "+parametro;
            //String sql = "SELECT NUMEROEXPEDIENTE, IDJURIDICO, IDJUEZ, IDESTADO, IDDENUNCIA FROM EXPEDIENTE WHERE NUMEROEXPEDIENTE = 500";
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                dato.add(rs.getString(1)); //nombre
                dato.add(rs.getString(2)); //apellido
                dato.add(rs.getInt(3)); //total entre fechas
                dato.add(rs.getInt(4)); //promedio de holgura
                dato.add(rs.getInt(5)); //promedio de vencidos
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
       return dato;
    } 
      
}