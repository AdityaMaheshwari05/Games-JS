
public class SumEvenNums {

    public static void main(String[] args) {
        int sum = 0;
        int number = 2; // first even number

        while (number <= 10) {
            sum += number;
            number += 2;
        }

        System.out.println("Sum of even numbers from 1 to 10: " + sum);
    }
}
