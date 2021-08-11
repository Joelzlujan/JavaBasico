/*
Crear un programa que dado un numero determine si es par o impar
 */
package ejercicio7arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número para determinar si es par o impar");
        int num = leer.nextInt();
        if (num == 0) {
            System.out.println("El numero es 0 ");
        } else if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }

}
