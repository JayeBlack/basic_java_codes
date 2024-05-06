import java.util.ArrayList;

public class methods {
    public static void main(String[] args) {
        ArrayList<Double> st_marks = new ArrayList<>();
        f_meth(st_marks);
        System.out.println(st_marks);
        s_meth(st_marks);
        int f = 23;
        int v = 41;
        int q = 2;
        System.out.println("multiplication:");
        mult(f,v,q);
        System.out.println("Subtraction:");
        subtract(f,v);
    }
    public static int subtract(int a,int b){
        int sub = b-a;
        System.out.println(sub);
        return sub;
    }
    public static void mult(int x, int y, int z){
        int res = x*y*z;
        System.out.println(res);
    }
    public static void s_meth(ArrayList<Double> s){
        for(int i = 0;i<s.size();i++){
            System.out.println(s.get(i));
        }
    }
    private static void f_meth(ArrayList<Double> m) {
        for(int i = 1; i< 100;i++){
            if(i%3==0 && i%4==0){
                m.add((double)i);

            }
        }
    }
}

