public class numerictypecasting {
    public static void main(String[] args) {
        // numeric data types
        int age = 18;
        double height = 23.989;

        //string data types
        String weight = "1.43434";
        String weight1 = "2323";

        //conversion
        int newheight = (int) height;
        double newage = (double) age;

        double newweight = Double.parseDouble(weight);
        int newweight1 = Integer.parseInt(weight1);

        System.out.println(newweight1 + newage);

    }
}


