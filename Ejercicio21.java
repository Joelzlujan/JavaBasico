/*
 Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
converir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es: 
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € 
 */
package ejercicio16arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        double euros;
        String moneda;
        System.out.println("Ingrese cantidad de Euros");
        euros = leer.nextInt();
        System.out.println("Ingrese moneda a la cual convertir (dolar, yen, libra)");
        moneda= leer.next();
        moneda=moneda.toUpperCase();
        conversion(euros,moneda);
    }
    //procedimiento para realizar la conversión
    public static void conversion(double euros,String moneda){
        double cambio=0;
        switch (moneda){
            case "DOLAR":
                cambio=euros*1.28611;
                System.out.println("El cambio es de "+cambio);
                break;
            case "YEN":
                cambio=euros*129.852;
                System.out.println("El cambio en moneda yen es :"+cambio);
                break;
            case "LIBRA":
                cambio=euros*0.86;
                System.out.println("El cambio en moneda libra es: "+cambio);
                break;
            default:
                System.out.println("Comando inválido");
                break;
        }

    }
    
}
