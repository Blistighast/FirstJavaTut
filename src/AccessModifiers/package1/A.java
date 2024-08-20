package AccessModifiers.package1;

public class A {
    //    public static void main(String[] args) {
//
//        C c = new C();
//        System.out.println(c.publicMessage); //visible to any package in the project folder
////        System.out.println(c.defaultMessage); //default not available outside its own package
//    }
//protected is accessible to other packages as long as that class is a subclass of the protected parent
    protected String protectedMessage = "This is protected";
}
