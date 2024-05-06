public class equality_relational_operation {
    public static void main(String[] args) {
        int a = 20;
        int b = 31;
        //equality operations

//        System.out.print("is "+a+" equal to "+b+"?");
//        System.out.println(a==b);
//
//        System.out.print("is "+a+" greater than "+b+"?");
//        System.out.println(a!=b);

        //relational operators
        System.out.print("is "+a+" less than "+b+"?" );
        System.out.println(a<b);

        System.out.print("is "+a+" greater than "+b+"? ");
        System.out.println(a>b);

        System.out.print("is "+a+" less than or equal to "+b+"? ");
        System.out.println(a<=b);

        System.out.print("is "+a+" greater than or equal to "+b+"? ");
        System.out.println(a>=b);

        //ternary operator (?)
        int x = (a<b)? 40:80;
        System.out.println(x);
    }
}
