//Imprime un triangulo de pascal de n filas.
// Al usar tabulaciones para cuadrar la piramide hace que la base se extienda mucho lo que hace que numeros grandes pierdan la vista de la piramide

package com.ejercicios.java8.Bucles;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PascalTriangle {
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int filesNumber = 0;

        //primero recibo parametros bien por en linea de comandos o lo pido a usuario en ejecucion
        if (args.length != 1) {
            System.out.println("Usage: java PascalTriangle n");
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number: ");
                filesNumber = scanner.nextInt();
            } catch (InputMismatchException  e) {
                System.out.println("Invalid input, only numbers are allowed");
                return;
            }
        } else {
            try {
                filesNumber = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Only numbers are allowed");
                return;
            }
        }
        System.out.println("Files number: " + filesNumber);
        //ancho de la base
        int baseWidth = filesNumber * 2 - 1;
        System.out.println("Base number: " + baseWidth);

        int tabNumber = baseWidth / 2;
        System.out.println("Tab number: " + tabNumber);

        //creo el triangulo
        for (int i = 0; i < filesNumber; i++) {
            for (int k = 0; k < tabNumber - i ; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++) {
                
                System.out.print(factorial(i) / (factorial(j) * factorial(i - j)));
                System.out.print("\t\t");
 
            }
            
            System.out.println();
        }
        System.out.println();
    }
}