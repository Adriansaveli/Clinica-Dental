/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAW109
 */
public class Tratamiento {
 
    
    private String Identificador;
    //Identificador del tratamiento relacionado con el paciente TIENE QUE TENER VALOR MAYOR A CERO
    private String Nombre;
    //Nombre del tratamiento Ej; Endodoncia... 
    private String fechaInicio;
    //Fecha de inicio del tratamiento pueden ser tratamientos de semanas... TIENE QUE TENER FORMATO DIA/MES/AÑO
    private boolean Consentimiento;
    // Consentimiento del paciente al ser solo acepto o no se pone un boolean, OLO SE ACEPTAN VALORES DE VERDADERO (ACEPTA Y FALSO (NO ACEPTA)
    
    //Constructor por defecto

    public Tratamiento() {
    }
    
    // Constructor con parámetros

    public Tratamiento(String Identificador, String Nombre, String fechaInicio, boolean Consentimiento) {
        this.Identificador = Identificador;
        this.Nombre = Nombre;
        this.fechaInicio = fechaInicio;
        this.Consentimiento = Consentimiento;
    }
    
    //Constructor de copia
    
    public Tratamiento (Tratamiento t) {
        
        this.Identificador= t.getIdentificador();
        this.Nombre=t.getNombre();
        this.Consentimiento=t.isConsentimiento();
        this.fechaInicio=t.getFechaInicio();
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public boolean isConsentimiento() {
        return Consentimiento;
    }

    public void setConsentimiento(boolean Consentimiento) {
        this.Consentimiento = Consentimiento;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "Identificador=" + Identificador + ", Nombre=" + Nombre + ", fechaInicio=" + fechaInicio + ", Consentimiento=" + Consentimiento + '}';
    }
    
    public String Data () {
        
        return getIdentificador ()+ " | " + getNombre () + " | " + getFechaInicio () + " | " + isConsentimiento ();
        
    }
    
    
}

