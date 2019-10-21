/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 * @version 2.0
 * @author DAW109
 */
public class Cobro {
    
    private int idCobro;
    private double importeTotalEuros;
    private String fechaFinalizacion;

    public Cobro() {
    }

    public Cobro(int idCobro, double importeTotalEuros, String fechaFinalizacion) {
        this.idCobro = idCobro;
        this.importeTotalEuros = importeTotalEuros;
        this.fechaFinalizacion = fechaFinalizacion;
    }
    
    public Cobro(Cobro c) {
        this.idCobro=c.idCobro;
        this.importeTotalEuros=c.getImporteTotalEuros();
        this.fechaFinalizacion=c.getFechaFinalizacion();
    }

    public int getIdCobro() {
        return idCobro;
    }

    public void setIdCobro(int idCobro) {
        this.idCobro = idCobro;
    }

    public double getImporteTotalEuros() {
        return importeTotalEuros;
    }

    public void setImporteTotalEuros(double importeTotalEuros) {
        this.importeTotalEuros = importeTotalEuros;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public String toString() {
        return "Cobro{" + "idCobro=" + idCobro + ", importeTotalEuros=" + importeTotalEuros + ", fechaFinalizacion=" + fechaFinalizacion + '}';
    }
    
    public String data() {
        return getIdCobro() + " | " + getImporteTotalEuros()+ " | " + getFechaFinalizacion();
    }
}
