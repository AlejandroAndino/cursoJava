/*
Una compania de venta de carros usados, paga a su personal de ventas
un salario de $1000 mensuales, mas una comision de $150 por cada carro 
vendido, mas el 5% del valor de la ventta por carro. Cada mes el capturista
de la empresa ingresa en la computadora los datos pertinentes. Hacer un
programa que calcule e imprima el salario mensual de un vendedor dado.
 */
package operadores;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner X = new Scanner(System.in);

        //Variables
        double totalSalario, salarioMensual = 1000, comision = 150,
                porcentajeVenta = 0.05, valorVenta, totalComision;
        int autoVendidos;
        String nombreVendedor;

        //Ingreso de datos
        System.out.print("Nombre del Vendedor: ");
        nombreVendedor = X.next();

        System.out.print("Cantidad de autos vendidos: ");
        autoVendidos = X.nextInt();

        System.out.print("Valor de la venta por auto: ");
        valorVenta = X.nextDouble();

        //Formula
        totalComision = (comision * autoVendidos) + (porcentajeVenta * valorVenta * autoVendidos);
        totalSalario = (salarioMensual + totalComision);

        //Salida por pantalla
        System.out.println("\nNombre del Vendedor: " + nombreVendedor);
        System.out.println("Total Salario: " + totalSalario);
    }

}
