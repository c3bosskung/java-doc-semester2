import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestOutputStreamWriter {
    public static void main(String[] args) {
        FileOutputStream file;
        OutputStreamWriter output ;
        try {
            file = new FileOutputStream("data.dat");
            output = new OutputStreamWriter(file);
            String s = "This is a line of text inside the file.";
            output.write(s);
            //must be close every time if you use io.
            output.close();
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
