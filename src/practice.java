import java.util.Scanner;
import java.util.Random;
public class practice {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random number = new Random();

        int num = number.nextInt(10);

        System.out.print("Enter a random number between 0-9: ");
        int user = read.nextInt();

        if (user == num){
            System.out.print("Congratulations! You guessed the right number.");
        }else if (user < num){
            System.out.print("Wrong Choice, it is greater. Correct number is "+num);
        }else{
            System.out.print("Wrong Choice,it is less. Correct number is "+num);
        }

    }
}
