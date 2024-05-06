public class variables {
    //enumerated type of variables
     enum Course {CE,CY,IS}

    public static void main(String[] args) {
        //integer variables
        int studentAge = 10;
        double hosteldist = 9.45453545;
        float height;
        height = 20;
        System.out.println(studentAge);
        System.out.println(hosteldist);
        System.out.println(height);

        //strings variables
        String stuname = "Selasi";
        String stuhostel = "KT";
        System.out.println(stuname + " stays at " + stuhostel);

        //constant variables
        final int AGE = 17;
        //enumerated type of variables
         Course stcourse =Course.CE;
        System.out.println(stcourse);
    }
}
