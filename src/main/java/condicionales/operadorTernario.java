/*

 */
package condicionales;

import javax.swing.JOptionPane;

public class operadorTernario {

    public static void main(String[] args) {

        //Variables
        int numero;
        String mensaje;

        //Ingreso de datos
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        //Operador Ternario
        mensaje = (numero%2 == 0) ? "Es par" : "Es impar";
        
        //Salida por pantalla
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
