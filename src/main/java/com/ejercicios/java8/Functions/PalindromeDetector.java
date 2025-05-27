package com.ejercicios.java8.Functions;

import java.util.Scanner;

public class PalindromeDetector {
    public static boolean isPalindrome(String text) {
        // nomalize. Remove spaces and simbols and convert to lowercase
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.print("Introduce un texto: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();

        System.out.println(text + " --> " + (isPalindrome(text) ? "Es palindromo" : "No es palindromo"));
    }
}
