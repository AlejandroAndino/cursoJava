/*
La calificacion final de un estudiante de Informatica se calcula con base
a las calificaciones de cuatro aspectos de su rendimiento academico:
participacion, primer examen, segundo examen y examen final. Sabiendo
que las calificaciones anteriores entran a la clasificacion final con
ponderaciones del 10%, 25%, 25% y 40%. Hacer un programa que calcule e
imprima la calificacion final obtenida por un estudiante.
 */
package operadores;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner X = new Scanner(System.in);

        //Variables
        double participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
        String nombreAlumno;

        //Ingreso de datos
        System.out.println("----- Ingreso de Notas -----");
        System.out.print("Nombre del Alumno: ");
        nombreAlumno = X.next();
        System.out.print("Participacion: ");
        participacion = X.nextDouble();
        System.out.print("Primer Exmane: ");
        primerExamen = X.nextDouble();
        System.out.print("Segundo Examen: ");
        segundoExamen = X.nextDouble();
        System.out.print("Examen Final: ");
        examenFinal = X.nextDouble();

        //Formula
        notaFinal = (participacion * 0.10) + (primerExamen * 0.25)
                + (segundoExamen * 0.25) + (examenFinal * 0.40);

        //Salida por pantalla
        System.out.println("Nombre del Alumno: " + nombreAlumno);
        System.out.println("Nota Final: " + notaFinal);
    }
}
