package class21;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) {
        try {
            DataInputStream inputStream = new DataInputStream(new FileInputStream("data.dat"));
            System.out.println(inputStream.readChar());
            inputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
