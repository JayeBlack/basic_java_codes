import java.util.Arrays;
import java.util.Scanner;
public class token {
    public static void main(String[] args) {
        String u = "this is a boy";
        Scanner scan = new Scanner(u);
        while(scan.hasNext()){
            System.out.println(scan.next());
        }
        System.out.println(Arrays.toString(u.split(" ")));
    }
}
