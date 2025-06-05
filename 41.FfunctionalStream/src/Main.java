import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 7);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(n -> System.out.println("Squre of even Number in Array: "+n));
    }
}
