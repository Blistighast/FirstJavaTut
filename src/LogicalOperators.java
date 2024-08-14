import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
        && and
        || or
        ! not
         */
//        int temp = 25;
//
//        if (temp > 30 && temp < 35) {
//            System.out.println("Hot");
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("you are playing a game, press q or Q to quit");
        String response = scanner.next();
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("you are still playing");
        } else {
            System.out.println("you have quit the game");
        }
    }
}
