import java.nio.file.Paths;
import java.util.Scanner;




public class PrintingASpecifiedFile {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String file = reader.nextLine();
    
        try (Scanner scanner = new Scanner (Paths.get(file + ".txt"))){
            
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error message: " + e.getMessage());
        }

    }
}
