class Car {

    String brand;


    // Constructor
    Car() {

        brand = "Toyota";

    }


    void show() {

        System.out.println("Car Brand: " + brand);

    }
}


public class ConstructorExample {

    public static void main(String[] args) {


        Car car = new Car();


        car.show();

    }
}