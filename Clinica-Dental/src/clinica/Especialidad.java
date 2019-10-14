/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAW109
 */
public class Especialidad {
    
    private String Nombre;
    //Nombre de la especialidad ej; endodoncista, esta relacionada con cirujía ES OBLIGATORIO TENER UNA CADENA DE CARACTERES
    private String Identificador;
    // Identificador de la especialidad, puede ser SA125 por eso es un String, NO PUEDE SER VALOR 0
    
    //Constructor por defecto 

    public Especialidad() {
    }
    
    //Constructor con parámetros

    public Especialidad(String Nombre, String Identificador) {
        this.Nombre = Nombre;
        this.Identificador = Identificador;
    }
    
    //Constructor de copia
    
    public Especialidad (Especialidad e){
        
        this.Nombre=e.getNombre();
        this.Identificador=e.getIdentificador();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }
    
    
    public String Data (){
        
        return getNombre() + " | " + getIdentificador();
    }

    @Override
    public String toString() {
        return "Especialidad{" + "Nombre=" + Nombre + ", Identificador=" + Identificador + '}';
    }
    
    
    
    
}
