import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> st_name = new ArrayList<>();
        ArrayList<String> home= new ArrayList<>();
        ArrayList<Double> st_marks = new ArrayList<>();
        ArrayList<String> n_name = new ArrayList<>();
        n_name.add("Araba");
        n_name.add("Selase");

        st_name.add("Ama");
        st_name.add("4");
        System.out.println(st_name);
        System.out.println(st_name.size());
        //loop to add contents to st_marks
        for(int i = 1; i< 100;i++){
            if(i%3==0 && i%4==0){
                st_marks.add((double)i);
            }
        }
        for(int i = 0;i<6;i++){
            home.add("home"+i);
        }
        System.out.println(home);
        System.out.println(st_marks);
        //removing items from the arraylist
        st_name.remove("4");
        st_name.add(0,"first");
        System.out.println(st_name);
        System.out.println(st_marks.get(2));
        //sorting arraylist
        Collections.sort(st_name);
        System.out.println(st_name);
        //reversing an arraylist
        System.out.println("reversed student name");
        Collections.reverse(st_name);
        System.out.println(st_name);
        System.out.println("new name with contents from student names");
        n_name.addAll(st_name);
        System.out.println(n_name);
    }
}
