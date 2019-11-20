/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 * @version 2.0
 * @author Mar Santín
 */
public class Cirujano extends Empleado{
   
    private String especialidades;//Esto deberia implementarse en un lista de Especialidad. 

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
    public Cirujano(Empleado e, String especialidades) {
        super(e);
        this.especialidades= especialidades;
             
    }
    
    /*
    Getter de especialidades.
    */
    public String getEspecialidades() {
        return especialidades;
    }
    /*
    Setter de especialidades.
    */
    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
    /*
    Método toString de la clase Cirujano
    */

    @Override
    public String toString() {
        return "Cirujano{" + "especialidades=" + especialidades + '}';
    }
    
    /*
    Método que devuelve los atributos de la clase separados por '|'
    */
    @Override
    public String data() {
        return super.data()+getEspecialidades();
    }
    public Cirujano getCirujanoById (long id){
        Cirujano c = new Cirujano();
         return c;
    }
}
