abstract class Vehicle {


    abstract void start();


    void stop() {

        System.out.println("Vehicle stopped");

    }

}



class Car extends Vehicle {


    void start() {

        System.out.println("Car starts with button");

    }

}



public class AbstractionExample {


    public static void main(String[] args) {


        Vehicle car = new Car();


        car.start();

        car.stop();

    }
}