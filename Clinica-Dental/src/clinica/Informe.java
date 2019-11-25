/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.ArrayList;
/**
 * @version 4.1
 * @author AdrianSaveli
 */
public class Informe {
    protected long id;//Es el identificador del informe.
    private String descripcionTratamiento;//Es la descripción del tratamiento a seguir del paciente.Cadena de caracteres.
    private ArrayList<Secretariado> secretariados;
    //Getters y setters

    public ArrayList<Secretariado> getSecretariados() {
        return secretariados;
    }

    public void setSecretariados(ArrayList<Secretariado> secretariados) {
        this.secretariados = secretariados;
    }
    
    public long getID() {
        return id;
    }

    public void setID(long ID) {
        this.id = ID;
    }

    public String getDescripciónTratamiento() {
        return descripcionTratamiento;
    }

    public void setDescripciónTratamiento(String descripciónTratamiento) {
        this.descripcionTratamiento = descripciónTratamiento;
    }
    //Constructor por defecto
    public Informe() {
    }
    //Constructor con argumentos
    public Informe(long ID, String descripciónTratamiento) {
        this.id = ID;
        this.descripcionTratamiento = descripciónTratamiento;
    }
    //Constructor de copia
    public Informe (Informe p) {
        this.descripcionTratamiento = p.getDescripciónTratamiento();
        this.id = p.getID();
    }
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return "Informe{" + "ID=" + id + ", descripci\u00f3nTratamiento=" + descripcionTratamiento + '}';
    }
    
    public String data() {
        return ""+getID()+"|"+getDescripciónTratamiento();
    }
    public ArrayList<Informe> getAllInforme (){
    ArrayList <Informe> informes = new ArrayList <Informe>();
    return informes ;
    }
    public Informe getInformeById (long id){
        Informe i = new Informe();
        /*Este método sirve para que posteriormente se busque el id dado
        y se obtengan los datos de aquel informe que tenga ese id dado.
        Aunque si no existe ningún informe con ese id saldra null.  
        */ 
        return i;
    }
    
}
