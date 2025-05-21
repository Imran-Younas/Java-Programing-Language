public class Main {
    // Static method
    static void myStaticMethod(int a, int b) {
        int add = a + b;
        System.out.println("Static methods: "+ add);
    }

    // Public method
    public int myPublicMethod() {
        int product = 5 * 8;
        System.out.print("Public methods: ");
        return product;
    }


    public static void main(String[] args) {
        myStaticMethod(10, 20); // Call the static method
        // myPublicMethod(); This would compile an error

        Main myObj = new Main(); // Create an object of Main

        System.out.println(myObj.myPublicMethod()); // Call the public method on the object
    }
}