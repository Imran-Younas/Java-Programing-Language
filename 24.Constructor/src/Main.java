public class Main {
    int model;
    String brand;

    public  Main(int m, String b){
        model = m;
        brand = b;
    }


    public static void main(String[] args){
        Main myObj = new Main(2000, "Honda");
        System.out.println("Car Model: "+ myObj.model);
        System.out.println("Cars brand: "+ myObj.brand);

    }
}