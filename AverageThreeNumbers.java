import java.util.Scanner;

public class AverageThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float result = (a + b + c) / 3;
        System.out.println(result);
    }
}
