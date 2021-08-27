/*
 Guillermo tiene N dolares. Luis tiene la mitad de lo que posee
Guillermo. Juan tiene la mitad de lo que posee Luis y Guillermo
juntos. Hacer un programa que calcule e imprima la cantidad de dinero
que tienen entre los tres.
 */
package operadores;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner X = new Scanner(System.in);

        //Variables
        double g, l, j, total;

        //Ingreso de datos
        System.out.print("Cantidad de dinero de Guillermo: ");
        g = X.nextDouble();

        //Formula
        l = g / 2;
        j = (g + l) / 2;
        total = g + j + l;

        //Salida por pantalla
        System.out.println("\nTotal de dinero: " + total);
    }
}
