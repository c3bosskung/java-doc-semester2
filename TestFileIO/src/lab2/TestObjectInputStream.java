package lab2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {
    public static void main(String[] args) {
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("students.dat"));
            Student s = (Student) inputStream.readObject();
            System.out.println(s.id);
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
