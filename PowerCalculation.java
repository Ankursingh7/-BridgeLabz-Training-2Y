import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float result = (float)Math.pow(a, b);
        System.out.println(result);
    }
}
