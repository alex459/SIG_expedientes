

package Clases;

import Controlador.ControladorBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class RendimientoDepartamento {
    
 private Connection cn;       
  
    
    
    public TableModel consultarRendimientoDepartamentoPorAnio(int anio){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel tbl = new DefaultTableModel();
        try {
            tbl.addColumn("Año");
            tbl.addColumn("Denuncias Totales");
            tbl.addColumn("Denuncias omitidas");
            tbl.addColumn("Denuncias admitidas");
            tbl.addColumn("Denuncias exoneradas");         
            tbl.addColumn("Denuncias con amonestacion");
            tbl.addColumn("Denuncias con suspencion");
            tbl.addColumn("Denuncias con remocion");         
            tbl.addColumn("Denuncias vencidas");         
            tbl.addColumn("Denuncias envidas a tiempo");         
            tbl.addColumn("Rendimiento del departamento");         
            String sql = "exec rendimientoDepartamento "+anio+";";
            PreparedStatement cmd = cn.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            while (rs.next()) {
                Object dato[] = new Object[tbl.getColumnCount()];//antes era 5
                for (int i = 0; i < tbl.getColumnCount(); i++) {
                    dato[i] = rs.getString(i + 1);
                }
                tbl.addRow(dato);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return tbl;
    }  
    
    
    
    
    
    
}
