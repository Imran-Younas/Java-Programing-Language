// Generic class
class Box<T> {
    T value;

    // Constructor
    Box(T value) {
        this.value = value;
    }

    // Method to get value
    T getValue() {
        return value;
    }

    // Method to print value
    void showType() {
        System.out.println("Value: " + value + " (Type: " + value.getClass().getSimpleName() + ")");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Box with String
        Box<String> stringBox = new Box<>("Hello Generics");
        stringBox.showType();
        System.out.println("Stored String: " + stringBox.getValue());

        // Box with Integer
        Box<Integer> intBox = new Box<>(123);
        intBox.showType();
        System.out.println("Stored Integer: " + intBox.getValue());

        // Box with Double
        Box<Double> doubleBox = new Box<>(99.99);
        doubleBox.showType();
        System.out.println("Stored Double: " + doubleBox.getValue());
    }
}
