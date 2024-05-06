import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readingfiles2 {
    public static void main(String[] args) {
        File inputfile = new File("test.txt");
        Scanner scan = null;
        try{
            scan = new Scanner(inputfile);

        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        while(scan.hasNext()){
            if (scan.hasNextInt()){
                int x = scan.nextInt();
                System.out.println(x+": is an int");
            }
            else if(scan.hasNextDouble()){
                double y = scan.nextDouble();
                System.out.println(y+": is a double");
            }
            else if(scan.hasNextBoolean()){
                boolean b = scan.nextBoolean();
                System.out.println(b+": is a boolean");
            }
            else{
                String s = scan.next();
                System.out.println(s+ " is a string");
            }
        }
        scan.close();

    }
}
