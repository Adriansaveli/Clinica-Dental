/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 * @version 1.0
 * @author Alberto
 */
public class Cirujano {
    private String especialidades;//Esto deberia implementarse en un lista de Especialidad. 

    public Cirujano() {
        
    }

    public Cirujano(String especialidades) {
        this.especialidades = especialidades;
    }
    
    public Cirujano(Cirujano c) {
        
        this.especialidades=c.especialidades;
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
    public String data() {
        return getEspecialidades();
    }
}
