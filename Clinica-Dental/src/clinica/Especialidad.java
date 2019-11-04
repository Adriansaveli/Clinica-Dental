/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
/**
 * verison 2
 * @author DAW109
 */
public class Especialidad {
    
    private String nombre;
    //Nombre de la especialidad ej; endodoncista, esta relacionada con cirujía ES OBLIGATORIO TENER UNA CADENA DE CARACTERES
    protected long idEspecialidad;
    // Identificador de la especialidad, puede ser SA125 por eso es un String, NO PUEDE SER VALOR 0

    public Especialidad() {
    }

    public Especialidad(String nombre, long idEspecialidad) {
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

    public long getIdEspecialidad() {
        return idEspecialidad;
    }

    /**
     *
     * @param idEspecialidad
     */
    public void setIdEspecialidad(long idEspecialidad) {
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
