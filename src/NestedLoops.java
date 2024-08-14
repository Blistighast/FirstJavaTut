import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        //nested loop
        Scanner scanner = new Scanner(System.in);

        int rows;
        int col;
        String symbol = "";

        System.out.println("Enter # of rows");
        rows = scanner.nextInt();
        System.out.println("Enter # of col");
        col = scanner.nextInt();
        System.out.println("Enter symbol to use");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= col; j++) {
                System.out.print(symbol);
            }
        }
    }
}
