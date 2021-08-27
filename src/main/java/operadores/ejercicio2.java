/*
Hacer un programa que calcule e imprima el salario de un empleado a partir
de sus horas semanales trabajadas y de su salario por hora.
 */
package operadores;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner X = new Scanner(System.in);

        //Variables
        double horasSemanales, salarioHora, totalSalario;

        //Ingreso de datos
        System.out.print("Horas semanales trabajadas: ");
        horasSemanales = X.nextDouble();

        System.out.print("Salario por hora: ");
        salarioHora = X.nextDouble();

        //Formula
        totalSalario = horasSemanales * salarioHora;

        //Salida por pantalla
        System.out.println("\nSalario total: " + totalSalario);
    }
}
