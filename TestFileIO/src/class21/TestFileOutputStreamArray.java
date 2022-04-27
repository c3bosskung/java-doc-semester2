package class21;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStreamArray {
    public static void main(String[] args) {
        try (FileOutputStream outputStream = new FileOutputStream("data.dat")) {
            String s = "Welcome to Java.";
            byte b[] = s.getBytes();
            outputStream.write(b);
            outputStream.flush();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
