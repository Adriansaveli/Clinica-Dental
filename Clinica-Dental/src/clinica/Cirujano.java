/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.ArrayList;
/**
 * @version 2.0
 * @author DAW106
 */
public class Cirujano extends Empleado{
   
    private ArrayList <Especialidad> especialidades;//Esto deberia implementarse en un lista de Especialidad. 
    private ArrayList<Revision> revisiones;
    public Cirujano() {
        super();
    }

    public Cirujano(String nombre, String apellido, String telefono, String nif, String direccion) {
        super (nombre, apellido, telefono, nif, direccion);
        this.especialidades = especialidades;
    }
    
    public Cirujano(Cirujano c) {
        super (c);
     
        this.especialidades=c.getEspecialidades();
       
    }
    public Cirujano(Empleado e, ArrayList especialidades) {
        super(e);
        this.especialidades= especialidades;
             
    }

    public ArrayList<Revision> getRevisiones() {
        return revisiones;
    }

    public void setRevisiones(ArrayList<Revision> revisiones) {
        this.revisiones = revisiones;
    }
    
    /*
    Getter de especialidades.
    */
    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }
    /*
    Setter de especialidades.
    */
    public void setEspecialidades(ArrayList especialidades) {
        this.especialidades = especialidades;
    }
    /*
    Método toString de la clase Cirujano
    */

    @Override
    public String toString() {
        return super.toString()+ "Cirujano{" + "especialidades=" + especialidades + '}';
    }
    
    /*
    Método que devuelve los atributos de la clase separados por '|'
    */
    @Override
    public String data() {
        return super.data()+getEspecialidades();
    }
    public ArrayList<Cirujano> getAllCirujano (){
    ArrayList <Cirujano> cirujanos = new ArrayList <Cirujano>();
    return cirujanos ;
    }
    public Cirujano getCirujanoById (long id){
        Cirujano c = new Cirujano();
         return c;
    }
    public static Cirujano nuevoCirujano(){
       Cirujano c = new Cirujano();
      
      return c;
  }
}
