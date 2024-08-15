import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        //Array List = resizable array
        //elements can be added or removed after compilation
        //store ref data types, must use wrapper class if primitive

//        ArrayList<String> food = new ArrayList<String>();
//
//        food.add("pizza");
//        food.add("hamburger");
//        food.add("hotdog");
//
//        for (int i = 0; i < food.size(); i++) {
//            System.out.println(food.get(i));
//        }
//
//        //methods
//        food.set(0, "sushi"); //change element at given index
//        food.remove(1); //remove at given index
//        food.clear(); //clears array list

        //2d ArrayList - dynamic list of lists

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("tomatoes");
        produceList.add("cucumber");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("coffee");
        drinksList.add("soda");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(0).get(0));

    }
}
