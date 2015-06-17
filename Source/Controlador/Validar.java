

package Controlador;

import javax.swing.JOptionPane;


public class Validar {
    
    public boolean  ValidarTexto(String texto){
    for(int i=0; i<texto.length(); i++){

        if(!(   (texto.codePointAt(i)>=65 && texto.codePointAt(i)<=90) ||
                (texto.codePointAt(i)>=97 && texto.codePointAt(i)<=122) ||         
                 texto.charAt(i)=='Ñ' || texto.charAt(i)=='ñ'
         )){
            return false;
            
        }
    }  
    return true;
    }
    
    public boolean  ValidarAlfanumerico(String texto){
    for(int i=0; i<texto.length(); i++){

        if(!(   (texto.codePointAt(i)>=65 && texto.codePointAt(i)<=90) ||
                (texto.codePointAt(i)>=97 && texto.codePointAt(i)<=122) ||         
                (texto.codePointAt(i)>=48 && texto.codePointAt(i)<=57) ||
                 texto.charAt(i)=='Ñ' || texto.charAt(i)=='ñ'
         )){
            return false;
            
        }
    }  
    return true;
    }
    
        public boolean  ValidarNumerico(String texto){
    for(int i=0; i<texto.length(); i++){

        if(!(   (texto.codePointAt(i)>=48 && texto.codePointAt(i)<=57)
         )){
            return false;
            
        }
    }  
    return true;
    }
    
    
    
}
