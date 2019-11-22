/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.Date;
import java.util.ArrayList;
/**
 * @version 2.0
 * @author DAW106
 */
public class Cobro {
    
    protected long id;
    private double importeTotalEuros;
    private Date fechaFinalizacion;

    public Cobro() {
    }

    public Cobro(int idCobro, double importeTotalEuros, Date fechaFinalizacion) {
        this.id = idCobro;
        this.importeTotalEuros = importeTotalEuros;
        this.fechaFinalizacion = fechaFinalizacion;
    }
    
    public Cobro(Cobro c) {
        this.id=c.id;
        this.importeTotalEuros=c.getImporteTotalEuros();
        this.fechaFinalizacion=c.getFechaFinalizacion();
    }

    public long getIdCobro() {
        return id;
    }

    public void setIdCobro(int idCobro) {
        this.id = idCobro;
    }

    public double getImporteTotalEuros() {
        return importeTotalEuros;
    }

    public void setImporteTotalEuros(double importeTotalEuros) {
        this.importeTotalEuros = importeTotalEuros;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public String toString() {
        return "Cobro{" + "idCobro=" + id + ", importeTotalEuros=" + importeTotalEuros + ", fechaFinalizacion=" + fechaFinalizacion + '}';
    }
    
    public String data() {
        return getIdCobro() + " | " + getImporteTotalEuros()+ " | " + getFechaFinalizacion();
    }
    public ArrayList<Cobro> getAllCobro (){
    ArrayList <Cobro> cobros = new ArrayList <Cobro>();
    return cobros;
    }
    public Cobro getCobroById (long id){
        Cobro c = new Cobro();
        return c;
    }
}
