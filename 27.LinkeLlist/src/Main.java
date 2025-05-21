import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        // Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        // Adding at the beginning and end
        animals.addFirst("Tiger");
        animals.addLast("Elephant");

        // Access elements
        System.out.println(animals.get(2));

        // Remove elements
        animals.removeFirst();
        animals.removeLast();
        animals.remove("Cat");

        // Update element
        animals.set(0, "Wolf");

        // Check size
        System.out.println("Size: " + animals.size());

        // Print all elements
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
