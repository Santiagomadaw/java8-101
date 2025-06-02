//Jugadores seleccionados para la Eurocopa 2024Porteros: David Raya, Álex Remiro y Unai Simón. Defensas: Pedro Porro, Óscar Mingueza, Robin Le Normand, Pau Cubarsí, Dean Huijsen, Dani Vivian, Álex Grimaldo y Marc Cucurella. Centrocampistas: Martín Zubimendi, Gavi, Fermín, Isco, Fabián, Mikel Merino, Álex Baena y Pedri.
package com.ejercicios.java8.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExercises {

    public static void main(String[] args) {
        Set<String> player = new HashSet<>();
        // añadimos a los jugadores del comienzo de la Eurocopa 2024
        player.add("Lamile Yamal");
        player.add("Álvaro Morata");
        player.add("Unai Simón");
        player.add("Rodri Hernández");
        player.add("Gavi");
        player.add("Pedri");
        player.add("Cucurella");
        player.add("Dani Olmo");
        player.add("Isco");
        player.add("Oriazabal");
        player.add("Le Normand");
        player.add("Iker Casillas"); // Jugador no seleccionado, pero se añade para comprobar la funcionalidad

        // Añadir un jugador que ya existe en el conjunto
        player.add("Álvaro Morata"); // Duplicado, no se añadirá
        player.add("Rodri Hernández"); // Duplicado, no se añadirá
        player.add("Iker Casillas"); // Jugador no seleccionado, pero se añade para comprobar la funcionalidad

        // operaciones con el conjunto de jugadores
        System.out.println("Número de jugadores: " + player.size());
        System.out.println("¿El jugador 'Álvaro Morata' está en el conjunto? " + player.contains("Álvaro Morata"));
        System.out.println("¿El jugador 'Pedri' está en el conjunto? " + player.contains("Pedri"));
        System.out.println("¿El jugador 'Xavi' está en el conjunto? " + player.contains("Iker Casillas"));
        System.out.println("¿El jugador 'Iker Casillas' está en el conjunto? " + player.contains("Iker Casillas"));
        System.out.println();
        // Eliminar un jugador del conjunto
        player.remove("Iker Casillas");
        System.out.println("Número de jugadores después de eliminar a 'Iker Casillas': " + player.size());
        System.out.println("¿El jugador 'Iker Casillas' está en el conjunto? " + player.contains("Iker Casillas"));
        System.out.println();

        // Comprobar si el conjunto está vacío
        System.out.println("¿El conjunto de jugadores está vacío? " + player.isEmpty());
        System.out.println();

        // Imprimir el conjunto de jugadores
        System.out.println("Conjunto de jugadores:");
        for (String name : player) {
            System.out.println(name);
        }
        System.out.println();
        // Limpiar el conjunto de jugadores
        player.clear();
        System.out.println("Número de jugadores después de limpiar el conjunto: " + player.size());
        System.out.println("¿El conjunto de jugadores está vacío? " + player.isEmpty());
        System.out.println();

        // Imprimir el conjunto de jugadores
        System.out.println("Conjunto de jugadores tras vaciado:");
        for (String name : player) {
            System.out.println(name);
        }
        System.out.println();

        // Añadir de nuevo algunos jugadores
        player.add("Lamile Yamal");
        player.add("Álvaro Morata");
        player.add("Unai Simón");
        player.add("Rodri Hernández");
        player.add("Gavi");
        player.add("Pedri");
        player.add("Cucurella");
        player.add("Dani Olmo");
        player.add("Isco");
        player.add("Oriazabal");
        player.add("Le Normand");

        // Imprimir el conjunto de jugadores
        System.out.println("Conjunto de jugadores:");
        // Usar forEach para imprimir los jugadores metodo referenciado 😎
        player.forEach(System.out::println);
    }
}