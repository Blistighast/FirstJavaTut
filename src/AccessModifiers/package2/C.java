package AccessModifiers.package2;

public class C {
    //public is accessible to other packages in same project
    public String publicMessage = "This is a public message";
    //protected is accessible to other packages as long as that class is a subclass of the protected parent
    protected String protectedMessage = "This is protected";
    //default is accessible only to classes within same package
    String defaultMessage = "This is the default";
    //private is available only to its own class
    private String privateMessage = "This is private";

}
