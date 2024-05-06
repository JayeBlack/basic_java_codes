import java.util.Arrays;

public class prep {
    public static void main(String[] args) {
        double [] hey = new double[5];
        for(int i = 0;i<5;i++){
            hey[i] =2*(i+1);
        }
        double min = hey[0];
        for(int i = 0;i< hey.length;i++)
            if(hey[i]<min){
                min = hey[i];
            }
        System.out.println(Arrays.toString(hey));
        System.out.println("max number is "+min);
    }
}
