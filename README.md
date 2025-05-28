# java8-101

Ejercicios básicos de Java 8 organizados por temas, ideales para practicar conceptos fundamentales del lenguaje.

## Estructura del proyecto

- **src/main/java/com/ejercicios/java8/**  
  - **BasicConcepts/**: Conceptos básicos (variables, operadores, conversión de grados, área de triángulo, etc.)
  - **Bucles/**: Ejercicios con bucles (Fibonacci, triángulo de Pascal, tablas de multiplicar, menús interactivos, etc.)
  - **Classes/**: Uso de clases y objetos (`Person`, `MyMoney`)
  - **Conditionals/**: Condicionales y lógica (`EvenOdd`, `FakeLogin`)
  - **Functions/**: Funciones y recursividad (`Factorial`, `PalindromeDetector`, `Calculator`)
  - **Strings/**: Manipulación de cadenas de texto
  - **TablesNArrays/**: Arrays y matrices (sumas, matrices mágicas, etc.)
- **src/test/java/com/ejercicios/java8/**  
  Pruebas unitarias de los ejercicios

## Requisitos

- Java 8 o superior
- Maven

## Compilación

Desde la raíz del proyecto:

```sh
mvn clean compile
```

## Ejecución de programas

Puedes ejecutar cualquier clase con método `main` usando Maven. Por ejemplo:

```sh
mvn exec:java -Dexec.mainClass="com.ejercicios.java8.BasicConcepts.DegreesConverter" -Dexec.args="100 C"
```

Cambia el valor de `-Dexec.mainClass` y los argumentos según el ejercicio que quieras probar.

---

## Ejemplos de cada ejercicio

### BasicConcepts

- **Conversión de grados:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.BasicConcepts.DegreesConverter" -Dexec.args="100 C"
  ```

  Convierte grados Celsius a Fahrenheit y viceversa.

- **Área de triángulo:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.BasicConcepts.TriangleArea" -Dexec.args="10 5"
  ```

  Calcula el área de un triángulo dados su base y altura

- **Intercambio de variables:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.BasicConcepts.VarSwap"
  ```

  Intercambia 2 variables

### Bucles

- **Tabla de multiplicar:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Bucles.MultiplyTable"
  ```

  Imprime la tabla de multiplicar de un número.

- **Fibonacci:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Bucles.Fibonacci" -Dexec.args="10"
  ```

  Muestra los primeros N números de la serie de Fibonacci.

- **Triangulo de Pascal:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Bucles.PascalTriangle"
  ```

  Dibuja un triangulo de Pascal.

- **Menú falso:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Bucles.FakeMenu"
  ```

  Simula un menu.

### Classes y herencias

- **Classes: Person y MyMoney**

- **Herencias: Shape y Animal**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.App"
  ```

  Demuestra el uso de clases, objetos y métodos.  
  Ejemplo de salida:

  ```sh

    Clase Person:

    Hola, soy Paco y no debo hablar con extraños

    Clase MyMoney:

    Saldo en cuenta: 10000
    Añadido a cuenta: 5000
    Saldo en cuenta: 15000
    Sacado de cuenta: 300
    Saldo en cuenta: 14700

    Clase Animal y subclases:

    El perro ladra
    El gato maulla
    la araña no hace nada por que es capulla

    Clase Shape y subclases:

    El área es: 78.53981633974483
    El área es: 16.0
    ...

  ```

### Conditionals

- **Par o impar:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Conditionals.EvenOdd" -Dexec.args="7"
  ```

  Determina si un número es par o impar.

- **Login falso:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Conditionals.FakeLogin"
  ```

  Simula un login sencillo con usuario y contraseña.

### Functions

- **Factorial:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Functions.Factorial" -Dexec.args="5"
  ```

  Calcula el factorial de un número usando recursividad.

- **Detector de palíndromos:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Functions.PalindromeDetector" -Dexec.args="oso"
  ```

  Verifica si una frase es palíndroma.

- **Calculadora:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Functions.Calculator"
  ```

  Calculadora recive 2 enteros y un operador.

### Strings

- **Varios ejercicios con strings:**

  ```sh

  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Strings.StringPractice"

  ```

  ```sh

    la letra o aparece 2 veces en la cadena hola mundo

    hola mundo invertido es: odnum aloh

    El perro de San Roque no tiene rabo. invertdo es: .obar eneit on euqoR naS ed orrep lE

    la cadena El perro de San Roque no tiene rabo. tiene 8 palabras

    El mail k4Q6S@example.com es valido? Si

    El mail hola.com es valido? No

  ```

### TablesNArrays

- **Suma de arrays:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.TablesNArrays.SumArray"
  ```

  Suma los elementos de un array.

- **Matriz 3x3:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.TablesNArrays.NineMatrix"
  ```

 Dibuja una matriz de 3x3 con enteros del 1 al 9.

 - **Cubo 3x3x3:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.TablesNArrays.MagiCube"
  ```

 Dibuja un cubo de 3x3x3 con enteros del 1 al 9.

---

## Particularidades y ventajas de Java 8

Java 8 introdujo varias características modernas que facilitan la programación y hacen el código más conciso y expresivo:

- **Lambdas y Streams:** Permiten trabajar con colecciones de forma funcional y declarativa, facilitando operaciones como filtrado, mapeo y reducción.
- **Métodos por defecto en interfaces:** Ahora las interfaces pueden tener métodos implementados.
- **API de fecha y hora (`java.time`):** Mucho más potente y segura que las clases antiguas.
- **Referencias a métodos y funciones:** Permiten pasar métodos como parámetros.
- **Mejoras en la inferencia de tipos y sintaxis más limpia.**

Estas características hacen que los ejercicios sean más fáciles de escribir, leer y mantener, y permiten aplicar paradigmas funcionales junto con la orientación a objetos clásica de Java.

---

## Autor

- Santiago Molina

---
¡Explora los diferentes paquetes y aprende practicando Java!
