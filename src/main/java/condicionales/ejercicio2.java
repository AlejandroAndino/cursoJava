/*
Perdir dos numeros y decir cual es el mayor o si son iguales
 */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio2 {

    public static void main(String[] args) {

        //Variables
        int numero1, numero2;

        //Ingreso de datos
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        //Condicional
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "El numero mayor es " + numero1);
        } else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "El numero mayor es " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "Ambos numeros son iguales");
        }
    }
}
