/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DAW109
 */
public class Utilidades {
    
    public static Date leerFecha() throws ParseException{
        Scanner in = new Scanner (System.in);    
        System.out.println("Escriba la fecha en formato dd/MM/yyyy");
        String fechaComoTexto = in.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaComoTexto);
        return fecha;
    }
    
    public static boolean leerBoleano(){
        Scanner in = new Scanner(System.in);
        char c;
        do {
           System.out.println("Introduzca solo 's' o 'n'.");
           c = in.nextLine().charAt(0);
            
        } while (c!= 's'&& c!= 'n'&& c!='S'&& c!='N');
        
        if (c=='s'||c=='S'){
            
            return true;
        }
        else {
            
            return false;
        }
        
    }
    
    
}
