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
public class Cita {
    private int idCita;
    private String fecha;
    private char rangoHorario;
    private String hora;

    public Cita() {
    }

    public Cita(int idCita, String fecha, char rangoHorario, String hora) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.rangoHorario = rangoHorario;
        this.hora = hora;
    }
    
    public Cita(Cita c) {
        this.idCita=c.getIdCita();
        this.fecha=c.getFecha();
        this.rangoHorario=c.getRangoHorario();
        this.hora=c.getHora();
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
        return "Cita{" + "idCita=" + idCita + ", fecha=" + fecha + ", rangoHorario=" + rangoHorario + ", hora=" + hora + '}';
    }
   
    public String data() {
        return getIdCita() + " | " + getFecha() + " | " + getRangoHorario() + " | " + getHora();
    
}

}