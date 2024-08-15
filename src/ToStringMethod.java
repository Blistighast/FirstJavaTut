public class ToStringMethod {
    public static void main(String[] args) {
        //toString = all objects inherit
        //textually represents an object
        //implicit, can also be used explicitly

        CarString car = new CarString();

        System.out.println(car); //toString is called implicitly

        System.out.println(car.toString()); //explicit

    }
}

class CarString {
    String make = "Corvette";
    String model = "Honda";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    //overriding toString method, otherwise just gives ref to pc location address
    public String toString() {
        return make + "\n" + model + "\n" + year;
    }

    void drive() {
        System.out.println("you drive the car");
    }

    void brake() {
        System.out.println("you step on the brake");
    }

}