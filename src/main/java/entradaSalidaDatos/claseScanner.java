package entradaSalidaDatos;

import java.util.Scanner;

public class claseScanner {

    public static void main(String[] args) {

        //Clase Scanner
        Scanner X = new Scanner(System.in);

        //Variables
        int numero;

        //Ingreso de datos
        System.out.print("Ingrese un numero: ");
        numero = X.nextInt();

        //Salida por pantalla
        System.out.print("El numero ingresado es: " + numero);
    }
}
