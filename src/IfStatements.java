public class IfStatements {
    public static void main(String[] args) {
        int age = 17;
// if statement
//        if (age >= 75) {
//            System.out.println("youre olderthan 75");
//        } else if (age >= 18) {
//            System.out.println("you are an adult");
//        } else {
//            System.out.println("you are not an adult");
//        }

        String day = "Friday";

        //switches
        switch (day) {
            case "Sunday":
                System.out.println("It is sunday");
                break;
            case "Monday":
                System.out.println("It is monday");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("That is not a day");
        }
    }
}
