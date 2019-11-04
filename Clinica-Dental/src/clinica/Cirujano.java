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

    public Cirujano(String especialidades) {
        this.especialidades = especialidades;
    }
    
    public Cirujano(Cirujano c) {
        
        this.especialidades=c.getEspecialidades();
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
        return getEspecialidades();
    }
}
