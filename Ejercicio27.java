/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un 
programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9
 */
package ejercicio22arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        llenarmatriz(matriz);
        comprobarmatriz(matriz);
    }

    public static void llenarmatriz(int[][] matriz) {
        int num;
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese valores para matriz, los valores deben ser entre 1 y 9");
                System.out.println("[" + i + "]" + ";" + "[" + j + "]");
                num = leer.nextInt();
                if (num >= 1 && num <= 9) {
                    matriz[i][j] = num;
                } else {
                    System.out.println("Los numeros deben estar entre 1 y 9");
                }

            }
        }
    }

    public static void comprobarmatriz(int[][] matriz) {
        int suma = 0;
        int sumalin = 0;
        int contador = 0;
        int sumacol = 0;
        int diagprin = 0;
        int diagsec = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma = matriz[i][j] + suma;
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            sumalin = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumalin = matriz[i][j] + sumalin;
                if (sumalin == suma) {
                    contador++;
                }
            }
        }
        for (int j = 0; j < matriz.length; j++) {
            sumacol = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumacol = matriz[i][j] + sumacol;
                if (sumacol == suma) {
                    contador++;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    diagprin = matriz[i][j] + diagprin;
                    if (diagprin == suma) {
                        contador++;
                    }
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j == matriz.length-1) {
                    diagsec = matriz[i][j] + diagsec;
                    if (diagsec == suma) {
                        contador++;
                    }
                }
            }

        }
        if (contador==8){
            System.out.println("La matriz es mágica");
        }else {
            System.out.println("La matriz no es mágica");
        }
    }
}
