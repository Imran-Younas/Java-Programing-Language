import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("watermelon");
        fruits.add("melon");
        fruits.add(0, "Dates");
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        System.out.println(fruits.remove(0));
        System.out.println(fruits.size());
      //  System.out.println(fruits.clear());


        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(2);
        num.add(4);
        num.add(3);
        num.add(1);

        System.out.println(num);
        Collections.sort(num);

        System.out.println("After sorting: " + num);





    }
}