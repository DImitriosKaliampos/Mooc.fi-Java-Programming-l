import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private Container container1;
    private Container container2;

    public UserInterface(Scanner scanner ,Object container1, Object container2) {
        this.container1 = new Container();
        this.container2 = new Container();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {

            
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println("");

            
            if (command.equals("add")) {
                container1.add(amount);
            }
            else if (command.equals("remove")) {
                if (amount > container2.contains()) {
                    container2.remove(amount);    
                }
                container2.remove(amount);
            } else if(command.equals("move")) {
                if(amount > container1.contains()) {
                    container2.add(container1.contains());
                    container1.setAmount(0);
                } else {
                    container1.remove(amount);
                    container2.add(amount);
                }
            }
        }

    }
    
}
