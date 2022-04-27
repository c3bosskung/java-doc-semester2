package lab2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferOutputStream {
    public static void main(String[] args) {
        BufferedOutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream("data.dat"));
            String s = "Hello World!";
            byte[] b = s.getBytes();
            outputStream.write(b);
            outputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
