import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class writingtofiles {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outputfile = new PrintWriter("out.txt");

        outputfile.print("okay     "+"   alright ");
        outputfile.close();
    }
}
