import java.util.Arrays;

public class for_practice{
    public static void main(String[] args) {
        int[][] marks = new int[5][2];
        for(int i =0;i< 5;i++){
            for(int j =0;j<2;j++){
                marks[i][j] = i*j;
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
//        }
//        System.out.println(Arrays.deepToString(marks));


//        for(int[]row: marks){
//            for(int el: row){
//                System.out.print(el+" ");
//            }
//            System.out.println();
//        }
    }
}
}