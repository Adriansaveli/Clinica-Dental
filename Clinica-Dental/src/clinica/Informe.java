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
    
    //Getters y setters
    
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
    public Informe getInformeById (long id){
        Informe i = new Informe();
        return i;
    }
    
}
