package lab2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferedInputStream {
    public static void main(String[] args) {
        BufferedInputStream inputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream("data.dat"));
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
            inputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
