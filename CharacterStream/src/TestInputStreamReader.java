import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReader {
    public static void main(String[] args) {
        FileInputStream file;
        InputStreamReader input;
        try {
            file = new FileInputStream("data.dat");
            input = new InputStreamReader(file);
            int value;
            while ((value = input.read()) != -1) {
                System.out.print((char) value);
            }
            input.close();
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
