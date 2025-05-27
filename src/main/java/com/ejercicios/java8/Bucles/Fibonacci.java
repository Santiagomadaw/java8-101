//Imprimir los primeros 20 números de la serie Fibonacci.

package com.ejercicios.java8.Bucles;

public class Fibonacci {

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacci(i));
            if (i < 19) System.out.print(" - ");
        }
        
    }
}