import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum = sum + i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum using while = " + sum);
            System.out.println("Sum using formula = " + formula);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
