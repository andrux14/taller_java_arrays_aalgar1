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