//Simula un sistema de login simple con nombre de usuario y contraseña.

package com.ejercicios.java8.Conditionals;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class FakeLogin {

    private static String md5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            //  bytes to hex
            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("No se encontró el algoritmo MD5", e);
        }
    }
    public static void main(String[] args) {
        
        //genera un login falso en md5
        String username = "";
        String password = "";
        if (args.length != 2) {
            try {
                System.out.println("Usage: java FakeLogin username password");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter username: ");
                username = scanner.next();
                System.out.println("Enter password: ");
                password = scanner.next();
            } catch (InputMismatchException  e) {
                System.out.println("Invalid input, only strings are allowed");
                return;
            }
        }else {
            try {
                username = args[0];
                password = args[1]; 
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Only strings are allowed");
                return;
            }
        }
        if (username.equals("admin") && md5(password).equals(md5("password"))) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }       
    }
}