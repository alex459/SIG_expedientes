/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Controlador.ControladorBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Juridico {
    
private int IDJURIDICO;
private String NOMBREJURIDICO;
private String APELLIDOJURIDICO;
private int cantidad_de_denuncias;
private int cantidad_de_denuncias_que_proceden;
private int cantidad_de_denuncias_que_no_proceden;
private Connection cn;   
private static int IdJuridicoSeleccionado;

/**
     * @return the IdJuridicoSeleccionado
     */
    public static int getIdJuridicoSeleccionado() {
        return IdJuridicoSeleccionado;
    }

    /**
     * @param aIdJuridicoSeleccionado the IdJuridicoSeleccionado to set
     */
    public static void setIdJuridicoSeleccionado(int aIdJuridicoSeleccionado) {
        IdJuridicoSeleccionado = aIdJuridicoSeleccionado;
    }
    
    /**
     * @return the IDJURIDICO
     */
    public int getIDJURIDICO() {
        return IDJURIDICO;
    }

    /**
     * @param IDJURIDICO the IDJURIDICO to set
     */
    public void setIDJURIDICO(int IDJURIDICO) {
        this.IDJURIDICO = IDJURIDICO;
    }

    /**
     * @return the NOMBREJURIDICO
     */
    public String getNOMBREJURIDICO() {
        return NOMBREJURIDICO;
    }

    /**
     * @param NOMBREJURIDICO the NOMBREJURIDICO to set
     */
    public void setNOMBREJURIDICO(String NOMBREJURIDICO) {
        this.NOMBREJURIDICO = NOMBREJURIDICO;
    }

    /**
     * @return the APELLIDOJURIDICO
     */
    public String getAPELLIDOJURIDICO() {
        return APELLIDOJURIDICO;
    }

    /**
     * @param APELLIDOJURIDICO the APELLIDOJURIDICO to set
     */
    public void setAPELLIDOJURIDICO(String APELLIDOJURIDICO) {
        this.APELLIDOJURIDICO = APELLIDOJURIDICO;
    }

    /**
     * @return the cantidad_de_denuncias
     */
    public int getCantidad_de_denuncias() {
        return cantidad_de_denuncias;
    }

    /**
     * @param cantidad_de_denuncias the cantidad_de_denuncias to set
     */
    public void setCantidad_de_denuncias(int cantidad_de_denuncias) {
        this.cantidad_de_denuncias = cantidad_de_denuncias;
    }

    /**
     * @return the cantidad_de_denuncias_que_proceden
     */
    public int getCantidad_de_denuncias_que_proceden() {
        return cantidad_de_denuncias_que_proceden;
    }

    /**
     * @param cantidad_de_denuncias_que_proceden the cantidad_de_denuncias_que_proceden to set
     */
    public void setCantidad_de_denuncias_que_proceden(int cantidad_de_denuncias_que_proceden) {
        this.cantidad_de_denuncias_que_proceden = cantidad_de_denuncias_que_proceden;
    }

    /**
     * @return the cantidad_de_denuncias_que_no_proceden
     */
    public int getCantidad_de_denuncias_que_no_proceden() {
        return cantidad_de_denuncias_que_no_proceden;
    }

    /**
     * @param cantidad_de_denuncias_que_no_proceden the cantidad_de_denuncias_que_no_proceden to set
     */
    public void setCantidad_de_denuncias_que_no_proceden(int cantidad_de_denuncias_que_no_proceden) {
        this.cantidad_de_denuncias_que_no_proceden = cantidad_de_denuncias_que_no_proceden;
    }

    
public TableModel consultarJuridico(int IDJURIDICO, int ANIO){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaAux = new DefaultTableModel();
        try {
        TablaAux.addColumn("IDJURIDICO");
        TablaAux.addColumn("NOMBREJURIDICO");
        TablaAux.addColumn("APELLIDOJURIDICO");
        TablaAux.addColumn("cantidad de denuncias");
        TablaAux.addColumn("cantidad de denuncias que proceden");
        TablaAux.addColumn("cantidad de denuncias que no proceden");
            
            String sql = "select jd.IDJURIDICO,"
                    + " jd.NOMBREJURIDICO,"
                    + " jd.APELLIDOJURIDICO,"
                    + " (select count(*) from EXPEDIENTE e, DETALLEEXPEDIENTE de where e.IDJURIDICO=jd.IDJURIDICO AND e.NUMEROEXPEDIENTE = de.NUMEROEXPEDIENTE AND YEAR (de.FECHADENUNCIA) = "+ANIO+") as 'cantidad de denuncias',"
                    + " (select count(*) from EXPEDIENTE e, DETALLEEXPEDIENTE de where e.IDJURIDICO=jd.IDJURIDICO AND e.IDRESOLUCION in (4,5,6) AND e.NUMEROEXPEDIENTE = de.NUMEROEXPEDIENTE AND YEAR (de.FECHADENUNCIA)="+ANIO+") as 'cantidad de denuncias que proceden',"
                    + " (select count(*) from EXPEDIENTE e, DETALLEEXPEDIENTE de where e.IDJURIDICO=jd.IDJURIDICO AND e.IDRESOLUCION in (1,2,3) AND e.NUMEROEXPEDIENTE = de.NUMEROEXPEDIENTE AND YEAR (de.FECHADENUNCIA)="+ANIO+") as 'cantidad de denuncias que no proceden'"
                    + " from JURIDICO jd"
                    + " where jd.IDJURIDICO="+IDJURIDICO+";";
            
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Object dato[] = new Object[TablaAux.getColumnCount()];//antes era 5
                for (int i = 0; i < TablaAux.getColumnCount(); i++) {
                    dato[i] = rs.getString(i + 1);
                }
                TablaAux.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return TablaAux;
    }
    
      public TableModel consultarJuridico(){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaJuridico = new DefaultTableModel();
        try {
            TablaJuridico.addColumn("IDJURIDICO");
            TablaJuridico.addColumn("NOMBREJURIDIO");
            TablaJuridico.addColumn("APELLIDOJURIDICO");   
            String sql = "SELECT * FROM JURIDICO";
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Object dato[] = new Object[TablaJuridico.getColumnCount()];//antes era 5
                for (int i = 0; i < TablaJuridico.getColumnCount(); i++) {
                    dato[i] = rs.getString(i + 1);
                }
                TablaJuridico.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return TablaJuridico;
    }
    
         
       public ArrayList consultarJuridico(int id){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        ArrayList dato2 = new ArrayList();
        try {           
            String sql = "EXECUTE PerfilDeJuridico "+ id;
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                dato2.add(rs.getString(1));
                dato2.add(rs.getString(2));
                dato2.add(rs.getString(3));
                dato2.add(rs.getString(4));
                dato2.add(rs.getString(5));
   
            }
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return dato2;
    }
         

}
