public class Main {
    public static void main(String[] args) {
        FirstName myObj = new FirstName();
        System.out.print(myObj.name+ " ");

        SecondName myObj1 = new SecondName();
        System.out.println(myObj1.name);
    }
}


class SecondName{
    String name= "Younas";
}
class FirstName {
    String name= "Imran";

}