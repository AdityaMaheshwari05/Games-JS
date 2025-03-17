
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String rvd = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + rvd);
        scanner.close();
    }
}
