public class Printf {
    public static void main(String[] args) {
        //printf - optional method to control, format, and display text to console window
        // 2 args, format string + (object/var/value)
        // % [flags] [precision] [width] [conversion-char]

        boolean myBoolean = true; // %b
        char myChar = '@'; // %c
        String myString = "Brian"; // %s
        int myInt = 50; // %d    d for decimal
        double myDouble = 1000; // %f  floating and double

        System.out.printf("This is a format string %d isn't it \n", myInt);
        System.out.printf("my boolean %b \n", myBoolean);
        System.out.printf("char %c \n", myChar);
        System.out.printf("string %s \n", myString);
        System.out.printf("double %f \n", myDouble);

        //width
        // min number of characters to be written as output
        System.out.printf("Hello %10s \n", myString); // "Hello      Brian "

        //precision
        // sets number of digits of precision for floating point values
        System.out.printf("You have this much money %.2f \n", myDouble); //1000.00

        //flags
        // add effect based on flag
        // - :left justify
        // + :output plus (+) or minus (-) sign for numeric value
        // 0 : numeric values are zero padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You have this much money %-20f justify \n", myDouble); //You have this much money 1000.000000          justify
        System.out.printf("You have this much money %+f \n", myDouble); //You have this much money +1000.000000
        System.out.printf("You have this much money %020f \n", myDouble); //You have this much money 0000000001000.000000
        System.out.printf("You have this much money %,f \n", myDouble); //You have this much money 1,000.000000

    }
}
