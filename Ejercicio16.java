/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break
 */
package ejercicio16arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int contador=0;
        int suma=0;
            System.out.println("Bienvenidos, vamos a ingresar 20 números");
        do{
            System.out.println("Ingrese números");
            num = leer.nextInt();
            if (num==0){
        System.out.println("Se ingreso un número 0");
            break;
        }
            if (num>0){
                suma = suma+num;
            } 
            contador = contador + 1;
        } while ( contador != 20) ;{
        System.out.println("El resultado de la suma de los numeros ingresados es: " + suma);
        System.out.println("La cantidad de números ingresados fue de: "+contador);
        }
       
         
    }

}
