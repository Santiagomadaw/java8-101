package com.ejercicios.java8.Collections;

import java.util.LinkedList;
import java.util.Queue;

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
        // Imprimimos la cola de clientes
        System.out.println("Cola de clientes en el cine:");
        for (String client : cinemaQueue) {
            System.out.println(client);
        }
        System.out.println();
        // Atendemos al primer cliente de la cola
        firstClient = cinemaQueue.poll();
        System.out.println("Atendiendo al primer cliente de la cola: " + firstClient);

        // Volvemos a imprimir la cola de clientes
        System.out.println("Cola de clientes en el cine tras atender al primer cliente:");
        for (String client : cinemaQueue) {
            System.out.println(client);
        }

    }

}
