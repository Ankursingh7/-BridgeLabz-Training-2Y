public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        int celsius = Integer.parseInt(args[0]);
        int fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(fahrenheit);
    }
}
