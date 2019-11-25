/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.util.ArrayList;
/**
 * @version 3.1
 * @author AdrianSaveli
 */
public class Alergia {
    protected long id;//Es el identificador de las alergia.
    private String nombreAlergia;//Es el nombre de la alergia.Cadena de caracteres.
    
    //Getters y setters
    
    public long getID() {
        return id;
    }

    public void setID(long ID) {
        this.id = ID;
    }

    public String getNombreAlergia() {
        return nombreAlergia;
    }

    public void setNombreAlergía(String nombreAlergía) {
        this.nombreAlergia = nombreAlergía;
    }
    //Constructor por defecto
    public Alergia() {
    }
    //Constructor con argumentos
    public Alergia(long ID, String nombreAlergía) {
        this.id = ID;
        this.nombreAlergia = nombreAlergía;
    }
    //Constructor de copia
    public Alergia (Alergia p) {
        this.nombreAlergia = p.getNombreAlergia();
        this.id = p.getID();
    }
    //Otros métodos sobreescritos
    @Override
    public String toString() {
        return "Alerg\u00eda{" + "ID=" + id + ", nombreAlerg\u00eda=" + nombreAlergia + '}';
    }
    public String data() {
        return ""+getID()+"|"+getNombreAlergia();
    }
    public ArrayList<Alergia> getAllAlergia (){
        
    ArrayList <Alergia> alergias = new ArrayList <Alergia>();
    
    return alergias;
    }
    
    public Alergia getAlergiaById (long id){
        Alergia a = new Alergia();
        /*Este método sirve para que posteriormente se busque el id dado
        y se obtengan los datos de aquella alergia que tenga ese id dado.
        Aunque si no existe ninguna alergia con ese id saldra null.  
        */ 
        return a;
    }
}
