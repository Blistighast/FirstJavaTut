public class StaticKeyword {
    public static void main(String[] args) {
        //static keyword - single copy of a variable/method is created and shared
        //                  the class "owns" the static member
        Friend friend1 = new Friend("Brian");
        Friend friend2 = new Friend("Scott");
        //don't need to create class object
        System.out.println(Friend.numberOfFriends);
//        System.out.println(friend1.numberOfFriends);
//        should only be accessed in "static" way, ie by Friend class itself, who owns it
        Friend.displayFriends();

        //ex
        double a = 2.6;
        Math.round(a);
    }
}

class Friend {
    static int numberOfFriends;
    String name;

    Friend(String name) {
        this.name = name;
        numberOfFriends++; //activates every time it constructs new instance of object, due to being static
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}