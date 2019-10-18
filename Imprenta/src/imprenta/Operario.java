/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

/**
 *
 * @author VindioPerez
 * @version 1.0
 */
public class Operario {
    private String nombre;
    //El nombre del operario, se define con un String alfabetico
    private String apellidos;
    //Los apellidos, se definen con un String alfabetico
    private String nif;
    //El NIF, se define con un String alfanumerico de 8 numeros y una letra
    private String telefono;
    //El numero de telefono, se define con un String de 9 numeros empezado por 6, 7 o 9
    private String direccion;
    //La direccion, se define con un String alfanumerico
    private boolean senior;
    //La categoria del empleado, solo puede o ser senior o no serlo
    public long id;
    //variable identificador 
    
    public Operario() {
    }

    public Operario(String nombre, String apellidos, String nif, String telefono, String direccion, boolean senior) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.telefono = telefono;
        this.direccion = direccion;
        this.senior = senior;
    }
    
    public Operario (Operario o) {
        this.nombre = o.getNombre();
        this.apellidos = o.getApellidos();
        this.nif = o.getNif();
        this.telefono = o.getTelefono();
        this.direccion = o.getDireccion();
        this.senior = o.isSenior();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
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

    public boolean isSenior() {
        return senior;
    }

    public void setSenior(boolean senior) {
        this.senior = senior;
    }

    @Override
    public String toString() {
        return "Operario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", telefono=" + telefono + ", direccion=" + direccion + ", senior=" + senior + '}';
    }

    public String data() {
        return nombre + "|" + apellidos + "|" + nif + "|" + telefono + "|" + direccion + "|" + senior;
    }
    
}
