/*
Programa que lea un caracter por teclado y compruebe si es una letra mayuscula
 */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio3 {

    public static void main(String[] args) {

        //Variables
        char l;

        //Ingreso de datos
        l = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);

        //Condicional
        if (Character.isUpperCase(l)) {
            JOptionPane.showMessageDialog(null, "La letra ingresada es mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "La letra ingresada es minuscula");
        }
    }
}
