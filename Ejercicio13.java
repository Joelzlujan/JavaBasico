/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package ejercicio7arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int nota;
        do {
            System.out.println("Ingrese nota del 1 al 10");
            nota = leer.nextInt();
        
        if (nota<0 || nota>10){
            System.out.println("La nota ingresada no es correcta");
        }
        } while ((nota<0) || (nota>10));     {
        System.out.println("La nota ingresada es " + nota);
    }
    }
    
}
