import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> studentMarks = new HashMap<>();

        // Add key-value pairs
        studentMarks.put("Imran", 85);
        studentMarks.put("Umar", 92);
        studentMarks.put("Junaid", 78);
        studentMarks.put("Maira", 88);

        // map.size() - number of entries
        System.out.println("Size of map: " + studentMarks.size()); // 4

        // map.isEmpty() - check if map is empty
        System.out.println("Is map empty? " + studentMarks.isEmpty()); // false

        // map.keySet() - get all keys
        Set<String> keys = studentMarks.keySet();
        System.out.println("Keys (students): " + keys);

        // map.values() - get all values
        Collection<Integer> values = studentMarks.values();
        System.out.println("Values (marks): " + values);

        // map.entrySet() - get key-value pairs
        System.out.println("Key-Value pairs:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // map.clear() - remove all entries
        studentMarks.clear();
        System.out.println("Map cleared.");

        // map.isEmpty() - should now return true
        System.out.println("Is map empty after clear? " + studentMarks.isEmpty()); 
    }
}
