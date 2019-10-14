/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAW109
 */
public class Enfermería {
    
    private char Categoría;
    //Dado que la categoría tiene que estar solo representado por una letra es un char PUEDE TENER LOS VALORES QUE SE QUIERAN PUESTO QUE PUEDEN PONER LAS CATEGORÍAS COMO CATEGORÍA A,0, 1... SOLO PUEDE SER UN CARACTER.

    //Constructor por defecto
    public Enfermería() {
    }
    //Constructor con parámetros

    public Enfermería(char Categoría) {
        this.Categoría = Categoría;
    }
    //Constructor de copia
    
    public Enfermería (Enfermería e){
        this.Categoría=e.getCategoría();
    }

    public char getCategoría() {
        return Categoría;
    }

    public void setCategoría(char Categoría) {
        this.Categoría = Categoría;
    }

    public char Data () {
        
        return getCategoría();
    }

    @Override
    public String toString() {
        return "Enfermer\u00eda{" + "Categor\u00eda=" + Categoría + '}';
    }
  
    
    
    
}
