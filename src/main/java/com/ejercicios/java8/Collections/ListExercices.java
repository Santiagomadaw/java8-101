//Crear una lista de nombres, ordenarla y eliminar duplicados.
package com.ejercicios.java8.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ListExercices {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Luke");
        names.add("Leia");
        names.add("Han");
        names.add("Luke");
        names.add("Anakin");
        names.add("Leia");
        names.add("Padmé");
        names.add("Obi-Wan");
        names.add("Yoda");
        names.add("Darth Vader");
        names.add("Yoda");

        // Ordenar la lista Usando lambda
        names.sort((a, b) -> a.compareToIgnoreCase(b));

        // Method reference
        names.sort(String::compareToIgnoreCase);

        // funcion para eliminar duplicados

        List<String> uniqueNames = new ArrayList<>();
        for (String name : names) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }
        System.out.println("Lista de nombres ordenada y sin duplicados 1:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        /*
         * tambien podemo hacer una doble con version. de arraylist a
         * set y luego a arraylist de nuevo, aunque pierde el orden
         */

        List<String> uniqueNames2 = new ArrayList<>(new HashSet<>(names));
        System.out.println("Lista de nombres ordenada y sin duplicados 2:");
        uniqueNames2.sort((a, b) -> a.compareToIgnoreCase(b));
        for (String name : uniqueNames2) {
            System.out.println(name);
        }
        // Otra forma de eliminar duplicados usando streams, com el metodo distinct()
        System.out.println("Lista de nombres ordenada y sin duplicados 3:");
        List<String> uniqueNames3 = new ArrayList<>(names.stream().distinct()
                .collect(Collectors.toList()));
        for (String name : uniqueNames3) {
            System.out.println(name);
        }

    }
}