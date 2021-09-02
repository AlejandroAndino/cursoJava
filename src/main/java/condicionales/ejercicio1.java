/*
Hacer un programa que lea un numero entero y muestre si el numero es multiplo
de 10.
 */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio1 {
    
    public static void main(String[] args) {

        //Variables
        int numero;
        String mensaje;

        //Ingreso de datos
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        //Condicional
        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es multiplo de 10.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no es multiplo de 10.");
        }

        //Operador ternario
        mensaje = (numero % 10 == 0) ? "Es multiplo de 10" : "No es multiplo de 10";
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
