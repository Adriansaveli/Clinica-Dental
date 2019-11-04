/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

/**
 *
 * @author VindioPerez
 * @version 1.0
 */
public class Departamento {

    private char letraDep;//Los departamentos se identifican con un carácter, valores posible: 'A', 'B' o 'C'
    public long id;// variable identificador
    
    public Departamento() {
    }

    public Departamento(char letraDep) {
        this.letraDep = letraDep;
    }

    public Departamento(Departamento d) {
        this.letraDep = d.getLetraDep();
    }

    public char getLetraDep() {
        return letraDep;
    }

    public void setLetraDep(char letraDep) {
        this.letraDep = letraDep;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Departamento{" + "letraDep=" + letraDep + ", id=" + id + '}';
    }

    

    public String data() {
        return  id + "|" + Character.toString(letraDep);
    }
}
