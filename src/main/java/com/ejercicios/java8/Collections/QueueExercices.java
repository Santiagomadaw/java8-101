package com.ejercicios.java8.Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

enum MenuOptions {
    ADD_CLIENT(1, "Añadir cliente a la cola"),
    ATTEND_CLIENT(2, "Atender al primer cliente de la cola"),
    VIEW_FIRST_CLIENT(3, "Ver el primer cliente de la cola"),
    SHOW_CLIENTS(4, "Listar todos los clientes en la cola"),
    COUNT_CLIENTS(5, "Contar el número de clientes en la cola"),
    CLEAR_QUEUE(6, "Limpiar la cola"),
    EXIT(0, "Salir");

    private final int option;
    private final String description;

    MenuOptions(int option, String description) {
        this.option = option;
        this.description = description;
    }

    public int getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }
}

public class QueueExercices {

    public static void main(String[] args) {
        /*
         * Vamos a implemetar una cola del cine para ver Star Wars,
         * vamos a usar una cola para gestionar los clientes que llegan al cine
         */
        String firstClient;
        Queue<String> cinemaQueue = new LinkedList<>();
        // Añadimos clientes a la cola
        cinemaQueue.add("Andres Cifuentes");
        cinemaQueue.add("María López");
        cinemaQueue.add("Juan Pérez");
        cinemaQueue.add("Ana García");
        cinemaQueue.add("Pedro Jiménez");
        cinemaQueue.add("Laura Fernández");

        Scanner sc = new Scanner(System.in);

        int selectedOption = -1;
        while (selectedOption != 0) {
            System.out.println("Seleccione una opción:");
            for (MenuOptions option : MenuOptions.values()) {
                System.out.println(option.getOption() + ". " + option.getDescription());
            }

            try {
                selectedOption = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                continue; // Volver al inicio del bucle para pedir una opción válida
            }

            switch (selectedOption) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String clientName = sc.nextLine();
                    cinemaQueue.add(clientName);
                    System.out.println("Cliente " + clientName + " añadido a la cola.");
                    break;
                case 2:
                    if (!cinemaQueue.isEmpty()) {
                        firstClient = cinemaQueue.poll();
                        System.out.println("Atendiendo al cliente: " + firstClient);
                        try {
                            Thread.sleep(2000); // Simula un tiempo de espera de 2 segundos
                        } catch (InterruptedException e) {
                            System.out.println("Error al simular el tiempo de espera: " + e.getMessage());
                        }

                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;
                case 3:
                    if (!cinemaQueue.isEmpty()) {
                        firstClient = cinemaQueue.peek();
                        System.out.println("Primer cliente en la cola: " + firstClient);
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;
                case 4:
                    if (!cinemaQueue.isEmpty()) {
                        System.out.println("Clientes en la cola:");
                        cinemaQueue.forEach(System.out::println);
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;
                case 5:
                    System.out.println("Número de clientes en la cola: " + cinemaQueue.size());
                    break;
                case 6:
                    cinemaQueue.clear();
                    System.out.println("Cola limpiada. No hay clientes en la cola.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

}
