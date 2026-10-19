package DiezEjercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Estructura solicitada: Bucle while.
        //Consigna: Muestra por consola los números enteros del 10 al 1 en orden descendente.
        //Inmediatamente después de finalizar el bucle, imprime el mensaje: "¡Despegue!".
        System.out.println("introduce numero cuenta atrás:");
        Scanner teclado = new Scanner(System.in);
        int contador = teclado.nextInt();
        while (contador != 0){
            System.out.println(contador);
            contador-- ; //es igual que poner (contador == contador -1;)
        }
        System.out.println("¡Despegue!");
    }
}
