package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class ControladorBD {
    private Connection con;
    protected String serverName = "Jbeltran\\sqlexpress";
    protected String tcpip = "49157";
    
    public void AbrirConexion(){
        
        
            try{
                
                serverName = JOptionPane.showInputDialog("Ingrese su ServerName");
                tcpip = JOptionPane.showInputDialog("Ingrese su TCPIP");
                String url = "jdbc:sqlserver://"+serverName+":"+tcpip+";database=Expedientes;integratedSecurity=true;";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                con = DriverManager.getConnection(url);
                JOptionPane.showMessageDialog(null, "Conexion con la base de datos establecida");
                
                //String url = "jdbc:sqlserver://Jbeltran\\sqlexpress:49157;database=Expedientes;integratedSecurity=true;";
                //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                //con = DriverManager.getConnection(url);
                //System.out.println("Conexion a la BD");
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ERRROR: "+e.getMessage());
            }
        
    }
    
}
