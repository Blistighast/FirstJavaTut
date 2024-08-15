import java.util.Random;

public class VariableScope {
    public static void main(String[] args) {
        //local= declared inside a method, visible to only that method
        //global = declared outside method but within a class, visible to all parts of class

        DiceRoller diceroller = new DiceRoller();

        diceroller.roll();
    }
}

class DiceRoller {
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
    }

    void roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}