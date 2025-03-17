
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int nume = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denom = scanner.nextInt();

            // Attempt division
            int res = nume / denom;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter numbers only.");
        } finally {
            System.out.println("Execution completed.");
            scanner.close();
        }
    }
}
