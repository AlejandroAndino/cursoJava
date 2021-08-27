/*
Hacer unprograma que calcule e imprima la suma de tres calificaciones
 */
package operadores;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner X = new Scanner(System.in);

        //Variables
        double nota1, nota2, nota3, suma;

        //Ingreso de datos
        System.out.print("Ingrese la primera nota: ");
        nota1 = X.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = X.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        nota3 = X.nextDouble();

        //Formula
        suma = nota1 + nota2 + nota3;

        //Salida por pantalla
        System.out.println("\nLa suma total es: " + suma);
    }
}
