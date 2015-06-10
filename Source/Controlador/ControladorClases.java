package Controlador;

import Interfaces.LoginUser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class ControladorClases {
    
    
        public void AbrirLogin(){
           LoginUser Lgu = new LoginUser();
            Lgu.setVisible(true);
            Lgu.setLocationRelativeTo(null);
        }
        
        public void Cerrar(){
           System.exit(0);
        }
        
    
}
