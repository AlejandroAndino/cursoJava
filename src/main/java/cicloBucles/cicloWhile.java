package cicloBucles;

import java.util.Scanner;

public class cicloWhile {

    public static void main(String[] args) {

        Scanner X = new Scanner(System.in);
        //Variable
        int i = 1, contador;

        System.out.println("Ingrese un numero: ");
        contador = X.nextInt();

        while (i <= contador) {
            System.out.println(i);
            i++;
        }
    }
}
