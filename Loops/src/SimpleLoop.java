import java.util.Scanner;

public class SimpleLoop {

    public static void main(String[] args) {
        System.out.println("Choose Number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        while (i<n) {
            System.out.println(i);
            i++;
        }
    }
}
