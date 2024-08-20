package AccessModifiers.package2;

import AccessModifiers.package1.A;

public class ASub extends A {

    public static void main(String[] args) {

//        C c = new C();
//
//        System.out.println(c.defaultMessage); //is fine because subA is in same package

        ASub asub = new ASub();
        System.out.println(asub.protectedMessage); //since Asub is child of A, it has access
    }
}
