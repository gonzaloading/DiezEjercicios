package DiezEjercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Estructura solicitada: Bucle do-while.
        //Consigna: Solicita al usuario por teclado un carácter
        //de confirmación ('s' o 'n'). El programa debe repetir la petición
        //mientras la opción introducida no sea ninguna de las dos opciones válidas.

        Scanner teclado = new Scanner(System.in);

        String caracter = "a";
        do {
            System.out.println("Introduce un carácter:");
            caracter = teclado.nextLine();

        }while (!caracter.equalsIgnoreCase("s") && !caracter.equalsIgnoreCase("n"));


    }
}
