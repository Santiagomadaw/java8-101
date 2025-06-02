package com.ejercicios.java8.Collections;

enum MenuOptions {
    ADD_CLIENT(1, "Añadir cliente a la cola"),
    ATTEND_CLIENT(2, "Atender al primer cliente de la cola"),
    VIEW_FIRST_CLIENT(3, "Ver el primer cliente de la cola"),
    SHOW_CLIENTS(4, "Listar todos los clientes en la cola"),
    COUNT_CLIENTS(5, "Contar el número de clientes en la cola"),
    CLEAR_QUEUE(6, "Limpiar la cola"),
    EXIT(0, "Salir");

    private final int option;
    private final String description;

    MenuOptions(int option, String description) {
        this.option = option;
        this.description = description;
    }

    public int getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }
}