public class Main {
    public static void main(String[] args){
        int age = 11;

        if(age >= 18){
            System.out.println("You must have CNIC. Age " + age);
        }
        else {
            System.out.println("No problem of CNIC. Age " + age);
        }


        int num = 8;

        if (num % 2 == 0){
            System.out.println("Number is even: "+ num);
        }
        else {
            System.out.println("Number is odd: "+ num);
        }
    }
}