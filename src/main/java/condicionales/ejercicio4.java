/*
    En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere
    los $300. Cual sera la cantidad que pagara una persona por su compre?
 */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio4 {

    public static void main(String[] args) {

        //Variables
        double descuento = 0.20, valorCompra, totalPagar;

        //Ingreso de datos
        valorCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la compra: "));

        //Formula
        totalPagar = valorCompra - (descuento * valorCompra);

        //Salida por pantalla
        JOptionPane.showMessageDialog(null, "El valor total a pagar es: " + totalPagar);

    }
}
