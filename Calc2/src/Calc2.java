import java.util.Scanner;

public class Calc2 {

    public static void main(String[] args) {

        String answer;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
            int num1 = scanner.nextInt();
            System.out.println(" Enter a second number");
            int num2 = scanner.nextInt();

            System.out.println("Enter your chosen operation");
            char value = scanner.next().charAt(0);

            switch (value) {
                case '+':
                    System.out.println("Result is " + num1 + num2);
                    break;
                case '-':
                    System.out.println("Result is " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result is " + num1 * num2);
                    break;
                case '/':
                    System.out.println("Result is " + num1 / num2);
                    break;
                default:
                    System.out.println("invalid input");

            }
            System.out.println("Any more maths? type y or x");
            answer = scanner.next();


        } while (answer.equals("y"));

    }
}
