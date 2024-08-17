public class ObjectPassing {
    public static void main(String[] args) {
        CarPass car1 = new CarPass("BMW");
        CarPass car2 = new CarPass("Corvette");
        Garage garage = new Garage();

        garage.park(car1);
        garage.park(car2);
    }
}


class CarPass {
    String name;

    CarPass(String name) {
        this.name = name;
    }
}

class Garage {
    void park(CarPass car) {
        System.out.println("The " + car.name + " is parked in garage");
    }
}
