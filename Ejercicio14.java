/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere 
el límite inicial. 
 */
package ejercicio7arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int limite ;
        int acumulador = 0;
        System.out.println("Ingrese limite positivo al cual quiere llegar");
        limite = leer.nextInt();
        do{
            System.out.println("Ingrese numeros para sumar y llegar al limite");
            num = leer.nextInt();
            acumulador = acumulador + num;
            System.out.println("La suma hasta el momento es "+acumulador);
            
            
        }   while (acumulador < limite); {
            System.out.println("Las sumas realizadas llegaron al limite o lo superaron. El total es: " + acumulador);
    }


    }
}
