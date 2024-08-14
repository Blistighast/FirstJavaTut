import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        //Array List = resizable array
        //elements can be added or removed after compilation
        //store ref data types, must use wrapper class if primitive

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

        //methods
        food.set(0, "sushi"); //change element at given index
        food.remove(1); //remove at given index
        food.clear(); //clears array list
    }
}
