/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
/**
 * version 3.0
 * @author DAW109
 */
public class Medicamento {
    
    protected long id;
    //Identificador del medicamento. VALOR SUPERIOR A CERO
    private String nombre;
    // Nombre del medicamento por ejemplo, aspirina... 
    private String principioActivo;
    // Principio activo del medicamento
    private int dosisMaxDiaria;
    // Dosis máxima diaria en mg puesto, por tanto tiene que ser un int porque debe ser un numero entero, NO PUEDE SER VALOR 0

    public Medicamento() {
    }

    public Medicamento(int idMedicamento, String nombre, String principioActivo, int dosisMaxDiaria) {
        this.id = idMedicamento;
        this.nombre = nombre;
        this.principioActivo = principioActivo;
        this.dosisMaxDiaria = dosisMaxDiaria;
    }

    public Medicamento (Medicamento m){
        this.id = m.getId();
        this.nombre = m.getNombre();
        this.principioActivo = m.getPrincipioActivo ();
        this.dosisMaxDiaria= (int) m.getDosisMaxDiaria();
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

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public float getDosisMaxDiaria() {
        return dosisMaxDiaria;
    }

    public void setDosisMaxDiaria(int dosisMaxDiaria) {
        this.dosisMaxDiaria = dosisMaxDiaria;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "idMedicamento=" + id + ", nombre=" + nombre + ", principioActivo=" + principioActivo + ", dosisMaxDiaria=" + dosisMaxDiaria + '}';
    }
    
    public String Data (){
        return getId() + " | " + getNombre() + " | " + getPrincipioActivo() + " | " + getDosisMaxDiaria();
    }
    
}
