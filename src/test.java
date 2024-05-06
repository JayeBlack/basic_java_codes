import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        double marks[] = new double[10];
        // create a SD of array of integers
        //int[] ages = new int[6];
        //create a SD array and initialise
        //writing content into an array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (10 * i * Math.random());

        }
        //sorting arrays
        System.out.println("sorted marks:");
        Arrays.sort(marks, 0, marks.length);
        System.out.println(Arrays.toString(marks));
        //cloning marks
        double[] c_marks = marks.clone();
        Arrays.sort(c_marks);
        System.out.println("cloned marks:");
        System.out.println(Arrays.toString(c_marks));
    }
}
