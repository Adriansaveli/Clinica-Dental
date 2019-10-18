/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 * @version 2.0
 * @author AdrianSaveli
 */
public class Secretariado {
    private int añosExperiencia;//Son los años de experiencia del secretariado.Debe ser un número determinado.
    
    //Getters y setters
    
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    //Constructor por defecto
    public Secretariado() {
    }
    //Constructor con argumentos
    public Secretariado(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    //Constructor de copia
    public Secretariado (Secretariado p) {
        this.añosExperiencia = p.getAñosExperiencia();
    }
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return "Secretariado{" + "a\u00f1osExperiencia=" + añosExperiencia + '}';
    }
     public String data() {
        return ""+getAñosExperiencia();
    }
    
   
    
     
    
}
