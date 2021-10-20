/*
    Hacer un programa que tome dos numeros y que diga
    si ambos son pared o impares
 */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio6 {

    public static void main(String[] args) {

        //Variables
        int numero1, numero2;

        //Ingreso de datos
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        //Condicional
        if ((numero1 % 2 == 0) && (numero2 % 2 == 0)) {

            JOptionPane.showMessageDialog(null, "Ambos numeros son pares");

        } else if ((numero1 % 2 != 0) && (numero2 % 2 != 0)) {

            JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Uno de los numeros es par y el otro impar");
           
        }
    }
}
