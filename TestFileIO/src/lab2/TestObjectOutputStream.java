package lab2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {
    public static void main(String[] args) {
        FileOutputStream file = null;
        ObjectOutputStream outputStream = null;
        Student std1 = new Student(111, "Henny");
        try {
            file = new FileOutputStream("students.dat");
            outputStream = new ObjectOutputStream(file);
            outputStream.writeObject(std1);
            outputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
