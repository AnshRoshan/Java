import java.io.*;

public class fileinput {
    public static void main (String[] args) throws IOException {
        PrintWriter writeMe = new PrintWriter("newFIle.txt");
        writeMe.println("Just writing some text to print to your file ");
        writeMe.close();
    }
}