public class Arrays {
    public static void main(String[] args) {
        //arrays in {}

//        String[] cars = {"Camaro", "Corvette", "Tesla"};
//        cars[0] = "Mustang";
//        System.out.println(cars[0]);
//
//        String[] things = new String[3];
//
//        for (int i = 0; i < things.length; i++) {
//            System.out.println(cars[i]);
//        }

        //2D Arrays, array of arrays
//        String[][] cars = new String[3][3];
//
//        cars[0][0] = "Mustang";
//        cars[0][1] = "Corvette";
//        cars[0][2] = "F-150";
//        cars[1][0] = "Mustang";
//        cars[1][1] = "Corvette";
//        cars[1][2] = "F-150";
//        cars[2][0] = "Mustang";
//        cars[2][1] = "Corvette";
//        cars[2][2] = "F-150";
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println();
//            for (int j = 0; j < cars[i].length; j++) {
//                System.out.print(cars[i][j] + " ");
//            }
//        }

        String[][] cars = {
                {"Mustang", "Corvette", "F-150"},
                {"Mustang", "Corvette", "F-150"},
                {"Mustang", "Corvette", "F-150"}
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
    }
}
