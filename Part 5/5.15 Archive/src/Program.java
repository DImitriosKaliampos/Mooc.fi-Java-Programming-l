import java.util.Scanner;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args)  {
        
        Scanner reader = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();

        while (true) {
            
            System.out.println("Identifier? (empty will stop)");
            String identifier = reader.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }
            
            Archive arch = new Archive(identifier, name);
            if (!archive.contains(arch)) {
                archive.add(arch);
            }
        }

        System.out.println("==Items==");

        for (Archive i: archive) {
            System.out.println(i);
        } 
    }
}
