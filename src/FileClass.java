import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        //file - abstract representation of file and directory pathnames

        File file = new File("message.txt");

        if (file.exists()) {
            System.out.println("That file exists");
            System.out.println(file.canRead());
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        } else {
            System.out.println("That file doesn't exist");
        }
    }
}
