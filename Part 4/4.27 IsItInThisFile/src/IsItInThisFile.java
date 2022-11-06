import java.util.Scanner;
import java.nio.file.Paths;


public class IsItInThisFile {
    public static void main(String[] args)  {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Name of the file? ");

        String file = reader.nextLine();

        System.out.println("Search for: ");

        String name = reader.nextLine();

        Boolean containsName = false;

        try ( Scanner scanner = new Scanner(Paths.get(file + ".txt"))) {
            
            while (scanner.hasNextLine()) {
                
                if (name.equals(scanner.nextLine())) {
                    
                    containsName = true;

                    System.out.println("Found!");

                    break;

                }

            }
        } 
        
        catch (Exception e) {
            
            System.out.println("Error message: " + e.getMessage());
        
        }
        
        if (!containsName) {

            System.out.println("Not found.");

        }
    
    }

}

