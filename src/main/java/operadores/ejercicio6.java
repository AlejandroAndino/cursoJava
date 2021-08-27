/*
Hacer un programa que calcule el cuadrado de una suma
 */
package operadores;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner X = new Scanner(System.in);

        //Variables
        double a, b, respuesta;

        //Ingreso de datos
        System.out.println("----- Cuadrado de una Suma -----");
        System.out.print("Digite el valor de a: ");
        a = X.nextDouble();
        System.out.print("Digite el valor de b: ");
        b = X.nextDouble();

        //Formula
        respuesta = ((Math.pow(a, 2)) + (Math.pow(b, 2)) + (2 * a * b));

        //Salida por pantalla
        System.out.println("\nCuadrado de la suma es: " + respuesta);
    }
}
