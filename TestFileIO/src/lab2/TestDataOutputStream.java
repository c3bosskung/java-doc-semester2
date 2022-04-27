package lab2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {
    public static void main(String[] args) {
        FileOutputStream file = null;
        DataOutputStream outputStream = null;
        try {
            file = new FileOutputStream("data.dat");
            outputStream = new DataOutputStream(file);
            //write
            outputStream.writeUTF("Jim Henry");
            outputStream.writeInt(30);
            outputStream.writeDouble(65.5);
            outputStream.writeChar('A');
            file.flush();
            outputStream.flush();
            file.close();
            outputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
