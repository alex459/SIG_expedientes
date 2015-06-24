

package Controlador;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        
    public boolean validarFecha2MayorQueFecha1(Date f1, Date f2){
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        boolean validarFechas=false;
        float anio1=Float.parseFloat(f.format(f1).toString().substring(0, 4));
        float anio2=Float.parseFloat(f.format(f2).toString().substring(0, 4));
        float mes1=Float.parseFloat(f.format(f1).toString().substring(5, 7));
        float mes2=Float.parseFloat(f.format(f2).toString().substring(5, 7));
        float dia1=Float.parseFloat(f.format(f1).toString().substring(8, 10));
        float dia2=Float.parseFloat(f.format(f2).toString().substring(8, 10));
        
        
        if((anio1*3)+(mes1*2)+dia1 < (anio2*3)+(mes2*2)+dia2)
            return true;
        else
            return false;
        
        
        
    }
    
    
    
}
