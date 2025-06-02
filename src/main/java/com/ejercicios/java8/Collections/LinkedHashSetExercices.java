package com.ejercicios.java8.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExercices {
    public static void main(String[] args) {
        // LinkedHashSet mantiene el orden de inserción
        Set<String> spaceShip = new LinkedHashSet<>();

        // Añadimos naves espaciales al conjunto
        spaceShip.add("Millennium Falcon");
        spaceShip.add("X-Wing");
        spaceShip.add("TIE Fighter");
        spaceShip.add("Star Destroyer");
        spaceShip.add("Death Star");
        spaceShip.add("Slave I");

        // Imprimimos el conjunto de naves espaciales
        System.out.println("Conjunto de naves espaciales:");
        spaceShip.forEach(System.out::println);
        System.out.println();

        // Intentamos añadir naves que ya existe en el conjunto
        spaceShip.add("Millennium Falcon");
        spaceShip.add("X-Wing");

        System.out.println("Conjunto de naves espaciales 2:");
        spaceShip.forEach(System.out::println);
        System.out.println();

        // eliminamos una nave espacial del conjunto
        spaceShip.remove("Death Star");
        System.out.println("Conjunto de naves espaciales tras eliminar 'Death Star':");
        spaceShip.forEach(System.out::println);
        System.out.println();
    }
}
