
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestsFromAList {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file + ".txt"))) {
            
            while (reader.hasNextLine()) {
                    
            list.add(reader.nextLine());
                    
            }
        
        }  
        
        catch (Exception e) {
            
            System.out.println("Error message: " + e.getMessage());
       
        }

        System.out.println("Enter names, an empty name quits.");


        while (true) {    
        
            String name = scanner.nextLine();

            if (name.isEmpty() ) {
                    
                System.out.println("Thank you!");
                break;
            }
             
            if (list.contains(name)) {

                System.out.println("Name is on the list.");

            }
            else {

                System.out.println("The name is not on the list.");

            } 
        }
    
    }

}
    

