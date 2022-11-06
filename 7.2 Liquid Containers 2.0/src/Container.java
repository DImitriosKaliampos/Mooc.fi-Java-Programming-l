/* import java.util.Scanner;

public class Container {

    private int first;
    private int second;
    private int contains;

    public Container() {
        this.contains = 0;
        this.first = 0;
        this.second = 0;
    }

    public int contains() {
        return contains;
    }

    public void start() {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {

            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println("");

            
            if (command.equals("add")) {
                add(amount);
            }
            else if (command.equals("move")) {
                move(amount);
            }
            else if (command.equals("remove")) {
                remove(amount);
            }
        }

    }
    
    public void add(int amount) {
        if (amount < 0 ) {
            start();
        }
        else if (amount + first > 100) {
            first = 100;
        }
        else {
            first += amount;
            System.out.println("Reached here");
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            start();
        }
        else if (second - amount < 0) {
            second = 0;
        }
        else {
            second -= amount;
        }
    }

    public void move(int amount) {
        if (first == 0) {
            start();
        }
        else if (amount < 0) {
            start();
        }
        else if (first - amount < 0) {
            if (amount + second > 100) {
                second = 100 ;
                first = 0;
                start();
            }
            second = amount - first;
            first = 0;
        }
        else {
            first -= amount;
            second += amount;
        }
    }

    public String toString() {
        return contains + "/100" ;
    }

} */

public class Container {
    private int contains;

    public Container() {
        contains = 0;
    }
    
    public void add(int amount) {
        if(amount < 0) {
            return;
        }
        contains += amount;
        if(contains > 100) {
            contains = 100;
        }
    }
    
    public int contains() {
        return contains;
    }
    
    public void setAmount(int amount) {
        this.contains = amount;
    }
    
    public void remove(int amount) {
        if(amount > contains) {
            contains = 0;
        } else {
            contains -= amount;
        }
    }
    
    public String toString() {
        return contains + "/100";
    }
    
    
}