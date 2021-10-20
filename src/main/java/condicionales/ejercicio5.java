/*
    Un obrero necesita calcular su salario semanal, el cual se obtiene de
    la siguiente manera:
    + Si trabaja 40 horas o menos se le paga $16 por hora.
    + Si trabaja mas de 40 horas se le paga $16 por cada una
      de las primeras horas y $20 por cada hora extra.
 */
package condicionales;

import javax.swing.JOptionPane;

public class ejercicio5 {

    public static void main(String[] args) {

        //Variables
        int horasTrabajadas;
        float totalPagar;

        //Ingreso de datos
        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas: "));

        //Condicional
        if (horasTrabajadas <= 40) {

            //Formula
            totalPagar = horasTrabajadas * 16;
        } else {

            //Formula
            totalPagar = ((horasTrabajadas - 40) * 20) + (40 * 16);
        }
        
        //Salida por pantalla
        JOptionPane.showMessageDialog(null, "Total a Pagar: " + totalPagar);
    }
}
