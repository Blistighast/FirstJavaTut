public class Polymorphism {
    public static void main(String[] args) {
        //polymorphism - ability of object to identify as more than one data type

        Car6 car = new Car6();
        Bicycle6 bike = new Bicycle6();
        Boat6 boat = new Boat6();

        Vehicle6[] racers = {car, bike, boat}; //they all also identify as vehicles

        for (Vehicle6 i : racers) {
            i.go();
        }
    }
}

class Vehicle6 {
    public void go() {
    }
}

class Car6 extends Vehicle6 {
    @Override
    public void go() {
        System.out.println("The car is driving");
    }
}

class Bicycle6 extends Vehicle6 {
    @Override
    public void go() {
        System.out.println("the bike is moving");
    }
}

class Boat6 extends Vehicle6 {
    @Override
    public void go() {
        System.out.println("the boat is sailing");
    }
}