
import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double cel = scanner.nextDouble();
        double fahrenheit = (cel * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahren = scanner.nextDouble();
        double cels = (fahren - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + cels);
        scanner.close();
    }
}
