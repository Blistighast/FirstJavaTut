public class AbstractKeyword {
    public static void main(String[] args) {
        //abstract - abstract class cannot be instantiated, but can have subclass that can be
        //            abstract methods are declared without implementation

        Car3 car = new Car3();

        car.go();

//        Vehicle3 vehicle = new Vehicle3(); now cant instantiate this
    }
}

abstract class Vehicle3 {

    abstract void go(); //must be implemented in child, like method overriding, essentially a method to do

}

class Car3 extends Vehicle3 {

    @Override
    void go() { //must override the empty abstract method with implementation
        System.out.println("Car go vroom");
    }
}