public class StringMethods {
    public static void main(String[] args) {
        //String = ref data type that can store 1 or more char
        String name = "Brian ";

        boolean result = name.equals("xBrian"); //returns boolean, case sensitive
        System.out.println(result);

        name.equalsIgnoreCase("brian"); //boolean not case sensitive

        int length = name.length(); //returns int
        System.out.println(length);

        char charIndex = name.charAt(0);
        System.out.println(charIndex);

        int indexOf = name.indexOf("r");
        System.out.println(indexOf);

        boolean empty = name.isEmpty();
        System.out.println(empty);

        String upperCase = name.toUpperCase(); // or lowercase
        System.out.println(upperCase);

        String trimmed = name.trim(); // removes all empty space b4 and after

        String replaced = name.replace('a', 'z');
        System.out.println(replaced);

    }
}
