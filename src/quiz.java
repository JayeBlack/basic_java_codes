import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class quiz {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("quiz.txt");
        Scanner scan = new Scanner(file);
        PrintWriter write = new PrintWriter("new.txt");
        double[] s = new double[8];

        int index = 0;
        int lines = 0;
        while (scan.hasNext() && index < s.length) {
            s[index] = scan.nextDouble();
            index++;
            lines++;

        }
        System.out.println("there are "+lines+" lines");
        Arrays.sort(s);
        int r = 0;
        while (r < s.length) {
            write.println(s[r]);
            r++;
        }
        for(double k: s){
            System.out.println(k);
        }
        System.out.println("listing i for printing:");
        int sum = 0;
        for(int i=0;i<s.length;i++){
            sum+=s[i];
        }
        System.out.println("The sum of the list is :"+ sum);
        write.close();
        scan.close();
    }
}
