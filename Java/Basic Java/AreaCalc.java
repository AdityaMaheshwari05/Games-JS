
import java.util.Scanner;

public class AreaCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape (circle, rectangle, triangle): ");
        String figure = scanner.next().toLowerCase();

        switch (figure) {
            case "circle":
                System.out.print("Enter radius: ");
                double rad = scanner.nextDouble();
                double circleAr = Math.PI * rad * rad;
                System.out.println("Area of Circle: " + circleAr);
                break;
            case "rectangle":
                System.out.print("Enter length: ");
                double len = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                double rectangleAr = len * width;
                System.out.println("Area of Rectangle: " + rectangleAr);
                break;
            case "triangle":
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                double triangleAr = 0.5 * base * height;
                System.out.println("Area of Triangle: " + triangleAr);
                break;
            default:
                System.out.println("Invalid shape.");
        }
        scanner.close();
    }
}
