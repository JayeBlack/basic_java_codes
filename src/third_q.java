import java.util.Scanner;

public class third_q {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String user = scan.nextLine();
        for(int i =user.length()-1;i<=0;i--){
            System.out.println(user.charAt(i));

        }
    }
}
