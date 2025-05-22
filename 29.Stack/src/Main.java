import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();


        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("watermelon");


        System.out.println("Stack after pushes: " + stack);


        System.out.println("Top element (peek): " + stack.peek());


        String popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Stack after pop: " + stack);


        System.out.println("Is stack empty? " + stack.isEmpty());


        int position = stack.search("Apple");
        System.out.println("Position of 'Apple' from top: " + position);

        // Search for an element not in the stack
        System.out.println("Position of 'Mango': " + stack.search("Mango"));
        System.out.println("Position of 'melon': " + stack.search("melon"));
    }
}
