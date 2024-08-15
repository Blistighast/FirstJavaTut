public class Objects {
    public static void main(String[] args) {
        // object-oriented programming OOP
        //object - instance of a class that may contain attributes and methods

        //constructor- method called when object is instantiated (created)

        Car myCar = new Car();
        Car yourCar = new Car();

        System.out.println(myCar.make);
        System.out.println("Price: " + myCar.price);

        myCar.drive();
        myCar.brake();

        System.out.println(yourCar.make);
        System.out.println(yourCar.price);

        Human human = new Human("Brian", 34, 160);
        Human human2 = new Human("Julie", 30, 120);

        System.out.println(human.name);
        System.out.println(human2.name);
        human.eat();
        human.checkWeight();
    }
}

class Car {
    String make = "Corvette";
    String model = "Honda";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    void drive() {
        System.out.println("you drive the car");
    }

    void brake() {
        System.out.println("you step on the brake");
    }
}

class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void checkWeight() {
        System.out.println(this.name + " weighs " + this.weight + " lbs.");
    }
}
