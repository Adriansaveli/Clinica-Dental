/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * verison 2
 * @author DAW109
 */
public class Especialidad {
    
    private String nombre;
    //Nombre de la especialidad ej; endodoncista, esta relacionada con cirujía ES OBLIGATORIO TENER UNA CADENA DE CARACTERES
    private String idEspecialidad;
    // Identificador de la especialidad, puede ser SA125 por eso es un String, NO PUEDE SER VALOR 0

    public Especialidad() {
    }

    public Especialidad(String nombre, String idEspecialidad) {
        this.nombre = nombre;
        this.idEspecialidad = idEspecialidad;
    }
    
  public Especialidad (Especialidad e){
      
      this.nombre = e.getNombre();
      this.idEspecialidad = e.getIdEspecialidad();
      
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(String idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "nombre=" + nombre + ", idEspecialidad=" + idEspecialidad + '}';
    }
    
    public String Data(){
        
        return getNombre() + " | " + getIdEspecialidad();
    }
    
    
    
}
