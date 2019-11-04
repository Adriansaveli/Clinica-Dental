/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * version 2
 * @author DAW109
 */
public class Tratamiento {
 
    
    protected long idTratamiento;
    //Identificador del tratamiento relacionado con el paciente TIENE QUE TENER VALOR MAYOR A CERO
    private String nombre;
    //Nombre del tratamiento Ej; Endodoncia... 
    private String fechaInicio;
    //Fecha de inicio del tratamiento pueden ser tratamientos de semanas... TIENE QUE TENER FORMATO DIA/MES/AÑO
    private boolean consentimiento;
    // Consentimiento del paciente al ser solo acepto o no se pone un boolean, OLO SE ACEPTAN VALORES DE VERDADERO (ACEPTA Y FALSO (NO ACEPTA)

    public Tratamiento() {
    }

    public Tratamiento(long idTratamiento, String nombre, String fechaInicio, boolean consentimiento) {
        this.idTratamiento = idTratamiento;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.consentimiento = consentimiento;
    }
    
    public Tratamiento (Tratamiento t) {
        this.idTratamiento = t.getIdTratamiento ();
        this.nombre = t.getNombre();
        this.fechaInicio = t.getFechaInicio();
        this.consentimiento = t.isConsentimiento();
       
    }

    public long getIdTratamiento() {
        return idTratamiento;
    }

    /**
     *
     * @param idTratamiento
     */
    public void setIdTratamiento(long idTratamiento) {
        this.idTratamiento = idTratamiento;
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
        return "Tratamiento{" + "idTratamiento=" + idTratamiento + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", consentimiento=" + consentimiento + '}';
    }
     
 public String Data (){
     return getIdTratamiento() + " | " + getNombre() + " | " + getFechaInicio() + " | " + isConsentimiento ();
 }

    
}

