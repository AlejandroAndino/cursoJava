/*
    Pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene
 */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio8 {

    public static void main(String[] args) {

        //Variables
        int numero;

        //Solicitud de datos
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 0 a 99 999: "));

        //Condicional
        if (numero < 10) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " posee 1 cifra");
        } else if (numero >= 10 && numero < 100) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " posee 2 cifra");
        } else if (numero >= 100 && numero < 1000) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " posee 3 cifra");
        } else if (numero >= 1000 && numero < 10000) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " posee 4 cifra");
        } else if (numero >= 10000 && numero < 100000) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " posee 5 cifra");
        }else{
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no se encuentra en el rango");
        }
    }

}
