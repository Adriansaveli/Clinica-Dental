/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 *
 * @author AdrianSaveli
 */
public class Paciente {
    private String IdPaciente;//Es el identificador del paciente.
    private String nombre;//Es el nombre del paciente.
    private String apellidos;//Es el apellido del paciente.
    private String NIF;//Es la tarjeta de identidad del paciente.
    private String telefono;//Es el telefono de contacto del paciente.
    private String direccion;//Es la dirección de residencia del paciente.
    
    //Getters y setters

    public String getID() {
        return IdPaciente;
    }

    public void setID(String ID) {
        this.IdPaciente = ID;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //Constructor por defecto
    public Paciente() {
    }
    //Constructor con argumentos

    public Paciente(String ID, String nombre, String apellidos, String NIF, String telefono, String direccion) {
        this.IdPaciente = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.telefono = telefono;
        this.direccion = direccion;
    }
   
    //Constructor de copia
   public Paciente (Paciente p) {
        this.IdPaciente = p.getID();
        this.nombre = p.getNombre();
        this.apellidos = p.getApellidos();
        this.NIF = p.getNIF();
        this.telefono = p.getTelefono();
        this.direccion = p.getDireccion();
        }
    //Otros métodos sobreescritos
    
    @Override
    public String toString() {
        return "Paciente{" + "ID=" + IdPaciente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    public String data() {
        return ""+getID()+"l"+getNombre()+"l"+getApellidos()+"l"+getNIF()+"l"+getTelefono()+"l"+getDireccion();
    }
}
