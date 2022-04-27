package lab2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Lab2 {
    public static void main(String[] args){
        try {
            FileOutputStream outputStream = new FileOutputStream("data.dat");
            String s = "Hello World!";
            byte[] b = s.getBytes();
            outputStream.write(b);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
