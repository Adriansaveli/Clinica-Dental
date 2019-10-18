/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

/**
 * @version 2.0
 * @author AdrianSaveli
 */
public class Alergia {
    private String IdAlergia;//Es el identificador de las alergia.
    private String nombreAlergía;//Es el nombre de la alergia.Cadena de caracteres.
    
    //Getters y setters
    
    public String getID() {
        return IdAlergia;
    }

    public void setID(String ID) {
        this.IdAlergia = ID;
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
    public Alergia(String ID, String nombreAlergía) {
        this.IdAlergia = ID;
        this.nombreAlergía = nombreAlergía;
    }
    //Constructor de copia
    public Alergia (Alergia p) {
        this.nombreAlergía = p.getNombreAlergia();
        this.IdAlergia = p.getID();
    }
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return "Alerg\u00eda{" + "ID=" + IdAlergia + ", nombreAlerg\u00eda=" + nombreAlergía + '}';
    }
     public String data() {
        return ""+getID()+"l"+getNombreAlergia();
    }
}
