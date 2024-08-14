import java.util.Random;

public class RandomTut {
    public static void main(String[] args) {
        Random random = new Random();

//        int x = random.nextInt(6) + 1;
        double y = random.nextDouble(); //gives between 0 and 1
        boolean z = random.nextBoolean(); //true or false
        System.out.println(y);
    }
}
