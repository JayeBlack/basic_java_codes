import java.util.Scanner;

public class umatgrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        double mark = scan.nextDouble();
        if ((mark < 0) || (mark > 100)) {
            System.out.println("Enter a valid mark.");

        } else {
            if (mark >= 80) {
                System.out.print("FIRST CLASS");
            } else if (mark >= 70) {
                System.out.println("SECOND CLASS UPPER");
            } else if (mark >= 60) {
                System.out.println("SECOND CLASS LOWER");
            } else if (mark >= 50) {
                System.out.println("THIRD CLASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}
