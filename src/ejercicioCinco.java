/*Objetivo: Convertir un ArrayList en un array nativo de Java.

        Instrucciones:

        Crea un ArrayList de enteros con los valores del 1 al 5.
        Convierte este ArrayList en un array de tipo Integer[].
        Imprime el contenido del array usando un bucle for.*/

import java.util.ArrayList;

public class ejercicioCinco {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);        }


        Integer[] array = new Integer[list.size()];
        array = list.toArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}