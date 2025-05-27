//Simula un menú interactivo con do-while que permita repetir acciones hasta que el usuario diga "salir".

package com.ejercicios.java8.Bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

/* no se si un enum es la mejor solucion
 * pero creo que es una buena alternativa
 * para simular la selección de opciones
 */

enum Option {
    EXIT,
    FILE,
    EDIT,
    SELECTION,
    VIEW,
    TERMINAL,

}

public class FakeMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = -1;
        do {
            System.out.println("Menu");
            System.out.println("1." + Option.FILE);
            System.out.println("2." + Option.EDIT);
            System.out.println("3." + Option.SELECTION);
            System.out.println("4." + Option.VIEW);
            System.out.println("5." + Option.TERMINAL);
            System.out.println("0." + Option.EXIT);
            System.out.println("Enter an option: ");
            try {

                option = scanner.nextInt();
                if (option >= 0 && option <= 5) {
                    Option selected = Option.values()[option];
                    System.out.println("You choose: " + selected);
                } else {
                    System.out.println("Please select between 0 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, only numbers are allowed");
                scanner.next(); // limpia el buffer evita bucle infinito
            }

        } while (option != 0);
        scanner.close(); // cierra el scanner para liberar recursos
        return;
    }
}