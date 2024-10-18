/*Objetivo: Practicar la iteración sobre listas.

Instrucciones:

Crea un ArrayList de números enteros llamado numbers y añade los números del 1 al 5.
Usa un bucle for para imprimir cada número.
Usa un bucle for-each para imprimir los mismos números.
Usa un bucle while para imprimir los números en orden inverso.*/



import java.util.ArrayList;

public class ejercicioDos {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        //for
        System.out.println("Bucle for:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //for-each
        System.out.println("Bucle for-each:");
        for (int number : numbers) {
            System.out.println(number);
        }

        //bucle while
        System.out.println("Bucle while");
        int index = numbers.size() - 1;
        while (index >= 0) {
            System.out.println(numbers.get(index));
            index--;
        }
    }
}