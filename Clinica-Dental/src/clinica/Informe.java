/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 * @version 4.0
 * @author Mar Santín
 */
public class Informe {
    private String idInforme;//Es el identificador del informe.
    private String descripciónTratamiento;//Es la descripción del tratamiento a seguir del paciente.Cadena de caracteres.
    
    //Getters y setters
    
    public String getID() {
        return idInforme;
    }

    public void setID(String ID) {
        this.idInforme = ID;
    }

    public String getDescripciónTratamiento() {
        return descripciónTratamiento;
    }

    public void setDescripciónTratamiento(String descripciónTratamiento) {
        this.descripciónTratamiento = descripciónTratamiento;
    }
    //Constructor por defecto
    public Informe() {
    }
    //Constructor con argumentos
    public Informe(String ID, String descripciónTratamiento) {
        this.idInforme = ID;
        this.descripciónTratamiento = descripciónTratamiento;
    }
    //Constructor de copia
    public Informe (Informe p) {
        this.descripciónTratamiento = p.getDescripciónTratamiento();
        this.idInforme = p.getID();
    }
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return "Informe{" + "ID=" + idInforme + ", descripci\u00f3nTratamiento=" + descripciónTratamiento + '}';
    }
    
     public String data() {
        return ""+getID()+"|"+getDescripciónTratamiento();
    }
    
}
