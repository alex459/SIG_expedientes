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
            String sql = "EXECUTE ExpedientesQueVenceran '"+fecha+"', "+day;
           //   String sql = "EXECUTE ExpedientesQueVenceran '01-01-2010' , "+day;
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
        String sql, sql0;
        PreparedStatement cmd, cmd0;
        ResultSet rs, rs0;
        ControladorBD con = new ControladorBD();
//        try {
//        cn = con.AbrirConexion();
//            sql = "TRUNCATE TABLE TEMPORAL";
//            cmd = cn.prepareStatement(sql);
//            rs = cmd.executeQuery();
//        }catch(Exception ex){
//            JOptionPane.showMessageDialog(null, "ERROR:" + ex);
//        }
        DefaultTableModel TablaFases = new DefaultTableModel();
            TablaFases.addColumn("FASE");
            TablaFases.addColumn("MES");
            TablaFases.addColumn("PROMEDIO (EN DIAS)");
            
          //  TablaFases.addColumn("Fase Inicial");
          //  TablaFases.addColumn("Fase de Proceso");
          //  TablaFases.addColumn("Fase de Sentencia");
            
            
        cn = con.AbrirConexion();
        try{
            sql0 = "EXECUTE FASECURSOR "+ YEAR;
       // sql = "EXECUTE FASECURSOR 2010";
           //   sql = "EXECUTE FASES "+ YEAR;
            cmd0 = cn.prepareStatement(sql0);
            rs0 = cmd0.executeQuery();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Promedio de las Fases por mes, del año " + YEAR);
        }
        try {
        cn = con.AbrirConexion();
        sql = "exec fases";
           //   sql = "EXECUTE FASES "+ YEAR;
            cmd = cn.prepareStatement(sql);
            rs = cmd.executeQuery();
            
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

       public ArrayList Mapa(int dep, java.util.Date f1, java.util.Date f2){
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        ArrayList dato = new ArrayList();
        try {           //1,3,2003,0
            
            String sql = "EXECUTE Mapa  "+dep+", 19950101, 20110101";
            //String sql = "EXECUTE Mapa  "+dep+", "+f1+", "+f2;
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
        public TableModel RedimientoExp(java.util.Date fecha1,java.util.Date fecha2, int orden){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaVencimiento = new DefaultTableModel();
        try {
            TablaVencimiento.addColumn("Numero de Expediente");
            TablaVencimiento.addColumn("Nombre Juridico");
            TablaVencimiento.addColumn("Apellido Juridico");
            TablaVencimiento.addColumn("Nombre Juez");
            TablaVencimiento.addColumn("Apellido Juez");
            
            String sql = "EXECUTE RENDIMIENTOEXPEDIENTE '20100101', '20110101', "+orden;
       //   String sql = "EXECUTE RENDIMIENTOEXPEDIENTE "+ fecha1 +", "+ fecha2 + ", " + 1;
       //   String sql = "EXECUTE RENDIMIENTOEXPEDIENTE "+ fecha1 + ", "+ fecha2 + ", " + orden;
            
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

     public TableModel MapaDenuncias(java.util.Date fecha1,java.util.Date fecha2, int dep){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaDenuncias = new DefaultTableModel();
        try {
            TablaDenuncias.addColumn("CantTotal");
            TablaDenuncias.addColumn("DenunciasOmitidas");
            TablaDenuncias.addColumn("DenunciasAdmitidas");
            
          String sql = "EXECUTE MAPA "+ dep +", '20000101', '20110101'";
           // String sql = "EXECUTE MAPA "+fecha1+","+fecha2+","+ dep;
           // String sql = "EXECUTE RENDIMIENTOEXPEDIENTE "+ fecha1 +", "+ fecha2 + ", " + 1;
           // String sql = "EXECUTE RENDIMIENTOEXPEDIENTE "+ fecha1 + ", "+ fecha2 + ", " + orden;
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Object dato[] = new Object[TablaDenuncias.getColumnCount()];
                for (int i = 0; i < TablaDenuncias.getColumnCount(); i++) {
                    dato[i] = rs.getString(i + 1);
                }
                TablaDenuncias.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }      
        return TablaDenuncias;
    }  
}