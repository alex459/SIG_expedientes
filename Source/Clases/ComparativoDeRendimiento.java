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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hitachi
 */
public class ComparativoDeRendimiento {
    
    private Connection cn;   
    private String[][] elementos;
    
    public TableModel consultarRendimientoComparativo(int ANIO){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaAux = new DefaultTableModel();
        try {
        TablaAux.addColumn("ID JURIDICO");
        TablaAux.addColumn("NOMBRE JURIDICO");
        TablaAux.addColumn("APELLIDO JURIDICO");
        TablaAux.addColumn("Año");
        TablaAux.addColumn("cantidad de expedientes");
        TablaAux.addColumn("cantidad de expedientes enviados a tiempo");
        TablaAux.addColumn("cantidad de expedientes vencidos");
        TablaAux.addColumn("Coeficiente de rendimiento");
            
        String sql = "select jd.IDJURIDICO, jd.NOMBREJURIDICO, jd.APELLIDOJURIDICO, '"+ANIO+"' as AÑO, (select count(*) from EXPEDIENTE e,DETALLEEXPEDIENTE de where e.NUMEROEXPEDIENTE=de.NUMEROEXPEDIENTE AND e.IDJURIDICO=jd.IDJURIDICO AND YEAR (de.FECHADENUNCIA)="+ANIO+" ) as 'cantidad de denuncias', (select count(*) from EXPEDIENTE e,DETALLEEXPEDIENTE de where e.NUMEROEXPEDIENTE=de.NUMEROEXPEDIENTE AND de.DIASHABILES>0 AND e.IDJURIDICO=jd.IDJURIDICO AND YEAR (de.FECHADENUNCIA)="+ANIO+") as 'expediente enviados a tiempo', (select count(*) from EXPEDIENTE e,DETALLEEXPEDIENTE de where e.NUMEROEXPEDIENTE=de.NUMEROEXPEDIENTE AND de.DIASHABILES=0 AND e.IDJURIDICO=jd.IDJURIDICO AND YEAR (de.FECHADENUNCIA)="+ANIO+") as 'expediente vencido', Convert(Decimal(15,2), ( CAST ( (select count(*) from EXPEDIENTE e,DETALLEEXPEDIENTE de where e.NUMEROEXPEDIENTE=de.NUMEROEXPEDIENTE AND de.DIASHABILES>0 AND e.IDJURIDICO=jd.IDJURIDICO AND YEAR (de.FECHADENUNCIA)="+ANIO+") AS NUMERIC(15,4) ) / CAST ( (((select count(*) from EXPEDIENTE e,DETALLEEXPEDIENTE de where e.NUMEROEXPEDIENTE=de.NUMEROEXPEDIENTE AND de.DIASHABILES>0 AND e.IDJURIDICO=jd.IDJURIDICO AND YEAR (de.FECHADENUNCIA)="+ANIO+")+(select count(*) from EXPEDIENTE e,DETALLEEXPEDIENTE de where e.NUMEROEXPEDIENTE=de.NUMEROEXPEDIENTE AND de.DIASHABILES=0 AND e.IDJURIDICO=jd.IDJURIDICO AND YEAR (de.FECHADENUNCIA)="+ANIO+"))) AS NUMERIC(15,4) )	)) as 'Coeficiente de rendimiento' from JURIDICO jd;";
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
