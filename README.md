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

### Ejemplos

- **Conversor de grados:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.BasicConcepts.DegreesConverter" -Dexec.args="100 C"
  ```

- **Área de triángulo:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.BasicConcepts.TriangleArea" -Dexec.args="10 5"
  ```

- **Tabla de multiplicar:**

  ```sh
  mvn exec:java -Dexec.mainClass="com.ejercicios.java8.Bucles.MultiplyTable"
  ```


## Autor

- Santiago Molina
