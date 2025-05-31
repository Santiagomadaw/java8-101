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
    EXIT(0,"Exit"),
    FILE(1, "Flie"),
    EDIT(2,"Edit"),
    SELECTION(3,"Selection"),
    VIEW(4,"View"),
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
        if (option==null){return "Invalid selection";}
        switch (option) {
            case EXIT: return "Closing...";
            case FILE: return "Opening file menu...";
            case EDIT: return "Opening editor...";
            case SELECTION: return "Opening selector...";
            case VIEW: return "Opening view options...";
            case TERMINAL: return "Opening terminal...";
            default: return "Invalid case";
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
    }
}