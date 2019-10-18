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
public class Informe {
    private String IdInforme;//Es el identificador del informe.
    private String descripciónTratamiento;//Es la descripción del tratamiento a seguir del paciente.
    
    //Getters y setters
    
    public String getID() {
        return IdInforme;
    }

    public void setID(String ID) {
        this.IdInforme = ID;
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
        this.IdInforme = ID;
        this.descripciónTratamiento = descripciónTratamiento;
    }
    //Constructor de copia
    public Informe (Informe p) {
        this.descripciónTratamiento = p.getDescripciónTratamiento();
        this.IdInforme = p.getID();
    }
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return "Informe{" + "ID=" + IdInforme + ", descripci\u00f3nTratamiento=" + descripciónTratamiento + '}';
    }
    
     public String data() {
        return ""+getID()+"l"+getDescripciónTratamiento();
    }
    
}
