import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // 1. Insert a key-value pair (put)
        map.put("Apple", 100);
        map.put("Banana", 500);
        map.put("Orange", 800);
        map.put("Mango", 300);
        map.put("PineApple", 600);

        System.out.println("Hashmap: " + map);

        // 2. Retrieve value (get)
        int price = map.get("Apple");
        System.out.println("Price of 'Apple': " + price);

        // 3. Check existence of key (containsKey)
        boolean hasBanana = map.containsKey("Banana");
        System.out.println("Contains key 'Banana'? " + hasBanana);

        // 4. Check existence of value (containsValue)
        boolean hasValue5 = map.containsValue(5);
        System.out.println("Contains value 5? " + hasValue5);

        // 5. Remove key-value pair (remove)
        map.remove("Orange");
        System.out.println("After removing 'Orange': " + map);

        // 6. Replace value (replace)
        map.replace("Banana", 200);
        System.out.println("After replacing value for 'Banana': " + map);

        // 7. Size of map (size)
        int size = map.size();
        System.out.println("Size of map: " + size);

        // 8. Is map empty? (isEmpty)
        boolean isEmpty = map.isEmpty();
        System.out.println("Is map empty? " + isEmpty);

        // 9. Iterate through keys (keySet)
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // 10. Iterate through values (values)
        System.out.println("Values:");
        for (Integer val : map.values()) {
            System.out.println("Value: " + val);
        }

        // 11. Iterate through key-value pairs (entrySet)
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 12. Clear map (clear)
        map.clear();
        System.out.println("Map after clear(): " + map);
    }
}
