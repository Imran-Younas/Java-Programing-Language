public class Main {

    // Interface
    interface Animal {
        void speak();
    }

    // Dog class
    static class Dog implements Animal {
        public void speak() {
            System.out.println("Dog says: Woof!");
        }
    }

    // Cat class
    static class Cat implements Animal {
        public void speak() {
            System.out.println("Cat says: Meow!");
        }
    }

    // Factory class
    static class AnimalFactory {
        public static Animal getAnimal(String type) {
            if (type.equalsIgnoreCase("dog")) {
                return new Dog();
            } else if (type.equalsIgnoreCase("cat")) {
                return new Cat();
            } else {
                return null;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getAnimal("dog");
        if (animal1 != null) animal1.speak();

        Animal animal2 = AnimalFactory.getAnimal("cat");
        if (animal2 != null) animal2.speak();
    }
}
