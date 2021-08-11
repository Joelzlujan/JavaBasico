/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt().
 */
package ejercicios5a6;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int doble = num*2;
        int triple = num*3;
        double raiz = Math.sqrt(num);
        System.out.println("El doble del numero "+num+ "es: " + (num*2)+". El triple del "
        + "numero es " +(num*3)+ " y la raiz cuadrada es " + Math.sqrt(num) );
        System.out.println("El doble es " + doble );
        System.out.println("El triple es " + triple);
        System.out.println("La raiz cuadrada es " + raiz);

    }
    
}
