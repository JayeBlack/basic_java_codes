import java.util.Arrays;

public class quiz3 {
    public static void main(String[] args) {
        int[][] con = {
                {3, 80},
                {2, 93},
                {1, 75},
                {3, 82}
        };
        double cwa = 0.0;
        int credit_hrs = 0;
        int totalmarks = 0;
        int[] row_collector = new int[con.length];

        for (int i = 0; i < con.length; i++) {
            credit_hrs += con[i][0];
            row_collector[i]=con[i][0];
        }
        System.out.println(credit_hrs);
        for (int i = 0; i < con.length; i++) {
            totalmarks += con[i][1];
        }
        System.out.println(totalmarks);
        for (int i = 0; i < con.length; i++) {
            cwa += con[i][0] * con[i][1];
        }
        cwa /= credit_hrs;
        System.out.println(cwa);
        System.out.println(Arrays.toString(row_collector));
    }
}
