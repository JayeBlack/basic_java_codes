import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readingfiles {
    public static void main(String[] args) throws FileNotFoundException {
        //read the text file in project folder
        File inputfile = new File("test.txt");
        File filetodelete = new File("testdelete.txt");

        //read the text file outside project folder
        File desktopfile = new File("C:\\Users\\JEREMIAH BOATENG\\Desktop\\testdesktop.txt");

        //check methods available on file variable
        System.out.println(desktopfile.exists());
        //size of the file
        System.out.println(inputfile.length());
        //assignment
        System.out.println(inputfile.getAbsolutePath());
        //absolute
        //cornical

//        filetodelete.delete();
        //play with the other methods for delete.

        Scanner scan = new Scanner(inputfile);
        // open test file and read content
        //while loop to iterate through the file
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        scan.close();
    }
}
