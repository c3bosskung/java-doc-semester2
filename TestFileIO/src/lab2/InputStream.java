package lab2;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("data.dat");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
