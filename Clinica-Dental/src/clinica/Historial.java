
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
//import java.util.*;
/**
 * @version 2.0
 * @author DAW109
 * Clase del Historial de la clinica
 */
public class Historial {
    
    protected long idHistoria;//Lleva el identificador del historial
    private String descripcion;//Descripcion del historial
  //private List<Alergia>alergias=new ArrayList<Alergia>();

    public Historial() {
    }

    public Historial(int idHistoria, String descripcion) {
        this.idHistoria = idHistoria;
        this.descripcion = descripcion;
    }
    
    public Historial(Historial h){
        this.descripcion=h.getDescripcion();
        this.idHistoria=h.getIdHistoria();
    }

    public long getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Historial{" + "idHistoria=" + idHistoria + ", descripcion=" + descripcion + '}';
    }
    
    public String data() {
        return getIdHistoria() + " | " + getDescripcion();
    }
}

