import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter name");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        //do loop variation, always performs code at least once
        do {
            System.out.println("Enter name");
            name = scanner.nextLine();
        } while (name.isBlank());
    }
}
