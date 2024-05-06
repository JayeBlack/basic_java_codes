import java.util.Scanner;

public class user_intro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name:");
        String name = scan.nextLine();
//        if (name.matches("[a-zA-Z]")){
//
//        }

        System.out.print("Please enter your age:");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.print("Please enter your hostel name: ");
        String hostel = scan.nextLine();
        System.out.println("Hello " + name + " you are welcome!");
        System.out.println(name + " you are " + age + " years old.");
        System.out.println("Mr," + name + " you are in " + hostel+"hostel");

        scan.close();
    }
}
