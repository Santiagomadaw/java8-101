package com.ejercicios.java8.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueueExercices {

    public static void main(String[] args) {
        /*
         * Vamos a implemetar una cola del cine para ver Star Wars,
         * vamos a usar una cola para gestionar los clientes que llegan al cine
         */

        CinemaQueueManager cinemaQueue = new CinemaQueueManager();
        // creamos un mapa donde almacenamos los clientes y productos que comprarn
        List<Client> servedClients = new ArrayList<>();

        // Añadimos clientes a la cola
        cinemaQueue.addClient(new Client("Andres Cifuentes"));
        cinemaQueue.addClient(new Client("María López"));
        cinemaQueue.addClient(new Client("Juan Pérez"));
        cinemaQueue.addClient(new Client("Ana García"));
        cinemaQueue.addClient(new Client("Pedro Jiménez"));
        cinemaQueue.addClient(new Client("Laura Fernández"));

        Scanner sc = new Scanner(System.in);
        menuHandler(sc, cinemaQueue, servedClients);
    }

    public static void nextClientPurchaseHandler(CinemaQueueManager cinemaQueue, Scanner sc,
            List<Client> servedClients) {
        if (!cinemaQueue.isEmpty()) {
            Client firstClient = cinemaQueue.serveNextClient();
            servedClients.add(firstClient);
            System.out.println("Atendiendo al cliente: " + firstClient.getName() + "\n");
            // menu de compra de producto
            System.out.println("Seleccione un producto para " + firstClient.getName() + ":\n");
            purchaseHandler(firstClient, sc);
            System.out.println("Compras de " + firstClient.getName() + ":");

            showClientSumary(firstClient.getName(), servedClients);

        } else {
            System.out.println("No hay clientes en la cola.\n");
        }
    }
    // listar clientes con posicion en la cola

    public static void listNumberedServedClients(List<Client> servedClients) {
        if (!servedClients.isEmpty()) {
            System.out.println("Clientes atendidos:");
            for (int i = 0; i < servedClients.size(); i++) {
                System.out.println((i + 1) + "- " + servedClients.get(i).getName());
            }
        } else {
            System.out.println("No hay clientes atendidos.");
        }
    }

    public static void showClientSumary(String clientName, List<Client> servedClients) {
        // busco el cliente por nombre
        Client client = servedClients.stream()
                .filter(c -> c.getName().equalsIgnoreCase(clientName)).findFirst()
                .orElse(null);

        System.out.println("Compras de " + client.getName() + ":");
        client.getPurchases().forEach((product, quantity) -> {
            System.out.println("- " + product.getName() + " x" + quantity + " - Precio: $"
                    + (product.getPrice() * quantity));
        });
        // uso streams para mostrar el total de la compra.
        // nota: Un map no tiene stream de modo que hay que convertirlo en Set para
        // poder iterarlo
        System.out.println("Total :"
                + client.getPurchases().entrySet().stream().reduce(0.0,
                        (total, entry) -> total + entry.getKey().getPrice() * entry.getValue(),
                        Double::sum)
                + "$\n");
    }

    public static void newClientHandler(CinemaQueueManager cinemaQueue, Scanner sc) {
        System.out.print("Ingrese el nombre del cliente: ");
        Client clientName = new Client(sc.nextLine());
        cinemaQueue.addClient(clientName);
        System.out.println("Cliente " + clientName.getName() + " añadido a la cola.\n");
    }

    public static void purchaseHandler(Client client, Scanner sc) {
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

            if (selectedProduct > 0 && selectedProduct <= Products.values().length) {
                // añado el producto seleccionado a purchases en caso de ya haberlo comprado
                // sumo el precio al ya añadido
                Products product = Products.values()[selectedProduct - 1];
                client.addPurchase(product);
                System.out.println(
                        "Producto " + product.getName() + " añadido a la compra de " + client.getName()
                                + ". Precio: $" + product.getPrice());

            } else if (selectedProduct != 0) {
                System.out.println("Producto no válido. Intente de nuevo.");
            }
        }
    }

    public static void menuHandler(Scanner sc, CinemaQueueManager cinemaQueue,
            List<Client> servedClients) {
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

            Client firstClient;
            switch (selectedOption) {
                case 1:
                    newClientHandler(cinemaQueue, sc);
                    break;
                case 2:
                    nextClientPurchaseHandler(cinemaQueue, sc, servedClients);
                    break;
                case 3:
                    if (!cinemaQueue.isEmpty()) {
                        firstClient = cinemaQueue.peekNextClient();
                        System.out.println("Primer cliente en la cola: " + firstClient.getName());
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;
                case 4:
                    if (!cinemaQueue.isEmpty()) {
                        System.out.println("Clientes en la cola:");
                        cinemaQueue.getClientsInQueue().forEach(client -> {
                            System.out.println("- " + client.getName());
                        });
                    } else {
                        System.out.println("No hay clientes en la cola.");
                    }
                    break;
                case 5:
                    System.out.println("Número de clientes en la cola: " + cinemaQueue.getQueueSize());
                    break;
                case 6:
                    cinemaQueue.clearQueue();
                    System.out.println("Cola limpiada. No hay clientes en la cola.");
                    break;
                case 7:
                    listNumberedServedClients(servedClients);
                    System.out.print("Ingrese el número del cliente para ver su resumen de compras: ");
                    try {
                        int clientNumber = Integer.parseInt(sc.nextLine());
                        if (clientNumber < 1 || clientNumber > servedClients.size()) {
                            System.out.println("Número inválido.");
                        } else {
                            Client lookedClient = servedClients.get(clientNumber - 1);
                            showClientSumary(lookedClient.getName(), servedClients);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida. Ingrese un número.");
                    }
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
