/*
Clase Math
 */
package operadores;

public class claseMath {

    public static void main(String[] args) {

        //Variables
        double raiz = Math.sqrt(9); //Raiz cuadrada

        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente); //Exponente
        
        double numero = 4.65;
        double redondeo = Math.round(numero); //Redondeo
        
        double random = Math.random();

        //Salida por pantalla
        System.out.println(raiz);
        System.out.println(resultado);
        System.out.println(redondeo);
        System.out.println(random);
    }
}
