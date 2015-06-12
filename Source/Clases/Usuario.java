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

/**
 *
 * @author Kevin
 */
public class Usuario {
 private int idusuario;
 private int idtipousuario;
 private String nombreusuario;
 private String clave;
 private int estadousuario;   
 private Connection cn;   
 
 public Usuario(){
     
     ControladorBD con = new ControladorBD();
     cn = con.AbrirConexion();
 }
 
 /*
 public void Usuario(int idusuario, int idtipousuario, String nombreusuario, String clave, int estadousuario){
  this.idusuario = idusuario;
  this.idtipousuario = idtipousuario;
  this.nombreusuario = nombreusuario;
  this.clave = clave;
  this.estadousuario = estadousuario;
 }*/

    /**
     * @return the idusuario
     */
    public int getIdusuario() {
        return idusuario;
    }

    /**
     * @param idusuario the idusuario to set
     */
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

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
     * @return the nombreusuario
     */
    public String getNombreusuario() {
        return nombreusuario;
    }

    /**
     * @param nombreusuario the nombreusuario to set
     */
    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the estadousuario
     */
    public int getEstadousuario() {
        return estadousuario;
    }

    /**
     * @param estadousuario the estadousuario to set
     */
    public void setEstadousuario(int estadousuario) {
        this.estadousuario = estadousuario;
    }
    
    public boolean NuevoUsuario(){
        boolean resp = false;
        try{
            String sql = "INSERT INTO USUARIO(IDTIPOUSUARIO, NOMBREUSUARIO, CLAVE, ESTADOUSUARIO) VALUES(? ,? ,? ,?)";
            PreparedStatement cmd = cn.prepareStatement(sql);
            //cmd.setInt(1,idusuario);
            cmd.setInt(1,idtipousuario);
            cmd.setString(2,nombreusuario);
            cmd.setString(3,clave);
            cmd.setInt(4,estadousuario);
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
}
