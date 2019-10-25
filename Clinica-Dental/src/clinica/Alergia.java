/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 * @version 3.1
 * @author AdrianSaveli
 */
public class Alergia {
    private long idAlergia;//Es el identificador de las alergia.
    private String nombreAlergía;//Es el nombre de la alergia.Cadena de caracteres.
    
    //Getters y setters
    
    public long getID() {
        return idAlergia;
    }

    public void setID(long ID) {
        this.idAlergia = ID;
    }

    public String getNombreAlergia() {
        return nombreAlergía;
    }

    public void setNombreAlergía(String nombreAlergía) {
        this.nombreAlergía = nombreAlergía;
    }
    //Constructor por defecto
    public Alergia() {
    }
    //Constructor con argumentos
    public Alergia(long ID, String nombreAlergía) {
        this.idAlergia = ID;
        this.nombreAlergía = nombreAlergía;
    }
    //Constructor de copia
    public Alergia (Alergia p) {
        this.nombreAlergía = p.getNombreAlergia();
        this.idAlergia = p.getID();
    }
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return "Alerg\u00eda{" + "ID=" + idAlergia + ", nombreAlerg\u00eda=" + nombreAlergía + '}';
    }
     public String data() {
        return ""+getID()+"|"+getNombreAlergia();
    }
}
