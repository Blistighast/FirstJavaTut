import java.util.Scanner;

public class DynamicPolymorphism {
    public static void main(String[] args) {
        //dynamic polymorphism - multiple data types, after compilation (during runtime)
        // ex mustang is a : mustang, and a car, and a vehicle, and an object

        Scanner scanner = new Scanner(System.in);
        Animal5 animal;

        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog5();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat5();
            animal.speak();
        } else {
            animal = new Animal5();
            System.out.println("that choice was invalid");
            animal.speak();
        }

    }
}

class Animal5 {
    public void speak() {
        System.out.println("Animal makes noise");
    }
}

class Dog5 extends Animal5 {
    @Override
    public void speak() {
        System.out.println("Dog goes bark");
    }
}

class Cat5 extends Animal5 {
    @Override
    public void speak() {
        System.out.println("Cat goes meow");
    }
}
