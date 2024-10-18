/*Ejercicio 1: Creación y manipulación básica de ArrayList
        Objetivo: Practicar la creación de un ArrayList, agregar, eliminar y modificar elementos.

        Instrucciones:

        Crea un ArrayList de tipo String llamado fruits.
        Agrega los siguientes elementos: "Apple", "Banana", "Cherry".
        Imprime el tamaño de la lista y los elementos.
        Elimina "Banana" de la lista.
        Cambia el valor de "Cherry" por "Orange".
        Imprime la lista resultante.*/



import java.util.ArrayList;

public class ejercicioUno {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("El tamaño de la lista es: " + fruits.size());
        System.out.println("Los elementos de la lista son: " + fruits);

        fruits.remove("Banana");

        fruits.set(fruits.indexOf("Cherry"),"Orange");

        System.out.println("La lista resultante es: " + fruits);

    }
}