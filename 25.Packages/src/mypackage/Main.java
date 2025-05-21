package mypackage;

public class Main {
    public static void main(String[] args){
        System.out.println("Packages");
        Calcuator obj= new Calcuator();
        obj.add(8, 8);
        System.out.println("Subtraction: "+ obj.minus());

    }
}