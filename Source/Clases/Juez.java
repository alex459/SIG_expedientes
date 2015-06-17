
package Clases;

import Controlador.ControladorBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Juez {
private static int IdjueSeleccionado; //global

    /**
     * @return the IdjueSeleccionado
     */
    public static int getIdjueSeleccionado() {
        return IdjueSeleccionado;
    }

    /**
     * @param aIdjueSeleccionado the IdjueSeleccionado to set
     */
    public static void setIdjueSeleccionado(int aIdjueSeleccionado) {
        IdjueSeleccionado = aIdjueSeleccionado;
    }
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

    
public TableModel consultarJuez(){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaJuez = new DefaultTableModel();
        try {
            TablaJuez.addColumn("IDJUEZ");
            TablaJuez.addColumn("IDDEPENDENCIA");
            TablaJuez.addColumn("NOMBREJUEZ");
            TablaJuez.addColumn("APELLIDOJUEZ");
            TablaJuez.addColumn("GENERO");          
            TablaJuez.addColumn("TITULO");          
            String sql = "SELECT * FROM JUEZ";
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Object dato[] = new Object[TablaJuez.getColumnCount()];//antes era 5
                for (int i = 0; i < TablaJuez.getColumnCount(); i++) {
                    dato[i] = rs.getString(i + 1);
                }
                TablaJuez.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return TablaJuez;
    }
    
  public ArrayList consultarJuez(int id){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        ArrayList dato = new ArrayList();
        try {           

            String sql = "EXECUTE PerfilDeJuez "+ id;
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                dato.add(rs.getString(1));
                dato.add(rs.getString(2));
                dato.add(rs.getString(3));
                dato.add(rs.getString(4));
                dato.add(rs.getString(5));
                dato.add(rs.getString(6));
                dato.add(rs.getString(7));
                dato.add(rs.getString(8));
                dato.add(rs.getString(9));
                dato.add(rs.getString(10));
                dato.add(rs.getString(11));
                dato.add(rs.getString(12));
                dato.add(rs.getString(13));
                dato.add(rs.getString(14));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return dato;
    }
    
  public TableModel consultarJuezPorGenero(String genero, int tipoOrden, int Orden){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaJuez = new DefaultTableModel();
        try {
            TablaJuez.addColumn("IDJUEZ");
            TablaJuez.addColumn("NOMBRE");
            TablaJuez.addColumn("APELLIDO");
            TablaJuez.addColumn("DENUNCIAS TOTALES");          
            String sql = "execute JuecesPorGenero 'M',1,1";
            //String sql = "execute JuecesPorGenero "+"'"+genero+"'"+", "+tipoOrden+", "+ Orden;
            //String sql = "SELECT NUMEROEXPEDIENTE, IDJURIDICO, IDJUEZ, IDESTADO FROM EXPEDIENTE";
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Object dato[] = new Object[TablaJuez.getColumnCount()];//antes era 5
                for (int i = 0; i < TablaJuez.getColumnCount(); i++) {
                    dato[i] = rs.getString(i + 1);
                }
                TablaJuez.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return TablaJuez;
    }
  
}
