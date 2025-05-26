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
            System.out.println("Enter a: ");
            a = scanner.nextInt();
            System.out.println("Enter b: ");
            b = scanner.nextInt();
        }else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]); 
        }
        aux = a;
        a = b;
        b = aux;
        System.out.println("a: " + a + " b: " + b);
    }
}