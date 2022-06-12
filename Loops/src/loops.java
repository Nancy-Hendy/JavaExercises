import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int i = 0;
//        while (i < num){
//            System.out.println("num = "+ i );
//            i++;
//        for (i =1 ;i <= num;i++){
//
//           if (i % 2==0) {
//               System.out.println(i);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=1;
        while (i < n) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
            i++;
           }

        }
    }

