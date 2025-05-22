public  class Main {
    public static void main(String[] args){
        int num1 = 120;
        int num2 = 4;

        char ch = '/';

        if(ch == '+'){
            int add = num1 + num2;
            System.out.println("Added: "+ add);
        } else if (ch=='-') {
            int minus = num1 - num2;
            System.out.println("Minus: "+ minus);
        }

        else if (ch=='*') {
            int pro = num1 * num2;
            System.out.println("Product: "+ pro);
        }

        else {
            int div = num1 / num2;
            System.out.println("Div: "+ div);
        }

        // Ternary Operator

        int age = 20;
        String result = (age < 18) ? "Under age" : "Adult";
        System.out.println(result);
    }
}