package DiezEjercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Ejercicio 5: Suma sucesiva hasta superar umbral
        //
        //Estructura solicitada: Bucle while + variable acumulador.
        //Consigna: Suma números enteros consecutivos empezando en 1 ($1 + 2 + 3 + \dots$)
        //de manera iterativa hasta que la suma alcance o supere el valor 100.
        //Al terminar, imprime la suma final obtenida y cuál fue el último número sumado.

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce numero tope." + "ejemplo 100");
        int numeroTope = teclado.nextInt();
        System.out.println("introduce de que número empezar:" + "ejemplo 1");
        int numeroEmpieza = teclado.nextInt();
        int numeroSuma = 0;

        while (numeroSuma < 100){

            numeroEmpieza++;

        }
        System.out.println("suma final" + numeroSuma);
        //me falta como saber cual fue el ultimo numero sumado.

    }
}
