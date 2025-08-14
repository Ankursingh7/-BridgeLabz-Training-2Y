import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float result = 2 * (a + b);
        System.out.println(result);
    }
}
