public class prac_methods {
    public static void main(String[] args) {
        operation(20,30);
    }
    public static void operation(int a,int b){
        int sub = b -a;
        int add = a + b;
        int mult = a*b;
        int mod = a%b;
        int div = a/b;
        System.out.println(b+"-"+a+"="+sub);
        System.out.println(a+"+"+"="+add);
        System.out.println(a+"x"+b+"="+mult);
        System.out.println(a+"%"+b+"="+mod);
        System.out.println(a+"/"+b+"="+div);
    }
}
