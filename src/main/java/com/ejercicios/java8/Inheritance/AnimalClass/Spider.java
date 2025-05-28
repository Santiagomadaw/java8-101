// Clase Animal con método hacerSonido(). Subclases: Perro y Gat
// Nota, java no puede tener varias clases publicas en el mismo archivo,
// por lo que las subclases deben ser no públicas o estar en archivos separados.

package com.ejercicios.java8.Inheritance.AnimalClass;

public class Spider extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("la araña no hace nada por que es capulla");
    }
}
