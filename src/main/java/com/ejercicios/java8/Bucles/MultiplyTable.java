//Mostrar una tabla de multiplicar del 1 al 10.

package com.ejercicios.java8.Bucles;

public class MultiplyTable {
    public static void main(String[] args) {
    for (int firstParam = 1; firstParam <= 10; firstParam++) {
        for (int secondParam = 1; secondParam <= 10; secondParam++) {
            System.out.println(firstParam + " x " + secondParam + " = " + (firstParam * secondParam));
        }
    }

    }
}