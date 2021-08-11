/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el 
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 *
 */
package ejercicio16arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = leer.nextInt();
        System.out.println("Ingrese numero 3");
        int num3 = leer.nextInt();
        System.out.println("Ingrese numero 4");
        int num4 = leer.nextInt();
        System.out.println("");
        System.out.print(num1);
        for (int i = 1; i <= num1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num2);        
        for (int i = 1; i <= num2; i++) {
            System.out.print("*");
        }
        System.out.println("");        
        System.out.print(num3);
        for (int i = 1; i <= num3; i++) {
            System.out.print("*");
        }
        System.out.println("");        
        System.out.print(num4);
        for (int i = 1; i <= num4; i++) {
            System.out.print("*");
        }        
    }
    
}
