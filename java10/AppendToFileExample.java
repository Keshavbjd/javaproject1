import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFileExample {
    public static void main(String[] args) {
        String filePath = "example.txt"; // File to append to
        String dataToAppend = "This is new appended data.\n";

        // Use FileWriter in append mode
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(dataToAppend); // Append data to the file
            System.out.println("Data appended to file successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}
