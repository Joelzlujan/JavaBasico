/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda 
secuencia distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo 
se utilizan las siguientes funciones de Java Substring(), Length(), equals()
 */
package ejercicio16arriba;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador1 = 0;
        int contador2 = 0;
        String cadena = "";
        do {
            System.out.println("Ingrese cadena");
            cadena = leer.nextLine();
            cadena = cadena.toLowerCase();
            int largo = cadena.length();
            String primera = cadena.substring(0, 1);
            String ultima = cadena.substring(largo-1, largo);
            if ((largo == 5) && (primera.equals("x")) && (ultima.equals("o"))) {

                System.out.println("La longitud de la cadena es correcta, la cadena empieza con x y termina con o");
                contador1++;
            } else {
                System.out.println("No se esta cumpliendo alguna recomendacion");
                contador2++;
            }

        } while (!cadena.equals("&&&&&"));
        {
            System.out.println("Se ha ingresado la secuencia especial &&&&& para salir");
            System.out.println("La cantidad de secuencias correctas fueron " + contador1);
            System.out.println("La cantidad de secuencias incorrectas fueron " + contador2);
        }
    }

}
