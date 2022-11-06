import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(Object TodoList,Scanner scanner) {
        this.scanner = new Scanner(System.in);
        todoList = new TodoList();
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            else if (command.equals("add")) {
                System.out.print("To add: ");
                String add = scanner.nextLine();
                todoList.add(add);
            }
            else if(command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int remove = Integer.valueOf(scanner.nextLine());
                todoList.remove(remove);
            }
            else if (command.equals("list")) {
                todoList.print();
            }
        }
    }
}
