/*
    Pedir tres numeros y mostrarlos ordenados de mayor a menor
 */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio7 {

    public static void main(String[] args) {

        //Variables
        int numero1, numero2, numero3;

        //Solicitud de Datos
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        //Condicional
        if ((numero1 > numero2) && (numero2 > numero3)) {
            JOptionPane.showMessageDialog(null, numero1 + " " + numero2 + " " + numero3);
        } else if ((numero1 > numero3) && (numero3 > numero2)) {
            JOptionPane.showMessageDialog(null, numero1 + " " + numero3 + " " + numero2);
        } else if ((numero2 > numero1) && (numero1 > numero2)) {
            JOptionPane.showMessageDialog(null, numero2 + " " + numero1 + " " + numero3);
        } else if ((numero2 > numero3) && (numero3 > numero1)) {
            JOptionPane.showMessageDialog(null, numero2 + " " + numero3 + " " + numero1);
        } else if ((numero3 > numero1) && (numero1 > numero2)) {
            JOptionPane.showMessageDialog(null, numero3 + " " + numero1 + " " + numero2);
        } else{
            JOptionPane.showMessageDialog(null, numero3 + " " + numero2 + " " + numero1);
        }
    }
}
