class Engine{
    void start(){
        System.out.println("Engine started");
    }
}

class Car{

    Engine engine;
    Car(Engine engine){
        this.engine=engine;
        engine.start();
    }

}

public class Main{
    public static void main(String[] args){

        Engine myengine = new Engine();
        Car mycar = new Car(myengine);
//        myengine.start();


    }
}