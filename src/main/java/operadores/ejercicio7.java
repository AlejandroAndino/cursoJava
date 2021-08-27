/*
Construir un programa que, dado un numero total de horas
devuelva el numero de semanas, dias y horas equivalentes.
Pro ejemplo, dado un total de 1000 horas debe mostrar 5 semanas,
6 dias y 16 horas.
 */
package operadores;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner X = new Scanner(System.in);

        //Variables
        int totalHoras, semanas, dias, horas;

        //Ingreso de datos
        System.out.print("Total de horas: ");
        totalHoras = X.nextInt();

        //Formula
        semanas = (totalHoras / 168);
        dias = ((totalHoras % 168) / 24);
        horas = (totalHoras % 24);

        //Salida por pantalla
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
    }
}
