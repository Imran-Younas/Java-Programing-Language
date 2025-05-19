public class Main {
    static int fac(int num){
        if(num > 0){
            return num * fac(num - 1);
        }
        else {
            return 1;  // Base case: 0! = 1
        }
    }

    public static void main(String[] args){
        System.out.println(fac(5));  // Output should be 120
    }
}
