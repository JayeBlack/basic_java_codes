import java.util.Scanner;
public class secondquiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the side: ");
        int side = scan.nextInt();
        double area = (6*Math.pow(side,2)/4*Math.tan(Math.PI/6));
        System.out.println(area);
    }
}
