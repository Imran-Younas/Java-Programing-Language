import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter a number: ");

        // Read an integer from the user
        int number = scanner.nextInt();

        // Display the input
        System.out.println("You entered: " + number);

        // Close the scanner
        scanner.close();
    }
}
