/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.text.ParseException;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * version 2
 * @author DAW109
 */
public class Intervencion extends Cita{
    
    private String duracion;
    
    private ArrayList <Enfermeria> enfermeros;
    
    public Intervencion() {
    super();
    }
    
    public Intervencion(Date fecha, char rangoHorario,String hora,boolean estado,String duracion){
        super(fecha,rangoHorario,hora,estado);
        this.duracion = duracion;
    }
    public Intervencion (Intervencion i) {
        super(i);
        this.duracion = i.getDuracion();
    }
    public Intervencion(Cita c, String duracion){
       super(c);
       this.duracion = duracion;
       this.enfermeros = new ArrayList<Enfermeria>();
       
   } 
    
   public Intervencion(Cita c, String duracion, ArrayList<Enfermeria> enfermeros){
       super(c);
       this.duracion = duracion;
       this.enfermeros = enfermeros;
       
   }
    
    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Enfermeria> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(ArrayList<Enfermeria> enfermeros) {
        this.enfermeros = enfermeros;
    }
   

    @Override
    public String toString() {
        return super.toString()+ "Intervencion{" + "duracion=" + duracion + '}';
    }
    
    public String Data () {
        
        return super.data()+ "|"+getDuracion();
    }
    public ArrayList<Intervencion> getAllIntervencion (){
    ArrayList <Intervencion> intervenciones = new ArrayList <Intervencion>();
    return intervenciones ;
    }
    
    public Intervencion getIntervencionById (long id){
        Intervencion i = new Intervencion();
    /*Este método sirve para que posteriormente se busque el id dado
      y se obtengan los datos de aquella intervencion que tenga ese id dado.
      Aunque si no existe ninguna intervencion con ese id saldra null.  
    */    
        return i;
    }
    
    public static Intervencion nuevaIntervencion () throws ParseException{
  
        Intervencion i;
        Scanner in = new Scanner(System.in);
        boolean correcto;
        
        do{
            Cita c = Cita.nuevoCita();
            i = new Intervencion();
            
            System.out.println("Introduzca duración:");
             String dur = in.nextLine();
            // i.setDuracion(dur);
            
            ArrayList <Enfermeria> enfermeros = new ArrayList();
            System.out.println("¿Quieres introducir los enfermeros? ");
            boolean resp = Utilidades.leerBoleano();
            if(resp){
               boolean resp2;
                do {
                   Enfermeria e = Enfermeria.nuevoEnfermeria();
                   enfermeros.add(e);
                   System.out.println("¿Quiere introducir otro enfermero/a?");
                   resp2 =Utilidades.leerBoleano();
                }
                while(resp2);    
                i.setEnfermeros (enfermeros);
            }
           i= new Intervencion(c, dur, enfermeros);
            System.out.println("La intervencion introducida es: " + i);
            System.out.println("¿Es correcta la intervencion?");
            correcto = Utilidades.leerBoleano();
        }
        while(!correcto);
        
     return i;   
    }    
}
