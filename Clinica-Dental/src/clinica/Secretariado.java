/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.ArrayList;

/**
 * @version 2.0
 * @author AdrianSaveli
 */
public class Secretariado extends Empleado{
    private int añosExperiencia;//Son los años de experiencia del secretariado.Debe ser un número determinado.
    
    //Getters y setters
    
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    //Constructor por defecto
    public Secretariado() {
        super();
    }
    //Constructor con argumentos
    public Secretariado(String nombre, String apellido, String telefono, String nif, String direccion) {
        super(nombre, apellido, telefono, nif, direccion);
        this.añosExperiencia = añosExperiencia;
    }
    //Constructor de copia
    public Secretariado (Secretariado p) {
        super(p);
        this.añosExperiencia = p.getAñosExperiencia();
      
    }
    
    public Secretariado (Empleado e, int añosExperiencia) {
        super (e);
        this.añosExperiencia= añosExperiencia;
    }
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return super.toString()+ "Secretariado{" + "a\u00f1osExperiencia=" + añosExperiencia + '}';
    }
    @Override
     public String data() {
        return super.data()+""+getAñosExperiencia();
    }
    public Secretariado getSecretariadoById (long id){
        Secretariado s = new Secretariado();
         return s;
    }
    
   
    
     
    
}
