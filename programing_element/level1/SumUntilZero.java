import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        System.out.print("Enter number (0 to stop): ");
        double n = sc.nextInt();

        while (n != 0) {
            total = total + n;
            System.out.print("Enter number (0 to stop): ");
            n = sc.nextInt();
        }
        System.out.println("Sum = " + total);
    }
}
