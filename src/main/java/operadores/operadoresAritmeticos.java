/*
Operadores Aritmeticos
 */
package operadores;

import java.util.Scanner;

public class operadoresAritmeticos {

    public static void main(String[] args) {

        Scanner X = new Scanner(System.in);

        //Variables
        float numero1, numero2;
        float suma, resta, div, mult, res;

        //Ingreso de datos
        System.out.print("Digite 2 numeros: ");
        numero1 = X.nextFloat();
        numero2 = X.nextFloat();

        //Formulas
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        res = numero1 % numero2;

        //Salida por pantalla
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + mult);
        System.out.println("La division es: " + div);
        System.out.println("El residuo es: " + res);
    }
}
