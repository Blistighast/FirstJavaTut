public class OverloadedConstructors {
    public static void main(String[] args) {
        //overloaded constructors - multiple constructors within class with same name
        //                          but diff params
        //                          name + params = signature

        Pizza pizza1 = new Pizza("whole", "red", "cheddar", "pep");
        System.out.println("Here are ingr to your pizza");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        Pizza pizza2 = new Pizza("whole", "red", "cheddar");
        System.out.println("Here are ingr to your pizza");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
    }
}

class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

}