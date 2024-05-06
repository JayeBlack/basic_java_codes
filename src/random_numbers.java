import java.util.Scanner;

public class random_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 4 and 10: ");
        int f = 4;
        int s = 10;

        int random_num = (int) (Math.random() * ((s - f + 1) + f));
        System.out.println(random_num);

    }
}
