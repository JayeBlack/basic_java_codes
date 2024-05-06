import java.util.Scanner;
public class area_of_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the triangle: ");

        int length = scanner.nextInt();

        System.out.print("Enter the height of the triangle: ");

        double height = scanner.nextDouble();

        double area = 0.5*length*height;

        System.out.print("The area of the triangle is:" + area);

    }
}
