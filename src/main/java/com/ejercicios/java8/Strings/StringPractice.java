package com.ejercicios.java8.Strings;

public class StringPractice {

    // contador de concurrencias de un char en una cadena
    public static int charCounter(String text, char letter) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    // Invertir caracteres de una cadena
    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    public static int wordCounter(String text) {
        // convierto la cadena en un Array de palabras
        String[] words = text.split(" ");
        return words.length;
    }

    // Validar un correo electrónico usando expresiones regulares.
    public static boolean isValidMail(String mail) {
        return mail.matches("^[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*@[a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{2,5}$");
    }

    public static void main(String[] args) {
        String text = "hola mundo";
        String text2 = "El perro de San Roque no tiene rabo.";
        String mail = "k4Q6S@example.com";
        String badMail = "hola.com";
        char letter = 'o';
        System.out.println(
                "la letra " + letter + " aparece " + charCounter(text, letter) + " veces en la cadena " + text + "\n");
        System.out.println(text + " invertido es: " + reverseString(text) + "\n");
        System.out.println(text2 + " invertdo es: " + reverseString(text2) + "\n");
        System.out.println("la cadena " + text2 + " tiene " + wordCounter(text2) + " palabras" + "\n");
        System.out.println("El mail " + mail + " es valido? " + (isValidMail(mail) ? "Si" : "No") + "\n");
        System.out.println("El mail " + badMail + " es valido? " + (isValidMail(badMail) ? "Si" : "No") + "\n");
    }

}
