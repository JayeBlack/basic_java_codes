
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingExceptions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean w_entry = true;
        int x = 0;
        while (w_entry) {

            try {
                System.out.print("Enter a value for X: ");
                x = scan.nextInt();
                w_entry = false;
            }
            catch (InputMismatchException e) {
                System.out.println("Enter an integer.");
                scan.nextLine();
            }
        }
        int tries = 3;
        boolean sec = true;
        while (sec) {
            if (tries == 0)
                break;
            tries--;
           int y = 0;
            try {
                System.out.print("Enter a value for Y: ");
                y = scan.nextInt();
                sec = false;
            } catch (InputMismatchException e) {
                System.out.println("Enter an integer.");
                scan.nextLine();
            }

            try {
                int z = x / y;
                System.out.println(x + "/" + y + " = " + z);
            } catch (ArithmeticException a) {
                System.out.println("Div by zero is not allowed.");
                sec = true;
            }
        }


    }
}
