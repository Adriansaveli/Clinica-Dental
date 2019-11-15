/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 * version 2
 * @author DAW109
 */
public class Intervencion extends Cita{
    
    private String duracion;
    
    
    
    public Intervencion() {
    super();
    }

    public Intervencion(String duracion) {
        this.duracion = duracion;
    }
    
    
    public Intervencion (Intervencion i) {
        
        this.duracion = i.getDuracion();
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Intervencion{" + "duracion=" + duracion + '}';
    }
    
    public String Data () {
        
        return getDuracion();
    }
}
