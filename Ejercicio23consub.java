/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le 
pida al usuario un numero a buscar en el vector. El programa mostrará donde se 
encuentra el numero y si se encuentra repetido
 */
package ejercicio22arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio23consub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese tamaño de vector");
        int n = leer.nextInt();
        int vector[] = new int [n];
        System.out.println("Ingrese numero a encontrar");
        int num= leer.nextInt();
        rellenarv(n,vector,num);
    }
    public static void rellenarv(int n,int vector[],int num){
        int comparador=0;
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random() * 10);
            System.out.print(vector[i]+",");
        } 
        for (int i = 0; i < n; i++) {
            if (vector[i]==num){
                System.out.println("\n");
                System.out.println("Se encontro el número ");
                System.out.println(vector[i]+" en la posición "+i);
            } else {
                comparador++;
            }
        }
        if (comparador==n){
            System.out.println("No se encontro el número en el arreglo");
        }
    }
}
