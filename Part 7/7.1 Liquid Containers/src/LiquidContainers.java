import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 0;
        
        while (true) {

            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            System.out.println("");

            
            if (command.equals("add")) {
                if (amount + first > 100) {
                    first = 100;
                    continue;
                }
                else if (amount < 0) {
                    continue;
                }
                first += amount;
            }
            else if (command.equals("move")) {
                
                if (first == 0) {
                    continue;
                }
                else if (amount < 0) {
                    continue;
                }
                else if (first - amount < 0) {
                    if (amount + second > 100) {
                        second = 100 ;
                        continue;
                    }
                    second = amount - first;
                    first = 0;
                }
                else {
                    first -= amount;
                    if (amount + second > 100) {
                        second = 100;
                        continue;
                    }
                    second += amount;
                }
            } 
            else if (command.equals("remove")) {
                if (second == 0) {
                    continue;
                }
                else if ( second - amount < 0 ) {
                    second = 0;
                }
                else {
                    second -= amount;
                }
            }

        }
    }
}
