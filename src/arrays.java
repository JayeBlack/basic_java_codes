import java.sql.SQLOutput;
import java.util.Arrays;

public class arrays {
    public static <string> void main(String[] args) {
//        int[] list = {10,12,13,15};
//        list[0] = 17;
//        int get = list[0];
//        System.out.println(get);
//        int max = list[0];
//        for(int i=1; i<list.length; i++){
//            if(list[i]> max){
//                max = list[i];
//            }
//        }
//        int min = list[0];
//        for(int i = 1; i<list.length; i++){
//            if(list[i]<min){
//                min = list[i];
//            }
//        }
//        for(int f: list){
//            System.out.println(f);
//        }
//        System.out.println("the max num is: "+max);
//        System.out.println("the min num is: "+min);
//        int [] d = list.clone();
//        System.out.println(Arrays.toString(d));
        //create a SD of array of doubles

        String[] student = new String[10];
        for (int j = 0; j < student.length; j++) {
            student[j] = "Student " + j;
        }
        System.out.println(Arrays.toString(student));
//        for(String o:student){
//            System.out.println(o);
//        }
    }
}
