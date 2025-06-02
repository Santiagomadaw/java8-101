//set de presonajes ordenados usando TreeSet
package com.ejercicios.java8.Collections;

public class TreeSetExercises {

    public static void main(String[] args) {

        java.util.TreeSet<String> characters = new java.util.TreeSet<>();
        characters.add("Luke");
        characters.add("Leia");
        characters.add("Han");
        characters.add("Anakin");
        characters.add("Padmé");
        characters.add("Obi-Wan");
        characters.add("Yoda");
        characters.add("Darth Vader");
        // imprimimos el conjunto de personajes
        System.out.println("Conjunto de personajes ordenados:");
        characters.forEach(System.out::println);
        System.out.println();
        // añado a todos de nuevo para ver el resultado
        characters.add("Luke");
        characters.add("Leia");
        characters.add("Han");
        characters.add("Anakin");
        characters.add("Padmé");
        characters.add("Obi-Wan");
        characters.add("Yoda");
        characters.add("Darth Vader");
        // imprimimos el conjunto de personajes
        System.out.println("Conjunto de personajes ordenados:");
        characters.forEach(System.out::println);
        System.out.println();
    }
}
