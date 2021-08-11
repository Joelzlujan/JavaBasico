/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir 
del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicio7arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        String yon="N";
        int suma;
        int resta;
        int multi;
        int divi;
        System.out.println("Ingrese numero 1");
        int num1 = leer.nextInt();
        System.out.println("Ingrese numero 2");
        int num2 = leer.nextInt();

        do {
            System.out.println("Ingrese opcion que desea realizar");
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("Usted selecciono la suma. El resultado es " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("Usted selecciono la resta. El resultado es " + resta);
                    break;
                case 3:
                    multi = num1 * num2;
                    System.out.println("Usted selecciono la multiplicación. El resultado es " + multi);
                    break;
                case 4:
                    divi = num1 / num2;
                    System.out.println("Usted selecciono la división. El resultado es " + divi);
                    break;
                case 5:
                    System.out.println("Usted seleccion salir. Esta seguro que desea salir. S/N?");
                    yon = leer.next();
                    yon = yon.toUpperCase();
                    if (yon.equals("Y")) {
                        continue;
                    } else if (yon.equals("N")) {
                        break;
                    }
                default:
                    System.out.println("Valor no válido");
                    break;
            }
        } while (yon.equals("N"));{
        System.out.println("Usted salió del programa");
    }
    }

}
