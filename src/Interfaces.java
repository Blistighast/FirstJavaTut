//interface normally a different file like class
interface Prey {

    void flee();
}

interface Predator {
    void hunt();
}

public class Interfaces {
    public static void main(String[] args) {
        //interfaces - a template that can be applied to a class
        //              similar to inheritance, but specifies what a class has/must do
        //                classes can apply more than 1 interface, inheritance is limited to 1 super

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        rabbit.flee();

        hawk.hunt();
        fish.hunt();
        fish.flee();
    }
}

class Rabbit implements Prey {

    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing");
    }
}

class Hawk implements Predator {
    public void hunt() {
        System.out.println("The hawk is hunting");
    }
}

class Fish implements Prey, Predator {
    public void flee() {
        System.out.println("The fish flees bigger fish");
    }

    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }
}