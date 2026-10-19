package DiezEjercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Ejercicio 3: Conteo de múltiplos en un rango
        //
        //Estructura solicitada: (Bucle while + variable contador).
        //Consigna: Recorre los números enteros del 1 al 50.
        // Cuenta cuántos de ellos son múltiplos exactos de 7 e imprime el resultado
        // total al finalizar el recorrido.

        Scanner teclado = new Scanner(System.in);
        System.out.println("El número final del conteo es 50.");
        System.out.println("Introduce primer numero del cual empezar el conteo:");
        int empezarContador = teclado.nextInt();
        System.out.println("introduce múltiplo para el conteo de exactos:");
        int numeroMultiplos = teclado.nextInt();
        int cantidadMultiplos = 0;

        while (empezarContador != 51){
            System.out.println(empezarContador);
            empezarContador++;
            if (empezarContador % numeroMultiplos == 0 ){
                cantidadMultiplos++;
            }
        }
        System.out.println("Son múltiplos exactos de " + numeroMultiplos + " = "+  cantidadMultiplos + " veces");

    }
}
