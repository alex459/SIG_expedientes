package Controlador;

import Interfaces.ICantidadDeAsignaciones;
import Interfaces.ICantidadDeDenunciasPorJuez;
import Interfaces.ICantidadDeDiasExpedientes;
import Interfaces.ICantidadDeJuecesPorGenero;
import Interfaces.IComparativoDeRendimiento;
import Interfaces.IExpedientesQueVenceran;
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
           LoginUser abrir = new LoginUser();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
        }
        
        public void AbrirCantidadDeDiasExpedientes(){
            ICantidadDeDiasExpedientes abrir = new ICantidadDeDiasExpedientes();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
        }
        
        public void AbrirCantidadDeDenunciasPorJuez(){
            ICantidadDeDenunciasPorJuez abrir = new ICantidadDeDenunciasPorJuez();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
        }
        
        public void AbrirCantidadDeJuecesPorGenero(){
           ICantidadDeJuecesPorGenero abrir = new ICantidadDeJuecesPorGenero();
           abrir.setVisible(true);
           abrir.setLocationRelativeTo(null);
        }
        
        public void AbrirCantidadDeAsignaciones(){
           ICantidadDeAsignaciones abrir = new ICantidadDeAsignaciones();
           abrir.setVisible(true);
           abrir.setLocationRelativeTo(null);
        }
        
        public void AbrirExpedientesQueVenceran(){
            IExpedientesQueVenceran abrir = new IExpedientesQueVenceran();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
        }
        
        public void AbrirComparativoDeRendimiento(){
            IComparativoDeRendimiento abrir = new IComparativoDeRendimiento();
            abrir.setVisible(true);
            abrir.setLocationRelativeTo(null);
        }
        
        
        public void Cerrar(){
           System.exit(0);
        }
        
    
}
