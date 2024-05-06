import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class read_write {
    public static void main(String[] args)throws FileNotFoundException {
        File file = new File("test.txt");
        Scanner scan= new Scanner(file);

        PrintWriter write = new PrintWriter("written.txt");
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            String caps = line.toUpperCase();
            write.println(caps);
        }

        write.close();
        scan.close();

    }
}
