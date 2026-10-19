package DiezEjercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Ejercicio 4: Control de intentos de autenticación
        //
        //Estructura solicitada: Bucle do-while + variable contador.
        //Consigna: Simula una pantalla de desbloqueo solicitando un PIN numérico
        // (clave predefinida: 1234). El usuario debe seguir introduciendo números
        // mientras no acierte. Al acertar, muestra por consola: "Acceso concedido en X intentos"
        // (donde X es el número total de pruebas realizadas).

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce número pin." + " ejemplo 1234");
        int numeroPin = teclado.nextInt();
        int contador = 0;
        int numeroSalida = 0;
        do {

            System.out.println("introduce numero para acceder");
            numeroSalida = teclado.nextInt();
            contador++;


        }while (numeroSalida != numeroPin);
        System.out.println("Acceso concedido en " + contador + " intentos");

    }
}
