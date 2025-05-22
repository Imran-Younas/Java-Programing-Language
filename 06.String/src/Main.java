public class Main {
    public static void main(String[] args){
        String name = "Imran Younas";
        System.out.println("String: " + name);
        System.out.println("lenght of String: " + name.length());
        System.out.println("convert to lower case: " + name.toLowerCase());
        System.out.println("convert to Upper case: " + name.toUpperCase());


        String firstName = "Imran";
        String secondName = "Younas";

        System.out.println(firstName + " " + secondName);
        System.out.println(firstName.concat(secondName));

        String num = "23";
        String num2 = "78";
        String num3 = num + num2;
        System.out.println(num3);

        String txt = "Imran\'s Laptop";
        System.out.println(txt);

//        \n use for new line


    }
}