
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.ArrayList;
//import java.util.*;
/**
 * @version 2.0
 * @author DAW106
 * Clase del Historial de la clinica
 */
public class Historial {
    
    protected long id;//Lleva el identificador del historial
    private String descripcion;//Descripcion del historial
  //private List<Alergia>alergias=new ArrayList<Alergia>();

    public Historial() {
    }

    public Historial(int idHistoria, String descripcion) {
        this.id = idHistoria;
        this.descripcion = descripcion;
    }
    
    public Historial(Historial h){
        this.descripcion=h.getDescripcion();
        this.id=h.getId();
    }

    public long getId() {
        return id;
    }

    public void setIdHistoria(int idHistoria) {
        this.id = idHistoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Historial{" + "idHistoria=" + id + ", descripcion=" + descripcion + '}';
    }
    
    public String data() {
        return getId() + " | " + getDescripcion();
    }
    public ArrayList<Historial> getAllHistorial (){
    ArrayList <Historial> historiales = new ArrayList <Historial>();
    return historiales ;
    }
    public Historial getHistorialById (long id){
        Historial h = new Historial();
         return h;
    }
}

