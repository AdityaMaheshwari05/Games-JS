
import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int largest = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("Largest number: " + largest);
        scanner.close();
    }
}
