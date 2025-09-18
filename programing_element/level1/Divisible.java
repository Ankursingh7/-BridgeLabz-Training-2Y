import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        System.out.println("" + number + " " + (number % 5 == 0));
    }
}
