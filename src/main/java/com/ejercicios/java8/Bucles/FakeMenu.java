//Simula un menú interactivo con do-while que permita repetir acciones hasta que el usuario diga "salir".

package com.ejercicios.java8.Bucles;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/* no se si un enum es la mejor solucion
 * pero creo que es una buena alternativa
 * para simular la selección de opciones
 */

enum Option {
    EXIT(0,"Salir"),
    FILE(1, "Archivo"),
    EDIT(2,"Editar"),
    SELECTION(3,"Seleccion"),
    VIEW(4,"Vista"),
    TERMINAL(5,"Terminal");
    private final int numOption;
    private final String description;

    private static final Map<Integer, Option> OPTION_MAP = new HashMap<>();
    static {
        for (Option option : values()) {
            OPTION_MAP.put(option.numOption, option);
        }
    }


    Option (int numOption, String description){
        this.description= description;
        this.numOption=numOption;

    }
    public String getDescription() {
        return description;
    }
    public int getNumOption() {
        return numOption;
    }
    public static String executeOption(int o) {
        Option option = OPTION_MAP.get(o);
        if (option==null){return "Opcion no valida";}
        switch (option) {
            case EXIT: return "Saliendo del programa...";
            case FILE: return "Abriendo menú de archivo...";
            case EDIT: return "Entrando al modo edición...";
            case SELECTION: return "Modo selección activado.";
            case VIEW: return "Mostrando opciones de vista.";
            case TERMINAL: return "Ejecutando terminal integrada.";
            default: return "Opción no reconocida.";
        }
    }
}

public class FakeMenu {

    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        
        int option = -1;
        do {
            System.out.print("\033[H\033[2J");
    System.out.flush();
            for(Option o : Option.values()){
                System.out.println(o.getNumOption()+" "+o.getDescription());
    
            }
            System.out.print("Enter an option: ");
             try {

                option = scanner.nextInt();
                System.out.println(Option.executeOption(option));
                Thread.sleep(2000); 
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, only numbers are allowed");
                scanner.next(); // limpia el buffer evita bucle infinito
            }
           

        } while (option != 0);
        scanner.close(); // cierra el scanner para liberar recursos
        return;
    }
}