//Crear un array de 10 enteros, llenarlo con números aleatorios y mostrar su suma.

package com.ejercicios.java8.TablesNArrays;

import java.util.Random;

public class SumArray {
    public static void main(String[] args) {
        int[] array = new int[10]; // es necesario declarar el tamañao del array
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            sum += array[i];
            System.out.println(array[i] + " + ");
        }
        System.out.println("Suma de los elementos del array: " + sum);
    }
}
