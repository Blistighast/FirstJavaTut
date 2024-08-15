public class Methods {
    public static void main(String[] args) {
        //method is a function
        //overloaded methods, methods that share same name but have different params
        //method name + params = method signature

        String name = "Brian";
        int age = 21;
        hello(name, age);
        int x = 3;
        int y = 4;
        double g = 3;


        int sum = add(x, y);
        System.out.println(sum);
        System.out.println(add(3, 4, 5));
        System.out.println(add(3, 4, 5, 6));
        System.out.println(add(g, 4.0));

    }

    static void hello(String name, Integer age) {
        System.out.println("Hello " + name + ", You are " + age + " years old.");
    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }

    //overloaded method, different bcuz different params
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }

    //overloaded methods can also change based on data type
    static double add(double a, double b) {
        System.out.println("This is overloaded method #4");
        return a + b;
    }
}
