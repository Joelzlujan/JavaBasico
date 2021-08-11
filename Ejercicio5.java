/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicios5a6;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese cantidad de grados");
        double grados = leer.nextDouble();
        System.out.println("La cantidad de grados en Farenheit es " + ((grados*9)/5+32) + "°") ;
              
        
    }
    
}
