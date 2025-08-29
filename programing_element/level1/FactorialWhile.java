import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n >= 0) {
            int fact = 1, i = 1;
            while (i <= n) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial = " + fact);
        } else {
            System.out.println("Invalid number");
        }
    }
}
