/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.Date;
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
    
    public Intervencion(Date fecha, char rangoHorario,String hora,boolean estado,String duracion){
        super(fecha,rangoHorario,hora,estado);
        this.duracion = duracion;
    }
    public Intervencion (Intervencion i) {
        super(i);
        this.duracion = i.getDuracion();
    }
    public Intervencion(Cita c, String duracion){
       super(c);
       this.duracion = duracion;
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
