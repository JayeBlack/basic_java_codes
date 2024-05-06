import java.util.InputMismatchException;
import java.util.Scanner;

public class euclidean_algorithm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 0;
        try {
            System.out.print("Enter first number: ");
            a = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("please enter an integer");
            scan.nextLine();
            a = scan.nextInt();
        }

        int b = 0;
        try {
            System.out.print("Enter second number: ");
            b = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("please enter an integer");
            scan.nextLine();

            b = scan.nextInt();
        }

        int gcd = 1;
        for (int c = 2; c <= a && c <= b; c++) {
            if (a % c == 0 && b % c == 0) {
                gcd = c;
            }
        }
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
    }
}
