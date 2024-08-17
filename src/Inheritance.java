public class Inheritance {
    public static void main(String[] args) {
        //inheritance = process where one class acquires attributes and methods of another
        //super class or parent class
        //subclass or child class

        CarInheritance car = new CarInheritance();
        Bicycle bike = new Bicycle();

        car.go();
        bike.stop();
    }
}

class Vehicle {
    double speed;

    void go() {
        System.out.println("This vehicle is moving");

    }

    void stop() {
        System.out.println("This vehicle is stopped");
    }
}

class CarInheritance extends Vehicle {
    int wheels = 4;
    int doors = 4;
}

class Bicycle extends Vehicle {
    int wheels = 2;
    int pedals = 2;
}