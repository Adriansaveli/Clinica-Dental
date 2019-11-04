/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 * @version 1.0
 * @author DAW106
 */
public class Empleado{
    
    protected long id;
    private String nombre;
    private String apellido;
    private String telefono; 
    private String nif;
    private String direccion; //Direccion del empleado

    public Empleado() {
    }

    public Empleado(int idEmpleado, String nombre, String apellido, String telefono, String nif, String direccion) {
        this.id = idEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nif = nif;
        this.direccion= direccion;
    }
    
    public Empleado(Empleado e) {

        this.id=e.getId();

        this.nombre=e.getNombre();
        this.apellido=e.getApellido();
        this.telefono=e.getTelefono();
        this.nif=e.getNif();
        this.direccion=e.getDireccion();
        
    }


    public long getId() {

        return id;
    }


    public void setId(int id) {
        this.id = id;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", nif=" + nif + ", direccion=" + direccion + '}';
    }
    
    public String data() {
      
        return getId() + " | " + getNombre() + " | " + getApellido() + " | " + getTelefono() + " | " + getNif() + " | " + getDireccion();
    }
    
}
