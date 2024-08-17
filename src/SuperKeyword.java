public class SuperKeyword {
    public static void main(String[] args) {
        //super = refers to super class of object, ie parent object
        // similar to "this" keyword

        Hero hero1 = new Hero("Batman", 42, "money");

        System.out.println(hero1.age);
        System.out.println(hero1.name);
        System.out.println(hero1.power);

        System.out.println(hero1.toString());
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "\n" + this.age + "\n";
    }
}

class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        super(name, age); //passed up to parent person constructor
        this.power = power;
    }

    public String toString() {
        return super.toString() + this.power;
    }
}