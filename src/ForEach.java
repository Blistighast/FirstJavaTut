import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        //for each or advanced for loop
//        String[] animals = {"cat", "dog", "bird", "goose"};
//        for (String i : animals) {
//            System.out.println(i);
//        }
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("mongoose");
        animals.add("bird");

        for (String i : animals) {
            System.out.println(i);
        }

    }
}
