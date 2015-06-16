

package Controlador;


public class Validar {
    
    public boolean  ValidarTexto(String texto){
    for(int i=0; i<texto.length(); i++){
        if(!Character.toString(texto.charAt(i)).contains("ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz")){
            return false;
            
        }
    }
        
    return true;
    }
    
}
