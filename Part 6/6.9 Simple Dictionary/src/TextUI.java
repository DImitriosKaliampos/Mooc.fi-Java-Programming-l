import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary  simpleDictionary;

    public TextUI(Scanner scanner, Object SimpleDictonary) {
        this.scanner = scanner;
        simpleDictionary = new SimpleDictionary();
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            else if (command.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word , translation);
            }
            else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String translated = simpleDictionary.translate(toBeTranslated);
                if (translated == null ) {
                    System.out.println("Word " + toBeTranslated + " was not found.");
                }
                else { 
                    System.out.println("Translation: " + translated);
                }
                
            }
            else {
                System.out.println("Unkown command");
            }
            
        }
    }
}
