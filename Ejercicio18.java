/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya 
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
.
.
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. 
 */
package ejercicio16arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n=999;
        int i,j;
        String conversor;
        for (i = 0; i <= n; i++) {
            conversor = String.valueOf(i);
            if (i<10){
                System.out.println("Contador: 00"+ conversor.replace("3","E"));
            } else if (i<100){
                System.out.println("Contador: 0"+ conversor.replace("3","E"));
            } else if (i<1000){
                System.out.println("Contador: "+conversor.replace("3","E"));
            }
            
        }
    }
    
}
