/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAW109
 */
public class Intervención {
    
    private String Duración;
    //Duración de la intervención, horas, minutos... NO PUEDE TENER VALOR DE CERO
    
    //Constructor por defecto

    public Intervención() {
    }
    
    //Constructor con parámetros

    public Intervención(String Duración) {
        this.Duración = Duración;
    }
    
    //Constructor de copia 
    
    public Intervención (Intervención i){
        
        this.Duración=i.getDuración();
        
    }

    public String getDuración() {
        return Duración;
    }

    public void setDuración(String Duración) {
        this.Duración = Duración;
    }
    
    public String Data () {
        
        return getDuración ();
    }

    @Override
    public String toString() {
        return "Intervenci\u00f3n{" + "Duraci\u00f3n=" + Duración + '}';
    }
    
    
    
    
}
