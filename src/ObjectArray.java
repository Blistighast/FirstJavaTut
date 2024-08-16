public class ObjectArray {
    public static void main(String[] args) {

//        Food[] fridge = new Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("burger");
        Food food3 = new Food("carrot");

//        fridge[0] = food1;
//        fridge[1] = food2;
//        fridge[2] = food3;

        Food[] fridge = {food1, food2, food3};

        System.out.println(fridge[0].name);
        System.out.println(fridge[1].name);
    }
}

class Food {
    String name;

    Food(String name) {
        this.name = name;
    }
}