/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.Date;
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
    public Revision(Date fecha, char rangoHorario,String hora,boolean estado,String anotaciones) {
        super(fecha,rangoHorario,hora,estado);
        this.anotaciones = anotaciones;
    }
    //Constructor de copia
    public Revision (Revision p) {
        super(p);
        this.anotaciones = p.getAnotaciones();  
    }
    public Revision(Cita c, String anotaciones){
       super(c);
       this.anotaciones = anotaciones;
    } 
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return super.toString()+"Revisi\u00f3n{" + "anotaciones=" + anotaciones + '}';
    }
    public String data() {
        return super.data()+ "|"+getAnotaciones(); 
    }
    public Revision getRevisionById (long id){
        Revision r = new Revision();
    /*  
        
    */    
        return r;
    }
}
