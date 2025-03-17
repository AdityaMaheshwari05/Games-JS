
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) {
        try {
            // Specify the file name
            File temp = new File("data.txt");

            // Open file for reading
            Scanner scanner = new Scanner(temp);

            // Read and print file content
            System.out.println("File Content:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please make sure 'data.txt' exists.");
        }
    }
}
