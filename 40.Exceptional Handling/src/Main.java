import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double balance = 5000.00;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple ATM");
        System.out.print("Enter amount to withdraw: ");

        try {
            double amount = scanner.nextDouble();

            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance.");
            }

            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: $" + balance);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the Simple ATM.");
        }

        scanner.close();
    }
}
