package com.ejercicios.java8.Collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

enum Products {
    POPCORN(1, "Palomitas", 5.0),
    SODA(2, "Refresco", 3.0),
    CANDY(3, "Caramelos", 2.0),
    ICE_CREAM(4, "Helado", 4.0),
    EXIT(5, "Salir", 0.0);

    private final String name;
    private final double price;
    private int id;

    Products(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

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
        // creamos un mapa donde almacenamos los clientes y productos que comprarn
        Map<String, Map<Products, Integer>> clientsPurchases = new HashMap<>();

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
                System.out.println("Entrada no válida. Por favor, ingrese un número.\\n" + //
                        "");
                continue; // Volver al inicio del bucle para pedir una opción válida
            }

            switch (selectedOption) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String clientName = sc.nextLine();
                    cinemaQueue.add(clientName);
                    System.out.println("Cliente " + clientName + " añadido a la cola.\n");
                    break;
                case 2:
                    if (!cinemaQueue.isEmpty()) {
                        firstClient = cinemaQueue.poll();
                        System.out.println("Atendiendo al cliente: " + firstClient + "\n");
                        try {
                            Thread.sleep(2000); // Simula un tiempo de espera de 2 segundos
                        } catch (InterruptedException e) {
                            System.out.println("Error al simular el tiempo de espera: " + e.getMessage());
                        }
                        // menu de compra de producto
                        System.out.println("Seleccione un producto para " + firstClient + ":\n");
                        int selectedProduct = -1;
                        Map<Products, Integer> purchases = new HashMap<>();
                        while (selectedProduct != 0) {
                            System.out.println("Productos disponibles:\n");
                            for (Products product : Products.values()) {
                                System.out.println(
                                        product.getId() + ". " + product.getName() + " - $" + product.getPrice());
                            }
                            System.out.print("Seleccione un producto (o 0 para salir): \n");
                            try {
                                selectedProduct = Integer.parseInt(sc.nextLine());
                            } catch (NumberFormatException e) {
                                System.out.println("Entrada no válida. Por favor, ingrese un número.\n");
                                continue; // Volver al inicio del bucle para pedir una opción válida
                            }

                            if (selectedProduct > 0 && selectedProduct < Products.values().length) {
                                // añado el producto seleccionado a purchases en caso de ya haberlo comprado
                                // sumo el precio al ya añadido
                                Products product = Products.values()[selectedProduct - 1];
                                purchases.put(product, purchases.getOrDefault(product, 0) + 1);
                                System.out.println(
                                        "Producto " + product.getName() + " añadido a la compra de " + firstClient
                                                + ". Precio: $" + product.getPrice());

                            } else if (selectedProduct != 0) {
                                System.out.println("Producto no válido. Intente de nuevo.");
                            }
                        }
                        // Guardamos las compras del cliente en el mapa
                        clientsPurchases.put(firstClient, purchases);
                        System.out.println("Compras de " + firstClient + ":");
                        purchases.forEach((product, quantity) -> {
                            System.out.println("- " + product.getName() + " x" + quantity + " - Precio: $"
                                    + (product.getPrice() * quantity));
                        });
                        // uso streams para mostrar el total de la compra.
                        // nota: Un map no tiene stream de modo que hay que convertirlo en Set para
                        // poder iterarlo
                        System.out.println("Total :"
                                + purchases.entrySet().stream().reduce(0.0,
                                        (total, entry) -> total + entry.getKey().getPrice() * entry.getValue(),
                                        Double::sum)
                                + "$");

                    } else {
                        System.out.println("No hay clientes en la cola.\n");
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
                        int[] index = { 1 };// como no puedo usar variable primitiva en lambda, uso un array para poder
                                            // modificar el valor
                        cinemaQueue.stream().forEach(client -> System.out.println(index[0]++ + ". " + client));
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
