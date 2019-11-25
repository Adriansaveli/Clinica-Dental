/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.ArrayList;
/**
 * version 2
 * @author DAW109
 */
public class Tratamiento {
 
    Informe informe;
    protected long id;
    //Identificador del tratamiento relacionado con el paciente TIENE QUE TENER VALOR MAYOR A CERO
    private String nombre;
    //Nombre del tratamiento Ej; Endodoncia... 
    private String fechaInicio;
    //Fecha de inicio del tratamiento pueden ser tratamientos de semanas... TIENE QUE TENER FORMATO DIA/MES/AÑO
    private boolean consentimiento;
    // Consentimiento del paciente al ser solo acepto o no se pone un boolean, OLO SE ACEPTAN VALORES DE VERDADERO (ACEPTA Y FALSO (NO ACEPTA)

    public Tratamiento() {
    }

    public Tratamiento(long id, String nombre, String fechaInicio, boolean consentimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.consentimiento = consentimiento;
    }
    
    public Tratamiento (Tratamiento t) {
        this.id = t.getId ();
        this.nombre = t.getNombre();
        this.fechaInicio = t.getFechaInicio();
        this.consentimiento = t.isConsentimiento();
       
    }

    public long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public boolean isConsentimiento() {
        return consentimiento;
    }

    public void setConsentimiento(boolean consentimiento) {
        this.consentimiento = consentimiento;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "idTratamiento=" + id + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", consentimiento=" + consentimiento + '}';
    }
     
    public String Data (){
     return getId() + " | " + getNombre() + " | " + getFechaInicio() + " | " + isConsentimiento ();
    }
    
    public ArrayList<Tratamiento> getAllTratamiento (){
    ArrayList <Tratamiento> tratamientos = new ArrayList <Tratamiento>();
    return tratamientos ;
    }
    
    public Tratamiento getTratamientoById (long id){
        Tratamiento t = new Tratamiento();
         return t;
    }
 
    
}

