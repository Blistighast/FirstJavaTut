import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("writtenPoem.txt");
            writer.write("Roses are red \n");
            writer.write("Blumpus is blue \n");
            writer.write("Impus \n");
            writer.append("Appended \n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
