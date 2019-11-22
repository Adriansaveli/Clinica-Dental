/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;
import java.util.Date;
import java.util.ArrayList;
/**
 *
 * @author Alberto
 * @version1
 */
public class Modificacion {
    
   protected long id;// idenitficador 
   private ArrayList<OImpresion>  operarios; //operarios que realizan la modificación
   private Date  fecha; //fecha de realización
   private String desc; //descripción del cambio
   private boolean aprob;//aprobacion del cliente
   private Date fechaAprob;//fecha limite aprobación del cliente
   private long idCliente;
   private long idTrabajo;
   
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean getAprob() {
        return aprob;
    }

    public void setAprob(boolean aprob) {
        this.aprob = aprob;
    }

    public Date getFechaAprob() {
        return fechaAprob;
    }

    public void setFechaAprob(Date fechaAprob) {
        this.fechaAprob = fechaAprob;
    }
    Maquina maquina;//maquina que la realiza

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getdesc() {
        return desc;
    }

    public void setdesc(String desc) {
        this.desc = desc;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    //constructor con argumentos
    public Modificacion(long id, Date fecha, String desc, boolean aprob, Date fechaAprob, Maquina maquina) {
        this.operarios = new ArrayList<OImpresion>();
        this.fecha = fecha;
        this.desc = desc;
        this.aprob = aprob;
        this.fechaAprob = fechaAprob;
        this.maquina = maquina;
    }

    public ArrayList<Operario> getListaOperarios(){
    
        return 
    }
  
    //constructor por defecto
    public Modificacion() {
    }
    
    //constructor de copia
    public Modificacion(Modificacion m ) {
        this.operarios = new ArrayList<OImpresion>();
        this.fecha = m.getFecha();
        this.desc = m.getDesc();
        this.aprob = m.getAprob();
        this.fechaAprob = m.getFechaAprob();
        this.maquina = m.getMaquina();
    }
    
    public String data() { 
     return id + "|" + operarios + "|" + fecha + "|" + desc + "|" + aprob + "|" + fechaAprob + "|" + maquina ; 
            }
    

    @Override
    public String toString() {
        return "Modificacion{" + "id=" + id + ", operario=" + operarios + ", fecha=" + fecha + ", desc=" + desc + ", aprob=" + aprob + ", fechaAprob=" + fechaAprob + ", maquina=" + maquina + '}';
    }

   
    
           
    
}
