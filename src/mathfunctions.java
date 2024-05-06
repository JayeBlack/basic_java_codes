public class mathfunctions {
    public static void main(String[] args) {
        //constants in java PI and E
        System.out.println("Constants in Java");
        System.out.println(Math.PI);
        System.out.println(Math.E);

        System.out.println(2*Math.PI);

        //trig functions in java
        System.out.println("Trig functions in java");
        System.out.println(Math.cos(90));

        System.out.println(Math.cos(Math.toRadians(90)));
        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.tan(Math.toRadians(90)));

        //assignment asin,acos,atan
        double y = 0.5;

        double arcsine = Math.asin(y);
        double arccos = Math.acos(y);
        double arctan = Math.atan(y);

        System.out.println("arcsine of 0.5: "+arcsine+ " arccos: "+arccos+ " arctan : "+arctan );
        //exponent functions
        System.out.println(Math.exp(5));//constant E to power 5
        System.out.println(Math.log10(15));//natural log of 15

        //assignment: find out the implementation of the log methods
        //          : calculate the log of different bases
        double a = 8;
        double b = 12;
        double log_of_a_base_b = Math.log(a)/Math.log(b);
        System.out.println("log of 8 base 12 is : "+ log_of_a_base_b);
        System.out.println(Math.pow(25,(double)1/2));
        System.out.println(Math.sqrt(25));

        //rounding methods
        System.out.println("rounding methods");
        System.out.println("ceil: "+Math.ceil(89.7952));
        System.out.println("ceil: "+Math.ceil(89.1952));

        System.out.println("floor: "+Math.floor(89.7952));
        System.out.println("floor: "+Math.floor(89.1952));

        System.out.println("rint: "+Math.rint(89.7952));
        System.out.println("rint: "+Math.rint(89.4952));

        System.out.println("round: "+Math.round(89.7952));
        System.out.println("round: "+Math.round(89.4952));

        //rounding to decimal places

        double x = 1.0/3;
        double x1 = Math.round(x*100)/100.0;
        System.out.println(x1);

        //max, min, abs
        System.out.println(Math.max(1.23,34));
        System.out.println(Math.min(1.23,34));
        System.out.println(Math.abs(-1.2));

        //random number generation
        double randnum = Math.random();
        System.out.println(randnum);
    }
}
