import java.util.Scanner;

public class UI {
    
    private JokeManager jokemanager;
    private Scanner scanner;

    public UI(Object JokeManager, Scanner scanner) {
        this.scanner = scanner;
        this.jokemanager = new JokeManager();
    }

    public void start() {
        reading();
    }
    
    
    public void reading() {
        while (true) {
            System.out.println("Commands:\n1 = add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            int intCommand = Integer.valueOf(command);
            if (intCommand == 1) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                jokemanager.addJoke(joke);
            }
            else if (intCommand == 2) {
                System.out.println("Drawing a random joke:");
                jokemanager.drawJokes();
            }
            else if (intCommand == 3) {
                System.out.println("Printing the jokes.");
                jokemanager.printJokes();
            }
            else {
                System.out.println("Invalid command");
                continue;
            }
        }
    }

}
