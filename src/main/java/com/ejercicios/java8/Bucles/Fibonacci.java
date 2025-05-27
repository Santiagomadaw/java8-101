//Imprimir los primeros N números de la serie Fibonacci.

package com.ejercicios.java8.Bucles;
import java.util.Scanner;
import java.util.InputMismatchException;
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
        int n=0;
        if (args.length != 1) {
            System.out.println("Usage: java Fibonacci n");
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number: ");
                 n = scanner.nextInt();
               
            } catch (InputMismatchException  e) {
                System.out.println("Invalid input, only numbers are allowed");
                return;
            }
        } else {
            try {
                 n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Only numbers are allowed");
                return;
            }
        }
        if (n<0) {
            System.out.println("Error: Invalid input. Only positive numbers are allowed");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i));
            if (i < n-1) System.out.print(" - ");
        }
        
    }
}