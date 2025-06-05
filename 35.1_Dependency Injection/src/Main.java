class Mathematics{
void add(){
    int num1 = 10;
    int num2 = 20;

    int plus = num1 + num2;
    System.out.println("Sum of two numbers is: " + plus);
}
}

class Calculte{
    Mathematics mathematics;
    Calculte(Mathematics mathematics){
        this.mathematics = mathematics;
        mathematics.add();

    }
}

public class Main{
    public static void main(String[] main){
        Mathematics myMath = new Mathematics();
        Calculte myCalculte = new Calculte(myMath);
    }
}