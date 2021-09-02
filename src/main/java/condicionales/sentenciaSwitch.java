/*
Sentencia Switch
 */
package condicionales;

import javax.swing.JOptionPane;

public class sentenciaSwitch {

    public static void main(String[] args) {

        //Variables
        int numero;

        //Ingreso de datos
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entre 1 y 5: "));

        //Switch
        switch (numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "El numero ingresado es 1");

                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El numero ingresado es 2");

                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El numero ingresado es 3");

                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El numero ingresado es 4");

                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El numero ingresado es 5");

                break;
            default:
                JOptionPane.showMessageDialog(null, "Error numero no se encuentra entre 1 a 5");
        }
    }
}
