import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();


        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.offer(8);
        queue.offer(9);
        queue.offer(10);

        queue.add(11);
        queue.add(12);
        queue.add(13);



        System.out.println(queue);
        System.out.println(queue.peek());


        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue);


        System.out.println(queue.size());


        System.out.println(queue.isEmpty());


        System.out.println(queue.contains(1));  // here return false becuse we pop out the 1 already
        System.out.println(queue.contains(6));

        queue.clear();
        System.out.println(queue.isEmpty());
    }
}
