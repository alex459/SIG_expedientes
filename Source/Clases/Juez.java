
package Clases;

import Controlador.ControladorBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Juez {
private int IDJUEZ;
private String JUEZ;
private String GENERO;
private int IDDEPENDENCIA;
private String NOMBREDEPENDENCIA;
private String MUNICIPIO;
private String DEPARTAMENTO;
private int Denuncias_totales;
private int Denuncias_omitidas;
private int Denuncias_admitidas;
private int Denuncias_con_exoneracion;
private int Denuncias_con_amonestacion;
private int Denuncias_con_suspencion;
private int Denuncias_con_remocion;
private Connection cn;   
private String[][] elementos;

    /**
     * @return the IDJUEZ
     */
    public int getIDJUEZ() {
        return IDJUEZ;
    }

    /**
     * @param IDJUEZ the IDJUEZ to set
     */
    public void setIDJUEZ(int IDJUEZ) {
        this.IDJUEZ = IDJUEZ;
    }

    /**
     * @return the JUEZ
     */
    public String getJUEZ() {
        return JUEZ;
    }

    /**
     * @param JUEZ the JUEZ to set
     */
    public void setJUEZ(String JUEZ) {
        this.JUEZ = JUEZ;
    }

    /**
     * @return the GENERO
     */
    public String getGENERO() {
        return GENERO;
    }

    /**
     * @param GENERO the GENERO to set
     */
    public void setGENERO(String GENERO) {
        this.GENERO = GENERO;
    }

    /**
     * @return the IDDEPENDENCIA
     */
    public int getIDDEPENDENCIA() {
        return IDDEPENDENCIA;
    }

    /**
     * @param IDDEPENDENCIA the IDDEPENDENCIA to set
     */
    public void setIDDEPENDENCIA(int IDDEPENDENCIA) {
        this.IDDEPENDENCIA = IDDEPENDENCIA;
    }

    /**
     * @return the NOMBREDEPENDENCIA
     */
    public String getNOMBREDEPENDENCIA() {
        return NOMBREDEPENDENCIA;
    }

    /**
     * @param NOMBREDEPENDENCIA the NOMBREDEPENDENCIA to set
     */
    public void setNOMBREDEPENDENCIA(String NOMBREDEPENDENCIA) {
        this.NOMBREDEPENDENCIA = NOMBREDEPENDENCIA;
    }

    /**
     * @return the MUNICIPIO
     */
    public String getMUNICIPIO() {
        return MUNICIPIO;
    }

    /**
     * @param MUNICIPIO the MUNICIPIO to set
     */
    public void setMUNICIPIO(String MUNICIPIO) {
        this.MUNICIPIO = MUNICIPIO;
    }

    /**
     * @return the DEPARTAMENTO
     */
    public String getDEPARTAMENTO() {
        return DEPARTAMENTO;
    }

    /**
     * @param DEPARTAMENTO the DEPARTAMENTO to set
     */
    public void setDEPARTAMENTO(String DEPARTAMENTO) {
        this.DEPARTAMENTO = DEPARTAMENTO;
    }

    /**
     * @return the Denuncias_totales
     */
    public int getDenuncias_totales() {
        return Denuncias_totales;
    }

    /**
     * @param Denuncias_totales the Denuncias_totales to set
     */
    public void setDenuncias_totales(int Denuncias_totales) {
        this.Denuncias_totales = Denuncias_totales;
    }

    /**
     * @return the Denuncias_omitidas
     */
    public int getDenuncias_omitidas() {
        return Denuncias_omitidas;
    }

    /**
     * @param Denuncias_omitidas the Denuncias_omitidas to set
     */
    public void setDenuncias_omitidas(int Denuncias_omitidas) {
        this.Denuncias_omitidas = Denuncias_omitidas;
    }

    /**
     * @return the Denuncias_admitidas
     */
    public int getDenuncias_admitidas() {
        return Denuncias_admitidas;
    }

    /**
     * @param Denuncias_admitidas the Denuncias_admitidas to set
     */
    public void setDenuncias_admitidas(int Denuncias_admitidas) {
        this.Denuncias_admitidas = Denuncias_admitidas;
    }

    /**
     * @return the Denuncias_con_exoneracion
     */
    public int getDenuncias_con_exoneracion() {
        return Denuncias_con_exoneracion;
    }

    /**
     * @param Denuncias_con_exoneracion the Denuncias_con_exoneracion to set
     */
    public void setDenuncias_con_exoneracion(int Denuncias_con_exoneracion) {
        this.Denuncias_con_exoneracion = Denuncias_con_exoneracion;
    }

    /**
     * @return the Denuncias_con_amonestacion
     */
    public int getDenuncias_con_amonestacion() {
        return Denuncias_con_amonestacion;
    }

    /**
     * @param Denuncias_con_amonestacion the Denuncias_con_amonestacion to set
     */
    public void setDenuncias_con_amonestacion(int Denuncias_con_amonestacion) {
        this.Denuncias_con_amonestacion = Denuncias_con_amonestacion;
    }

    /**
     * @return the Denuncias_con_suspencion
     */
    public int getDenuncias_con_suspencion() {
        return Denuncias_con_suspencion;
    }

    /**
     * @param Denuncias_con_suspencion the Denuncias_con_suspencion to set
     */
    public void setDenuncias_con_suspencion(int Denuncias_con_suspencion) {
        this.Denuncias_con_suspencion = Denuncias_con_suspencion;
    }

    /**
     * @return the Denuncias_con_remocion
     */
    public int getDenuncias_con_remocion() {
        return Denuncias_con_remocion;
    }

    /**
     * @param Denuncias_con_remocion the Denuncias_con_remocion to set
     */
    public void setDenuncias_con_remocion(int Denuncias_con_remocion) {
        this.Denuncias_con_remocion = Denuncias_con_remocion;
    }

    
public TableModel consultarJuez(int IDJUEZ){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaAux = new DefaultTableModel();
        try {
            TablaAux.addColumn("IDJUEZ");
            TablaAux.addColumn("JUEZ");
            TablaAux.addColumn("GENERO");
            TablaAux.addColumn("IDDEPENDENCIA");
            TablaAux.addColumn("NOMBREDEPENDENCIA");
            TablaAux.addColumn("MUNICIPIO");
            TablaAux.addColumn("DEPARTAMENTO");
            TablaAux.addColumn("Denuncias_totales");
            TablaAux.addColumn("Denuncias_omitidas");
            TablaAux.addColumn("Denuncias_admitidas");
            TablaAux.addColumn("Denuncias_con_exoneracion");
            TablaAux.addColumn("Denuncias_con_amonestacion");
            TablaAux.addColumn("Denuncias_con_suspencion");
            TablaAux.addColumn("Denuncias_con_remocion");
            
            String sql = "select j.IDJUEZ,"
                    + " j.TITULO+'. '+j.NOMBREJUEZ+' '+j.APELLIDOJUEZ AS 'JUEZ',"
                    + " j.GENERO,"
                    + " dc.IDDEPENDENCIA,"
                    + " dc.NOMBREDEPENDENCIA,"
                    + " MUNICIPIO, DEPARTAMENTO,"
                    + " (select count(*) from EXPEDIENTE s1, JUEZ j1 where s1.IDJUEZ=j1.IDJUEZ AND j1.IDJUEZ=j.IDJUEZ) as 'Denuncias totales',"
                    + " (select count(*) from EXPEDIENTE s1, JUEZ j1 where s1.IDJUEZ=j1.IDJUEZ AND j1.IDJUEZ=j.IDJUEZ AND IDRESOLUCION=1) as 'Denuncias omitidas',"
                    + " (select count(*) from EXPEDIENTE s1, JUEZ j1 where s1.IDJUEZ=j1.IDJUEZ AND j1.IDJUEZ=j.IDJUEZ AND IDRESOLUCION=2) as 'Denuncias admitidas',"
                    + " (select count(*) from EXPEDIENTE s1, JUEZ j1 where s1.IDJUEZ=j1.IDJUEZ AND j1.IDJUEZ=j.IDJUEZ AND IDRESOLUCION=3) as 'Denuncias con exoneracion',"
                    + " (select count(*) from EXPEDIENTE s1, JUEZ j1 where s1.IDJUEZ=j1.IDJUEZ AND j1.IDJUEZ=j.IDJUEZ AND IDRESOLUCION=4) as 'Denuncias con amonestacion',"
                    + " (select count(*) from EXPEDIENTE s1, JUEZ j1 where s1.IDJUEZ=j1.IDJUEZ AND j1.IDJUEZ=j.IDJUEZ AND IDRESOLUCION=5) as 'Denuncias con suspencion',"
                    + " (select count(*) from EXPEDIENTE s1, JUEZ j1 where s1.IDJUEZ=j1.IDJUEZ AND j1.IDJUEZ=j.IDJUEZ AND IDRESOLUCION=6) as 'Denuncias con remocion'"
                    + " from JUEZ j,"
                    + " DEPENDENCIA dc,"
                    + " MUNICIPIO m,"
                    + " DEPARTAMENTO d"
                    + " where j.IDJUEZ="+IDJUEZ+" AND j.IDDEPENDENCIA=dc.IDDEPENDENCIA"
                    + " AND dc.IDMUNICIPIO=m.IDMUNICIPIO AND m.IDDEPARTAMENTO=d.IDDEPARTAMENTO;";
            
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
    
}
