import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingAFile {
    
    public static void main(String[] args) {
        
        try (Scanner reader = new Scanner(Paths.get("data.txt"))) {
            // we read the file until all lines have been readd
            while (reader.hasNextLine()) {
                // we read one line
                String row = reader.nextLine();
                // we print the line that we read
                System.out.println(row);
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

    }
}


