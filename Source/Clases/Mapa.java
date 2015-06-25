

package Clases;

import Controlador.ControladorBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class Mapa {
    
    private Connection cn; 
    
     public TableModel consultarDenunciasPorDepartamento(String f1, String f2){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaJuez = new DefaultTableModel();
        try {
            TablaJuez.addColumn("departamento");    
            TablaJuez.addColumn("denuncias");
            TablaJuez.addColumn("jueces");
            TablaJuez.addColumn("denuncias omitidas");
            TablaJuez.addColumn("denuncias admitidas");
            TablaJuez.addColumn("otras denuncias");
                  
            //String sql = "execute JuecesPorGenero 'M',1,1";
            String sql = "select DEPARTAMENTO,\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and de1.FECHADENUNCIA between '"+f1+"' AND '"+f2+"' ) as 'denuncias totales',\n" +
"(select count(DISTINCT(e1.IDJUEZ)) from expediente e1, juez j1, detalleexpediente de1, municipio m1, departamento d1 where e1.IDJUEZ = j1.IDJUEZ AND e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE AND e1.IDMUNICIPIO = m1.IDMUNICIPIO AND m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO AND de1.FECHADENUNCIA between '"+f1+"' AND '"+f2+"' AND d1.DEPARTAMENTO = d.DEPARTAMENTO) as 'Jueces denunciados',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and de1.FECHADENUNCIA between '"+f1+"' AND '"+f2+"' and e1.IDRESOLUCION = 1 ) as 'denuncias admitidas',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and de1.FECHADENUNCIA between '"+f1+"' AND '"+f2+"' and e1.IDRESOLUCION = 2 ) as 'denuncias admitidas',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and de1.FECHADENUNCIA between '"+f1+"' AND '"+f2+"' and e1.IDRESOLUCION in (3,4,5,6) ) as 'otras resoluciones'\n" +
"from departamento d;  ";
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
            System.out.println( "Error: " + e);
        }

        return TablaJuez;
    }
     
     public TableModel consultarDenunciasPorDepartamento(String d, String f1, String f2){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaJuez = new DefaultTableModel();
        try {
            TablaJuez.addColumn("departamento");    
            TablaJuez.addColumn("denuncias");
            TablaJuez.addColumn("jueces");
            TablaJuez.addColumn("denuncias omitidas");
            TablaJuez.addColumn("denuncias admitidas");
            TablaJuez.addColumn("otras denuncias");
                  
            //String sql = "execute JuecesPorGenero 'M',1,1";
            String sql = "select DEPARTAMENTO,\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO AND de1.FECHADENUNCIA BETWEEN '"+f1+"' AND '"+f2+"') as 'denuncias totales',\n" +
"(select count(DISTINCT(e1.IDJUEZ)) from expediente e1, juez j1, detalleexpediente de1, municipio m1, departamento d1 where e1.IDJUEZ = j1.IDJUEZ AND e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE AND e1.IDMUNICIPIO = m1.IDMUNICIPIO AND m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO AND d1.DEPARTAMENTO = d.DEPARTAMENTO AND de1.FECHADENUNCIA BETWEEN '"+f1+"' AND '"+f2+"') as 'Jueces denunciados',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and e1.IDRESOLUCION = 1  AND de1.FECHADENUNCIA BETWEEN '"+f1+"' AND '"+f2+"') as 'denuncias admitidas',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and e1.IDRESOLUCION = 2  AND de1.FECHADENUNCIA BETWEEN '"+f1+"' AND '"+f2+"') as 'denuncias admitidas',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and e1.IDRESOLUCION in (3,4,5,6)  AND de1.FECHADENUNCIA BETWEEN '"+f1+"' AND '"+f2+"') as 'otras resoluciones'\n" +
"from departamento d where d.DEPARTAMENTO = '"+d+"';";
            System.out.println(sql);
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
            System.out.println( "Error: " + e);
        }

        return TablaJuez;
    }
     
     
     
      public TableModel consultarDenunciasPorDepartamentoTotal(){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaJuez = new DefaultTableModel();
        try {
            TablaJuez.addColumn("departamento");    
            TablaJuez.addColumn("denuncias");
            TablaJuez.addColumn("jueces");
            TablaJuez.addColumn("denuncias omitidas");
            TablaJuez.addColumn("denuncias admitidas");
            TablaJuez.addColumn("otras denuncias");
                  
            //String sql = "execute JuecesPorGenero 'M',1,1";
            String sql = "select DEPARTAMENTO,\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO ) as 'denuncias totales',\n" +
"(select count(DISTINCT(e1.IDJUEZ)) from expediente e1, juez j1, detalleexpediente de1, municipio m1, departamento d1 where e1.IDJUEZ = j1.IDJUEZ AND e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE AND e1.IDMUNICIPIO = m1.IDMUNICIPIO AND m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO AND d1.DEPARTAMENTO = d.DEPARTAMENTO) as 'Jueces denunciados',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and e1.IDRESOLUCION = 1 ) as 'denuncias admitidas',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and e1.IDRESOLUCION = 2 ) as 'denuncias admitidas',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and e1.IDRESOLUCION in (3,4,5,6) ) as 'otras resoluciones'\n" +
"from departamento d;  ";
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
            System.out.println( "Error: " + e);
        }

        return TablaJuez;
    }
      
      
      public TableModel consultarDenunciasPorDepartamentoTotal(String d){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaJuez = new DefaultTableModel();
        try {
            TablaJuez.addColumn("departamento");    
            TablaJuez.addColumn("denuncias");
            TablaJuez.addColumn("jueces");
            TablaJuez.addColumn("denuncias omitidas");
            TablaJuez.addColumn("denuncias admitidas");
            TablaJuez.addColumn("otras denuncias");
                  
            //String sql = "execute JuecesPorGenero 'M',1,1";
            String sql = "select DEPARTAMENTO,\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO ) as 'denuncias totales',\n" +
"(select count(DISTINCT(e1.IDJUEZ)) from expediente e1, juez j1, detalleexpediente de1, municipio m1, departamento d1 where e1.IDJUEZ = j1.IDJUEZ AND e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE AND e1.IDMUNICIPIO = m1.IDMUNICIPIO AND m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO AND d1.DEPARTAMENTO = d.DEPARTAMENTO) as 'Jueces denunciados',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and e1.IDRESOLUCION = 1 ) as 'denuncias admitidas',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and e1.IDRESOLUCION = 2 ) as 'denuncias admitidas',\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and e1.IDRESOLUCION in (3,4,5,6) ) as 'otras resoluciones'\n" +
"from departamento d\n" +
"where d.departamento = '"+d+"';  ";
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
            System.out.println( "Error: " + e);
        }

        return TablaJuez;
    }
      
      
      
      public TableModel consultarDepartamentos(){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaJuez = new DefaultTableModel();
        try {
            TablaJuez.addColumn("ID DEPARTAMENTO");    
            TablaJuez.addColumn("DEPARTAMENTO");
                  
            //String sql = "execute JuecesPorGenero 'M',1,1";
            String sql = "select * from departamento order by IDDEPARTAMENTO";
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
            System.out.println( "Error: " + e);
        }

        return TablaJuez;
    }
      
    
      
    public TableModel consultarDenunciasPorMunicipio(int d, String f1, String f2){
        
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaJuez = new DefaultTableModel();
        try {
            TablaJuez.addColumn("departamento");    
            TablaJuez.addColumn("municipio"); 
            TablaJuez.addColumn("denuncias");
            TablaJuez.addColumn("jueces");
                  
            //String sql = "execute JuecesPorGenero 'M',1,1";
            String sql = "select DEPARTAMENTO,\n" +
"	   Municipio,\n" +
"(select count(*) from expediente e1, detalleexpediente de1, municipio m1, departamento d1 where e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE and e1.IDMUNICIPIO = m1.IDMUNICIPIO and m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO and d1.DEPARTAMENTO = d.DEPARTAMENTO and de1.FECHADENUNCIA between '"+f1+"' AND '"+f2+"' and m1.IDMUNICIPIO = m.IDMUNICIPIO) as 'denuncias totales',\n" +
"(select count(DISTINCT(e1.IDJUEZ)) from expediente e1, juez j1, detalleexpediente de1, municipio m1, departamento d1 where e1.IDJUEZ = j1.IDJUEZ AND e1.NUMEROEXPEDIENTE = de1.NUMEROEXPEDIENTE AND e1.IDMUNICIPIO = m1.IDMUNICIPIO AND m1.IDDEPARTAMENTO = d1.IDDEPARTAMENTO AND de1.FECHADENUNCIA between '"+f1+"' AND '"+f2+"' AND d1.DEPARTAMENTO = d.DEPARTAMENTO and m1.IDMUNICIPIO = m.IDMUNICIPIO) as 'Jueces denunciados'\n" +
"from departamento d, municipio m\n" +
"WHERE m.IDDEPARTAMENTO = d.IDDEPARTAMENTO\n" +
"AND d.IDDEPARTAMENTO="+d+1+";";
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
            System.out.println( "Error: " + e);
        }

        return TablaJuez;
    }
      
    
    
}
