public class Main {
    static void msg(String name){


        System.out.println("Hi, "+ name );
    }
    static int mul(int num1, int num2){
        int product = num1 * num2;
        return product;

    }

    public static void main(String[] args){
        msg("Imran Younas");
        System.out.println("Product: "+ mul(7,5));
    }
}