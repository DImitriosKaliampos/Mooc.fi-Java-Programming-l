

import java.util.Scanner;

public class MainProgram1 {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        
        System.out.println("Enter numbers: ");

        Statistics odds = new Statistics();
        Statistics evens = new Statistics();

        while (true) {
            Scanner reader = new Scanner(System.in);
            int number = Integer.valueOf(reader.nextLine());
            if (number == -1 ) {
                break;
            }
            
            statistics.addNumber(number);
            if (number % 2 == 0 ) {
                evens.addNumber(number);
            }
            else {
                odds.addNumber(number);
            }
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evens.sum());
        System.out.println("Sum of odd numbers: " + odds.sum());


        //statistics.addNumber(3);
       //statistics.addNumber(5);
        //statistics.addNumber(1);
        //statistics.addNumber(2);
       // System.out.println("Count: " + statistics.getCount());
       // System.out.println("Sum: " + statistics.sum());
        //System.out.println("Average: " + statistics.average());
    }
}