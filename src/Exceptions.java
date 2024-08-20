import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        //exceptions - an event that occurs during execution that disrupts normal flow of instructions
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0");
        } catch (InputMismatchException e) {
            System.out.println("You need to input a number");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally { //good for closing open things
            System.out.println("scanner closed");
            scanner.close();
        }

    }
}
