import java.util.Scanner;
import java.nio.file.Paths;

public class NumbersFromAFile {
    public static void main(String[] args)  {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("File? ");

        String file = reader.nextLine();

        System.out.println("Lower bound? ");

        int lower = Integer.valueOf(reader.nextLine());

        System.out.println("Upper bound? ");

        int upper = Integer.valueOf(reader.nextLine());

        int sum = 0;

        try { 
            
            Scanner scanner = new Scanner(Paths.get(file));

            while (scanner.hasNextLine()) {

                int num = Integer.valueOf(scanner.nextLine());
                
                if (num >= lower && num <= upper) {
                    
                    sum++;

                }

            }
            
        } catch (Exception e) {
            
            System.out.println("Error message: " + e.getMessage());

        }

        System.out.println("Numbers: " + sum);

    }
}
