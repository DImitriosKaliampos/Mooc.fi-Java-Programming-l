import java.util.Scanner;
import java.nio.file.Paths;

public class RecordsFromAFile {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Name of the file: ");

        String file = reader.nextLine();

        try {

            Scanner scanner = new Scanner(Paths.get(file));

            while (scanner.hasNextLine()) {
                
                String line = scanner.nextLine();

                String [] parts = line.split(",");

                String name = parts[0];

                int age = Integer.valueOf(parts[1]);
               
                if ( age == 1) {

                    System.out.println(name + ", age: " + age + " year");
                
                } 

                else {

                    System.out.println(name + ", age: " + age + " years");

                }

            }

        }

        catch(Exception e) {

        }

    }
}