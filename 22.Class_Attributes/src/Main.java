public class Main {
    public static void main(String[] args){
        Second myObject = new Second();
        myObject.num = 91; //update value
       // myObject.num2 = 91; // we can't update the value becuse of "final"
        System.out.println("Mutate: "+ myObject.num);
        System.out.println("can't Mutate: "+ myObject.num2);
    }
}

class Second {
    int num = 90;
    final int num2 = 70;
}