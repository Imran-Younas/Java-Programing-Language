public class Main {
    public static void main(String[] args) {
        int num = 90;
        float flt = num;

        num = (int) flt;  // Explicit cast

        System.out.println("Type Casting: "+ flt);
        System.out.println("Type Casting: "+ num);
    }
}
