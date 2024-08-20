public class CopyObjects {
    public static void main(String[] args) {
        Car5 car1 = new Car5("Honda", "Civic", 2024);
        Car5 car2 = new Car5("Ford", "Mustang", 2080);
        Car5 car3 = new Car5(car1);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car2.getMake());

        car2.copy(car1);
        //copys objects attributes to other object without changing its address, so they are still separate objects

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getMake());
        System.out.println(car2.getMake());

        System.out.println(car3);


    }
}

class Car5 {
    private String make;
    private String model;
    private int year;

    Car5(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    //overloaded constructor to copy at instantiation
    Car5(Car5 x) {
        this.copy(x);
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

    public void copy(Car5 x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}