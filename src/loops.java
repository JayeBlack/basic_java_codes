public class loops {
    public static void main(String[] args) {

        //for loops
        int sum = 0;
        for(int n = 1; n<11; n++){
            sum+=n;
        }
        System.out.println(sum);

//        while loop
        int count = 2;
        while (count < 11) {
            System.out.println(count);
            count += 2;
        }

        //first twenty numbers divisible by 3 and 7

//        int num = 1;
//        int d = 0;
//
//        while (num < 100000) {
//            if ((num % 3 == 0) && (num % 7 == 0)) {
//                System.out.println(num);
//                d++;
//            }
//            if (d == 20) {
//                break;
//            }
//            num++;
//        }
    }
}
