package lab2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestDataInputStream {
    public static void main(String[] args){
        DataInputStream inputStream = null;
        try {
            inputStream = new DataInputStream(new FileInputStream("data.dat"));
            System.out.println(inputStream.readUTF());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readDouble());
            System.out.println(inputStream.readChar());
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
