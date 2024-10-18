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