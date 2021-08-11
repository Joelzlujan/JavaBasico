/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.
 */
package ejercicio22arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int vector[];
        vector = new int [100];
        // o int vector []= new int [100]
        int num=0;
        for (int i = 0; i <= vector.length-1; i++) {
            vector[i]= i;
        }

        for (int i=vector.length-1; i>=0; i--){
            System.out.print(vector[i]+",");
        }
        
    }
    
}
