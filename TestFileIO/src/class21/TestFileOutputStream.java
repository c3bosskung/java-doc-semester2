package class21;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args){
        try (FileOutputStream outputStream = new FileOutputStream("temp.dat")) {
            outputStream.write(1);
            outputStream.write(2);
            outputStream.write(3);
            outputStream.write(4);
            outputStream.write(5);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
