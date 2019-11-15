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
public class Revision extends Cita {
    private String anotaciones;
    //Son las anotaciones que se escriben en la revisión.Cadena de caracteres.
    
    //Getters y setters
    
    public String getAnotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }
    //Constructor por defecto
    public Revision() {
    super();
    }
    //Constructor con argumentos
    public Revision(String anotaciones) {
        this.anotaciones = anotaciones;
    }
    //Constructor de copia
    public Revision (Revision p) {
        this.anotaciones = p.getAnotaciones();  
    }
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return "Revisi\u00f3n{" + "anotaciones=" + anotaciones + '}';
    }
     public String data() {
        return ""+getAnotaciones(); 
    }
}
