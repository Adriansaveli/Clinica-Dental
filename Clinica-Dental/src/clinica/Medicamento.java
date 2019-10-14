/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAW109
 */
public class Medicamento {
    
    private int Identificador;
    //Identificador del medicamento. VALOR SUPERIOR A CERO
    private String Nombre;
    // Nombre del medicamento por ejemplo, aspirina... 
    private String principioActivo;
    // Principio activo del medicamento
    private float dosisMaxDiaria;
    // Dosis máxima diaria en mg puesto, por tanto tiene que ser un float porque no tiene que ser un numero entero, NO PUEDE SER VALOR 0

    
    //Contructor por defecto

    public Medicamento() {
    }
    
    //Contructor por parámetros

    public Medicamento(int Identificador, String Nombre, String principioActivo, float dosisMaxDiaria) {
        this.Identificador = Identificador;
        this.Nombre = Nombre;
        this.principioActivo = principioActivo;
        this.dosisMaxDiaria = dosisMaxDiaria;
    }
    
    //Constructor de copia
    
    public Medicamento (Medicamento m) {
        
        this.Identificador=m.getIdentificador();
        this.Nombre=m.getNombre ();
        this.principioActivo=m.getPrincipioActivo();
        this.dosisMaxDiaria=m.getDosisMaxDiaria();
       
        
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public void setDosisMaxDiaria(float dosisMaxDiaria) {
        this.dosisMaxDiaria = dosisMaxDiaria;
    }
    
    public String Data () {
        return getIdentificador () + " | " + getNombre () + " | " + getPrincipioActivo () + " | " + getDosisMaxDiaria ();
    }
}
