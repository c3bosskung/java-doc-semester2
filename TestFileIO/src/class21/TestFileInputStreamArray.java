package class21;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStreamArray {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("data.dat");
            int value = inputStream.read();
            while (value != -1) {
                System.out.println(value);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
