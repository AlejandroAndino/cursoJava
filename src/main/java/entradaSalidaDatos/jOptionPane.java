/*
JOptionPane
Entrada y salida de datos
 */
package entradaSalidaDatos;

//Imports
import javax.swing.JOptionPane;

public class jOptionPane {

    public static void main(String[] args) {

        //Variables
        String cadena;
        int entero;
        char caracter;
        double decimal;

        //Ingreso de datos
        //String's
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        //Int's
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        //Char's
        caracter = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        //Double
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

        //Salida por pantalla con JOptionPane
        JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " + entero);
        JOptionPane.showMessageDialog(null, "El caracter es: " + caracter);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
    }
}
