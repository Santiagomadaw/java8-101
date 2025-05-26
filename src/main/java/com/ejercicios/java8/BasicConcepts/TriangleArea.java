//Crea un programa que calcule el área de un triángulo dado su base y altura.

package com.ejercicios.java8.BasicConcepts;

import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        double base = 0;
        double height = 0   ;
        if (args.length != 2) {
            System.out.println("Usage: java TriangleArea base height");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the base: ");
            base = scanner.nextDouble();
            System.out.println("Enter the height: ");
            height = scanner.nextDouble(); 



        }else{
             base = Double.parseDouble(args[0]);
             height = Double.parseDouble(args[1]);
        }

       

        double area = (base * height) / 2;
        System.out.println("The area of the triangle is " + area);
    }
}