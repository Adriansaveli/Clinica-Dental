/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.Date;
/**
 * @version 2.0
 * @author Mar Santín
 */
public class Cita {
    protected long id;
    private Date fecha;
    private char rangoHorario;
    private String hora;
    private boolean estado;

    public Cita() {
    }

    public Cita(Date fecha, char rangoHorario, String hora,boolean estado) {
        
        this.fecha = fecha;
        this.rangoHorario = rangoHorario;
        this.hora = hora;
        this.estado=estado;
    }
    
    public Cita(Cita c) {
        this.id=c.getId();
        this.fecha=c.getFecha();
        this.rangoHorario=c.getRangoHorario();
        this.hora=c.getHora();
    }

    public long getId() {
        return id;
    }

    public void setId(int idCita) {
        this.id = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getRangoHorario() {
        return rangoHorario;
    }

    public void setRangoHorario(char rangoHorario) {
        this.rangoHorario = rangoHorario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Cita{" + "idCita=" + id + ", fecha=" + fecha + ", rangoHorario=" + rangoHorario + ", hora=" + hora + '}';
    }
   
    public String data() {
        return getId() + " | " + getFecha() + " | " + getRangoHorario() + " | " + getHora();
    
    }
    public Cita getCitaById (long id){
        Cita c = new Cita();
        return c;
    }

}