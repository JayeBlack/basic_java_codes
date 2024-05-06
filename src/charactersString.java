public class charactersString {
    public static void main(String[] args) {
        //escape sequences in java \t  \n \" \' \b
        System.out.println("test tab \tcheck");
        System.out.println("test newline \ncheck");
        System.out.println("test doublequotes \"check\"");
        System.out.println("test singlequotes \'check\'");
        System.out.println("test break \bcheck");
        System.out.println("john said \'java is fun and easy\' ");
        //casting characters as numbers and vice versa
        // what characters numbers represent

        System.out.println("5256 reps char: "+ (char)5256);
        System.out.println("525 reps char: "+ (char)525);
        System.out.println("000 reps char: "+ (char)000);

        //what numbers characters represent
        System.out.println("\' \' reps: "+(int)' ');
        System.out.println("\'?\' reps: "+(int)'?');
        System.out.println("\'A\' reps: "+(int)'A');
        System.out.println("\'a\' reps: "+(int)'a');

        // character declaration
        char letter = 'A';
        char num = '2';
        System.out.println("Is "+letter+ " a number "+ Character.isLetter(letter));
        System.out.println("Is "+num+" a number "+ Character.isDigit(num));

        //string data types
        String fname = "nanahf";
        String sname = "nana";

        System.out.println("the length of the fname is "+fname.length());
        System.out.println(fname.trim());

        System.out.println(fname.concat(sname));
        System.out.println("is fname equal to sname? "+ fname.equalsIgnoreCase(sname));
        System.out.println(fname.contains(sname));
        System.out.println("using equals"+fname.equals(sname));

        //assignment: use cases of the substrings
    }
}
