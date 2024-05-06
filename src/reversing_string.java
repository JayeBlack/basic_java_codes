public class reversing_string {
    public static String reverse_string(String message){
        StringBuilder r_string = new StringBuilder();
        for(int i = message.length()-1;i>=0;i--){
            r_string.append(message.charAt(i));
        }
        return r_string.toString();
    }
    public static void main(String[] args) {
        int max = Math.max(25,Math.max(15,16));
        String message = "Welcome to java programming";
        System.out.println("Original text: "+ message);
        String re_str = reverse_string(message);
        System.out.println("reversed text: "+re_str);
//        System.out.println(message.charAt(2));
//        System.out.println(message.substring(4,10));
//        System.out.println("the max number is "+ max);


    }
}
