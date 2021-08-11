/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice 
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero 
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de 
una matriz A se denota por A
T y se obtiene cambiando sus filas por columnas (o 
viceversa). 
 */
package ejercicio22arriba;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int [][] matriz = new int [3][3];
        llenarmatriz(matriz);
        mostrarmatriz(matriz);
        matriztransp(matriz);
        
    }
    
    public static void llenarmatriz(int[][]matriz){
        Random aleatorio = new Random();
        Scanner leer = new Scanner (System.in);
        int num;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese valores para matriz");
                System.out.println("["+i+"]"+";"+"["+j+"]");
                num = leer.nextInt();
                matriz[i][j]=num;
            }
            
        }
    }
    
    public static void mostrarmatriz(int [][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
    }
    
    public static void matriztransp(int[][]matriz){
        int [][]matriztransp = new int [3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                matriztransp[i][j]=matriz[j][i];
                
            }
        }
        mostrarmatriz(matriztransp);
        compruebaanti(matriz,matriztransp);
    }
    public static void compruebaanti(int[][]matriz,int[][] matriztransp){
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]==(- matriztransp[i][j])){
                contador++;
            }
                
            }
        }
        if (contador==matriz.length){
            System.out.println("La matriz es antisimetrica");
        } else{
            System.out.println("La matriz no es antisimétrica");
        }
            
    }
}
