package com.ejercicios.java8.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class QueueExercices {

    public static void main(String[] args) {
        /*
         * Vamos a implemetar una cola del cine para ver Star Wars,
         * vamos a usar una cola para gestionar los clientes que llegan al cine
         */

        Client firstClient;
        Queue<Client> cinemaQueue = new LinkedList<>();
        // creamos un mapa donde almacenamos los clientes y productos que comprarn
        List<Client> clientsPurchases = new ArrayList<>();

        // Añadimos clientes a la cola
        cinemaQueue.add(new Client("Andres Cifuentes"));
        cinemaQueue.add(new Client("María López"));
        cinemaQueue.add(new Client("Juan Pérez"));
        cinemaQueue.add(new Client("Ana García"));
        cinemaQueue.add(new Client("Pedro Jiménez"));
        cinemaQueue.add(new Client("Laura Fernández"));

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
                    Client clientName = new Client(sc.nextLine());
                    cinemaQueue.add(clientName);
                    System.out.println("Cliente " + clientName.getName() + " añadido a la cola.\n");
                    break;
                case 2:
                    if (!cinemaQueue.isEmpty()) {
                        firstClient = cinemaQueue.poll();
                        clientsPurchases.add(firstClient);
                        System.out.println("Atendiendo al cliente: " + firstClient.getName() + "\n");
                        // menu de compra de producto
                        System.out.println("Seleccione un producto para " + firstClient.getName() + ":\n");
                        int selectedProduct = -1;
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
                                firstClient.addPurchase(product);
                                System.out.println(
                                        "Producto " + product.getName() + " añadido a la compra de " + firstClient
                                                + ". Precio: $" + product.getPrice());

                            } else if (selectedProduct != 0) {
                                System.out.println("Producto no válido. Intente de nuevo.");
                            }
                        }
                        System.out.println("Compras de " + firstClient.getName() + ":");

                        firstClient.getPurchases().forEach((product, quantity) -> {
                            System.out.println("- " + product.getName() + " x" + quantity + " - Precio: $"
                                    + (product.getPrice() * quantity));
                        });
                        // uso streams para mostrar el total de la compra.
                        // nota: Un map no tiene stream de modo que hay que convertirlo en Set para
                        // poder iterarlo
                        System.out.println("Total :"
                                + firstClient.getPurchases().entrySet().stream().reduce(0.0,
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
                        System.out.println("Primer cliente en la cola: " + firstClient.getName());
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
