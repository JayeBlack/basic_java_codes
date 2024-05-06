import java.util.InputMismatchException;
import java.util.Scanner;

public class switch_statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean v_input = false;
        while (!v_input) {
            try {
                System.out.print("Enter your birthyear: ");
                int year = scan.nextInt();
                int sign = year % 12;
                switch (sign) {
                    case 0:
                        System.out.println("Your zodiac animal is monkey");
                        break;
                    case 1:
                        System.out.println("Your zodiac animal is rooster");
                        break;
                    case 2:
                        System.out.println("Your zodiac animal is dog");
                        break;
                    case 3:
                        System.out.println("Your zodiac animal is pig");
                        break;
                    case 4:
                        System.out.println("Your zodiac animal is rat");
                        break;
                    case 5:
                        System.out.println("Your zodiac animal is ox");
                        break;
                    case 6:
                        System.out.println("Your zodiac animal is tiger");
                        break;
                    case 7:
                        System.out.println("Your zodiac animal is rabbit");
                        break;
                    case 8:
                        System.out.println("Your zodiac animal is dragon");
                        break;
                    case 9:
                        System.out.println("Your zodiac animal is snake");
                        break;
                    case 10:
                        System.out.println("Your zodiac animal is horse ");
                        break;
                    case 11:
                        System.out.println("Your zodiac animal is sheep");
                        break;
                    default:
                        System.out.println("Please enter a valid birthyear.");

                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid birthyear.");
                scan.nextLine();

            }
        }
    }
}
