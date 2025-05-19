//With method overloading, multiple methods can have the same name with different parameters

public class Main {
    static int divd(int num1, int num2){
        int ans = num1 / num2;
        return ans;
    }

    static double divd(double num1, double num2){
        double ans = num1 / num2;
        return ans;
    }


    public static void main(String[] args){
       System.out.println("Int divison: "+ divd(10,3));
       System.out.println("Double divison: "+ divd(10.0,3.0));

    }
}