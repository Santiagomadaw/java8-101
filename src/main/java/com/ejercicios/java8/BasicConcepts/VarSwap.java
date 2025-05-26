//Realiza un programa que intercambie el valor de dos variables.


package com.ejercicios.java8.BasicConcepts;
import java.util.Scanner;
public class VarSwap {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int aux = 0;
        if(args.length != 2) {
            System.out.println("Usage: java VarSwap a b");
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Enter a: ");
                a = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter b: ");
                b = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please provide two integers, e.g. 5 8");
                return;
            }
        }else {
              try {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please provide two integers, e.g. 5 8");
                return;
            } 
        }
        aux = a;
        a = b;
        b = aux;
        System.out.println("a: " + a + " b: " + b);
    }
}