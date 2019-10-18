/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * version 2
 * @author DAW109
 */
public class Enfermeria {
    
    private char categoria;
    //Dado que la categoría tiene que estar solo representado por una letra es un char PUEDE TENER LOS VALORES QUE SE QUIERAN PUESTO QUE PUEDEN PONER LAS CATEGORÍAS COMO CATEGORÍA A,0, 1... SOLO PUEDE SER UN CARACTER.

    //Constructor por defecto
    public Enfermeria() {
    }
    //Constructor con parámetros

    public Enfermeria(char categoria) {
        this.categoria = categoria;
    }
    //Constructor de copia
    
    public Enfermeria (Enfermeria e){
        this.categoria=e.getCategoria();
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

 
  
    
    
    
}
