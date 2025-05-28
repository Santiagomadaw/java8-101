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

  Calcula el área de un triángulo dados su base y altura.

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

### Classes

- **Person y MyMoney:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.App"
  ```

  Demuestra el uso de clases, objetos y métodos.  
  Ejemplo de salida:

  ```
  Hola, soy Paco y tengo 3 años
  Saldo en cuenta: 10000
  15000
  Saldo en cuenta: 15000
  14700
  Saldo en cuenta: 14700
  Guau!
  Miau!
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

  Verifica si una palabra es palíndroma.

### Strings

- **Contar caracteres:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Strings.CountCharacters" -Dexec.args="hola"
  ```

  Cuenta el número de caracteres en una cadena.

- **Validar email:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Strings.EmailValidator" -Dexec.args="correo@ejemplo.com"
  ```

  Valida si una cadena tiene formato de email.

### TablesNArrays

- **Suma de arrays:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.TablesNArrays.SumArray"
  ```

  Suma los elementos de un array.

- **Matriz mágica:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.TablesNArrays.MagicMatrix"
  ```

  Verifica si una matriz es mágica.

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
