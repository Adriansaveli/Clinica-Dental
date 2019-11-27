/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.Date;
import java.util.ArrayList;
/**
 * @version 3.1
 * @author AdrianSaveli
 */
public class Pago {

    static Pago nuevoPagos(int i, String cob) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected long id;//Es el identificador del pago.
    private Date fechadePago;//Es la fecha de la realización del pago por parte del paciente.
    private double importe ;//Es el importe del pago.Solo son valores númericos.
    private String métododePago;//Es el método por el cual se efectua el pago (Transferencia,efectivo,...).
    Paciente paciente;//Paciente es el que realiza el pago.
    //Getters y setters
    
    public long getID() {
        return id;
    }

    public void setID(long ID) {
        this.id = ID;
    }

    public Date getFechaDePago() {
        return fechadePago;
    }

    public void setFechaDePago(Date fechaDePago) {
        this.fechadePago = fechaDePago;
    }

    public int getImporte() {
        return (int) importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String getMétodoDePago() {
        return métododePago;
    }

    public void setMétodoDePago(String métodoDePago) {
        this.métododePago = métodoDePago;
    }

   //Constructor por defecto
    public Pago() {
    }
    //Constructor con argumentos
    public Pago(long ID, Date FechaDePago, int Importe, String MétodoDePago) {
        this.id = ID;
        this.fechadePago = FechaDePago;
        this.importe = Importe;
        this.métododePago = MétodoDePago;
    }
    //Constructor de copia
      public Pago (Pago p) {
        this.id = p.getID();
        this.fechadePago = p.getFechaDePago();
        this.importe = p.getImporte();
        this.métododePago = p.getMétodoDePago();
        
        
        }

    @Override
    public String toString() {
        return "Pago{" + "ID=" + id + ", fechaDePago=" + fechadePago + ", importe=" + importe + ", m\u00e9todoDePago=" + métododePago + '}';
    }
    
    public String data() {
        return ""+getID()+"|"+getFechaDePago()+"|"+getImporte()+"|"+getMétodoDePago();
    }
    
    
    public ArrayList<Pago> getAllPago (){
    ArrayList <Pago> pagos = new ArrayList <Pago>();
    return pagos;
    }
    
   
    public Pago getPagoById (long id){
        Pago p = new Pago();
        /*Este método sirve para que posteriormente se busque el id dado
        y se obtengan los datos de aquel pago que tenga ese id dado.
        Aunque si no existe ningún pago con ese id saldra null.  
        */ 
        return p;
    }
}
