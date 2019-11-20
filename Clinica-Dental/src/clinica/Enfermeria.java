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
public class Enfermeria extends Empleado{
    
    private char categoria;
    //Dado que la categoría tiene que estar solo representado por una letra es un char PUEDE TENER LOS VALORES QUE SE QUIERAN PUESTO QUE PUEDEN PONER LAS CATEGORÍAS COMO CATEGORÍA A,0, 1... SOLO PUEDE SER UN CARACTER.

    //Constructor por defecto
    public Enfermeria() {
        super();
    }
    //Constructor con parámetros

    public Enfermeria(String nombre, String apellido, String telefono, String nif, String direccion) {
        super (nombre, apellido, telefono, nif, direccion);
        this.categoria = categoria;
    }
    //Constructor de copia
    
    public Enfermeria (Enfermeria e){
        super (e);
        this.categoria=e.getCategoria();
    
    }
    
    public Enfermeria (Empleado e, char categoria) {
        super (e);
        this.categoria= categoria;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public String Data () {
        
        return getCategoria() + "";
    }

    @Override
    public String toString() {
        return "Enfermeria{" + "categoria=" + categoria + '}';
    }
    public Enfermeria getEnfermeriaById (long id){
        Enfermeria e = new Enfermeria ();
         return e;
    }
 
  
    
    
    
}
