public class Encapsulation {
    public static void main(String[] args) {
        //encapsulation - attributes of a class will be hidden or private
        //                can be accessed only through methods(getters and setters)
        //                 you should make attributes private if you don't have a reason to make them public/protected

        Car4 car = new Car4("Honda", "Civic", 2024);

//        System.out.println(car.make); //don't have access to it this way, must use getter
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        car.setYear(1980);
        System.out.println(car.getYear());

    }
}

class Car4 {
    private String make;
    private String model;
    private int year;

    Car4(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}