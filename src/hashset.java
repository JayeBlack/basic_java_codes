import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        // creation of hashsets
        Set<Integer> st_age = new HashSet<>();
        HashSet<String> st_name = new HashSet<>();
        HashSet<String> st_name1 = new HashSet<>();
        HashSet<String> st_name2 = new HashSet<>();
        HashSet<Double> st_marks = new HashSet<>();
        //assignment: hashmap
        // adding contents to hashset
        st_age.add(23);
        st_age.add(43);
        st_age.add(50);
        System.out.println(st_age);

        st_marks.add(83.6);
        st_marks.add(90.3);
        st_marks.add(89.8);
        System.out.println(st_marks);

        st_name.add("jaye");
        st_name.add("kofi");
        st_name.add("kay");
        System.out.println("st_name: "+st_name);
        // st_name1
        st_name1.addAll(st_name);
        System.out.println("for st_name1: "+st_name1);
        st_name1.remove("kay");
        st_name1.add("ama");
        System.out.println("new st_name1 without kay: "+ st_name1);
        //set subtraction
        st_name.removeAll(st_name1);
        System.out.println("set subtraction");
        System.out.println("new st_name: "+st_name);
        System.out.println(st_name1);
        //set intersection
//        st_name.retainAll(st_name1);
//        System.out.println("Intersection");
//        System.out.println(st_name);
//        System.out.println(st_name1);

        //set union
//        st_name1.addAll(st_name);
//        System.out.println("Union");
//        System.out.println(st_name1);
    }
}
