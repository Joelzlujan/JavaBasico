/*
Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla.
 */
package ejercicio7arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese 2 números a comparar");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1>num2){
            System.out.println("El numero "+num1+" es el más grande.");
            } else if (num2>num1){
                    System.out.println("El número "+num2+ " es el más grande");
                    }
                
        
    }
    
}
