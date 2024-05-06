import java.util.Arrays;

public class mulltidimArrays {
    public static void main(String[] args) {
        double[][] marks = new double[5][2];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[0].length; j++) {
                marks[i][j] = (int) (Math.random() * (double) 78);
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<marks.length;i++){

        }

    }
}
        // java jagged array
        //developersinvogue.org -Ivy and Maxwell
        //java language updates
        //ethel cofie's




