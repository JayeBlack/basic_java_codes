import java.util.Scanner;

public class selections {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        int user = scan.nextInt();
        if (user % 2 == 0) {
            if (user > 0) {
                System.out.println("Your number is even and positive.");
            } else {
                System.out.println("Your number is even and negative.");

            }
        } else {
            if (user > 0) {
                System.out.println("Your number is odd and positive.");
            } else {
                System.out.println("Your number is odd and negative.");
            }
        }
        scan.close();
    }

}
