import java.util.ArrayList;

public class practicing_arraylist {
    public static void main(String[] args) {
        ArrayList<String> okay = new ArrayList<>();
        okay.add("jaye");
        okay.add("black");
        System.out.println(okay);

        okay.remove("jaye");
        System.out.println(okay);
    }
}
