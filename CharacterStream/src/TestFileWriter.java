import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter output;
        try {
            output = new FileWriter("output.txt");
            String s = "This is the data in text file.";
            output.write(s);
            output.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
