import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        Map<String,Integer> st_age = new HashMap<>();
        HashMap<Integer,Integer> st_d = new HashMap<>();
        //methods
        st_age.put("Nana",20);
        st_age.put("kofi",23);
        st_age.put("kojo",22);
        st_age.put("Nana",25);

        System.out.println(st_age);

    }
}
