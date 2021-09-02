/*
construir un programa que calcule y muestre por pantalla las raices
de la ecuacion de segundo grado de coeficientes reales.
 */
package operadores;

import java.util.Scanner;

public class ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner X = new Scanner(System.in);
        
        //Variables
        double a,b,c,x1,x2;
        
        //Ingreso de datos
        System.out.println("----- Calculadora de Ecuaciones 2do grado -----");
        System.out.print("A: ");
        a = X.nextDouble();
        System.out.print("B: ");
        b = X.nextDouble();
        System.out.print("C: ");
        c = X.nextDouble();
        
        //Formula
        x1 = ((-1*b) + (Math.sqrt(((b*b) - (4*a*c)))))/ (2*a);
        x2 = ((-1*b) - (Math.sqrt(((b*b) - (4*a*c)))))/ (2*a);
        
        //Salida por pantalla
        System.out.println("Resultado de X1: " + x1);
        System.out.println("Resultado de X2: " + x2);  
    }
}
