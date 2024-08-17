public class MethodOverriding {
    public static void main(String[] args) {
        //method overriding - declare method in subclass that's already in parent class
        Animal animal = new Animal();
        Dog dog = new Dog();

        dog.speak();
        animal.speak();


    }
}

class Animal {

    void speak() {
        System.out.println("The animal speaks");
    }
}

class Dog extends Animal {

    @Override
        //not required but common practice for readability
    void speak() {
        System.out.println("The dog goes bark"); //overrides animal method of speak
    }
}