/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre traspuesta
 */
package ejercicio22arriba;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        llenarmatriz(matriz);
        mostrarmatriz(matriz);
        transponermatriz(matriz);
    }

    public static void llenarmatriz(int[][] matriz) {                           //creamos la funcion para llenar matriz
        Random aleatorio = new Random();                                    //creamos la clase random como aleatorio
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = aleatorio.nextInt(20);                            //llenamos la matriz de aleatorios
            }
        }
    }

    public static void mostrarmatriz(int[][] matriz) {
        System.out.println("La matriz se verá así");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println(" ");
        }
    }
    public static void transponermatriz(int[][] matriz){                         //funcion para transponer matriz
        int [][] matriztrans = new int [4][4];                                    //declaramos nueva matriz variable local
        for (int i = 0; i < matriz.length; i++) {                   
            for (int j = 0; j < matriz.length; j++) {
                matriztrans[i][j]=matriz[j][i];                                 //para transponer solo cambiamos i x j... 
            }
            
        }
        System.out.println("La matriz transpuesta será así");
        mostrarmatriz(matriztrans);                                              //puedo llamar al subproceso desde aca con la variable local
                                                                                   //matriz trans.. si lo hago desde el principal, no puedo xq declare aca matriz trans
    }
}
