/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 * @version 3.0
 * @author AdrianSaveli
 */
public class Pago {
    private String IdPago;//Es el identificador del pago.
    private String fechadePago;//Es la fecha de la realización del pago por parte del paciente.
    private double importe ;//Es el importe del pago.Solo son valores númericos.
    private String métodoDePago;//Es el método por el cual se efectua el pago (Transferencia,efectivo,...).
   
    //Getters y setters
    
    public String getID() {
        return IdPago;
    }

    public void setID(String ID) {
        this.IdPago = ID;
    }

    public String getFechaDePago() {
        return fechadePago;
    }

    public void setFechaDePago(String fechaDePago) {
        this.fechadePago = fechaDePago;
    }

    public int getImporte() {
        return (int) importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String getMétodoDePago() {
        return métodoDePago;
    }

    public void setMétodoDePago(String métodoDePago) {
        this.métodoDePago = métodoDePago;
    }

   //Constructor por defecto
    public Pago() {
    }
    //Constructor con argumentos
    public Pago(String ID, String FechaDePago, int Importe, String MétodoDePago) {
        this.IdPago = ID;
        this.fechadePago = FechaDePago;
        this.importe = Importe;
        this.métodoDePago = MétodoDePago;
    }
    //Constructor de copia
      public Pago (Pago p) {
        this.IdPago = p.getID();
        this.fechadePago = p.getFechaDePago();
        this.importe = p.getImporte();
        this.métodoDePago = p.getMétodoDePago();
        
        
        }

    @Override
    public String toString() {
        return "Pago{" + "ID=" + IdPago + ", fechaDePago=" + fechadePago + ", importe=" + importe + ", m\u00e9todoDePago=" + métodoDePago + '}';
    }
    
    public String data() {
        return ""+getID()+"|"+getFechaDePago()+"|"+getImporte()+"|"+getMétodoDePago();
    }
}
