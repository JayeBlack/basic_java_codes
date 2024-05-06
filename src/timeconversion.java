import java.util.Scanner;

public class timeconversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        //converting using only int
        double d_user = input.nextDouble();
        int user = (int) d_user;
        int years = (int)(user / (365.25 * 86400));
        int rem_sec = (int) (user % (365.25 * 86400));

        int months = (int) (rem_sec / (86400 * 30.4375));
        rem_sec %= (int) (86400 * 30.4375);

        int days = rem_sec / (86400);
        rem_sec = user % 86400;

        int hrs = rem_sec / 3600;
        rem_sec %= 3600;

        int mins = rem_sec / 60;
        rem_sec %= 60;

        int secs = rem_sec;

        System.out.println(user + " secs is : " + years + "year(s) " + months + "months " + days + "day(s) " + hrs + "hr(s) " + mins + "min(s) " + secs + "sec(s)");
        //converting using int and double
        input.close();
    }
}
