import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) {
        FileReader input;
        try {
            input = new FileReader("output.txt");
            int value;
            while((value = input.read()) != -1) {
                System.out.print((char) value);
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
