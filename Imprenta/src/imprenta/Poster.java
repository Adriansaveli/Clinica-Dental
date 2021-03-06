package imprenta;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ander
 * @version 1.0
 */
public class Poster extends Trabajo {

    private double alto;//variable tipo integer que recoge el alton del poster
    private double ancho;//variable tipo integer que recoge el ancho del poster
    private int numCopias;//variable tipo integer que recoge el número de copias de los posters solicitados

    public Poster() {
    }

    public Poster(double alto, double ancho, int numCopias, Date fechaSolicitud, Date fechaRecogida, String relieve) {
        super(fechaSolicitud, fechaRecogida, relieve);
        this.alto = alto;
        this.ancho = ancho;
        this.numCopias = numCopias;
    }

    public Poster(Poster p) {
        this.alto = p.getAlto();
        this.ancho = p.getAncho();
        this.numCopias = p.getNumCopias();
    }

    public Poster(Trabajo t) {
        super(t);
    }

    public static Poster nuevoPoster() {
        Poster p = new Poster(Trabajo.nuevoTrabajo());
        Scanner in = new Scanner(System.in);
        char c;
        do {
            System.out.println("Introduzca el alto en cm");
            double alt = in.nextDouble();
            p.setAlto(alt);
            System.out.println("Introduzca el ancho en cm");
            double anc = in.nextDouble();
            p.setAncho(anc);
            System.out.println("Introduzca el número de copias");
            int num = in.nextInt();
            p.setNumCopias(num);
            System.out.println("¿Son correctos estos datos? (introduzca una s si lo son)");
            System.out.println("Alto (cm): " + alt);
            System.out.println("Ancho (cm): " + anc);
            System.out.println("Número de copias: " + num);
            c = in.next().charAt(0);
        } while (c != 's');
        return p;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    @Override
    public String toString() {
        return "Poster{" + "alto=" + alto + ", ancho=" + ancho + ", numCopias=" + numCopias + '}';
    }

    public String data() {
        return getId() + "|" + getFechaSolicitud() + getRelieve() + "|" + getFechaRecogida() + "|" + this.getAlto() + "|" + this.getAncho() + "|" + this.numCopias;
    }
    
    public Poster getPosterById(long id) {
        /*Este método recorrerá un ArrayList con todos los posters buscando aquel con el id que le introduzcamos, y devolverá ese poster si es que existe o 
        nulo si es que no existe*/
        Poster l = new Poster();
        return l;
    }

    public ArrayList<Poster> getAllPoster() {
        /*Este método devolverá un arrayList con todos los posters existentes*/
        ArrayList<Poster> o = new ArrayList<>();
        return o;
    }

}
