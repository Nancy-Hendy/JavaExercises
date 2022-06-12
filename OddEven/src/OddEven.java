import java.util.Random;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Odd or Even ?");
        String answer = scanner.next();

        System.out.println("Enter A number");
        int num1 = scanner.nextInt();

        Random random = new Random();
        int ub = 11;
        int num2 = random.nextInt(ub);
        System.out.println("num2 is " + num2);

        int sum = num1 + num2;
        System.out.println("sum is " + sum);
        if (sum % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");


        }
    }
}
