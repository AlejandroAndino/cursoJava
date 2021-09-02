/*
Condicionales sentencia If Else
 */
package condicionales;

import javax.swing.JOptionPane;

public class sentenciaIfElse {

    public static void main(String[] args) {

        //Variables
        int numero, dato = 5;

        //Ingreso de datos
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        } else {
            JOptionPane.showMessageDialog(null, "El numero ingresado es distinto a 5");
        }
    }
}
