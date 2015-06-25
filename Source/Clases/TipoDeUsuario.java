/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Controlador.ControladorBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author jbeltran2
 */
public class TipoDeUsuario {
  
  int idtipousuario;
  String descripciontipousuario;
  Connection cn;   
  
public TipoDeUsuario()  {
     ControladorBD con = new ControladorBD();
     cn = con.AbrirConexion();
}
/*  
public void TipoDeUsuario(int idtipousuario, String descripciontipousuario){
    //this.idtipousuario = idtipousuario;
    this.descripciontipousuario = descripciontipousuario;
}*/
    /**
     * @return the idtipousuario
     */
    public int getIdtipousuario() {
        return idtipousuario;
    }

    /**
     * @param idtipousuario the idtipousuario to set
     */
    public void setIdtipousuario(int idtipousuario) {
        this.idtipousuario = idtipousuario;
    }

    /**
     * @return the descripciontipousuario
     */
    public String getDescripciontipousuario() {
        return descripciontipousuario;
    }

    /**
     * @param descripciontipousuario the descripciontipousuario to set
     */
    public void setDescripciontipousuario(String descripciontipousuario) {
        this.descripciontipousuario = descripciontipousuario;
    }
  
    public boolean NuevoTipoDeUsuario(){
        boolean resp = false;
        try{
            String sql = "INSERT INTO TIPODEUSUARIO(DESCRIPCIONTIPOUSUARIO) VALUES(?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            cmd.setString(1,descripciontipousuario);
            if(!cmd.execute()){
                resp = true;
            }
            cmd.close();
            cn.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
     return resp;
    }
    
       public TableModel ConsultaTipoUsuario(String f1, String f2){
        ControladorBD con = new ControladorBD();
        cn = con.AbrirConexion();
        DefaultTableModel TablaTipo = new DefaultTableModel();
        try {
            TablaTipo.addColumn("IdTipo");    
            TablaTipo.addColumn("Descripcion");
            TablaTipo.addColumn("Privilegio");
            
            String sql = "SELECT * FROM TIPODEUSUARIO ";
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
        
        
        
        return TablaTipo;
       }
}
