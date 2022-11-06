import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        int pointsOfPassing = 0;
        int sum = 0;
        int sumOfPassing = 0; 
        System.out.println("Enter points totals, -1 stops: ");
        int stars0 = 0;
        int stars1 = 0;
        int stars2 = 0;
        int stars3 = 0;
        int stars4 = 0;
        int stars5 = 0;


        while (true) {
           
            String strToInt = scanner.nextLine();
            int grade = Integer.valueOf(strToInt);
            if (grade == -1) {
                break;
            }
            else if ( grade < 0 || grade > 100) {
                continue;
            }
            else {
                points += grade;
                sum += 1;
                if ( grade > 50) {
                    pointsOfPassing += grade;
                    sumOfPassing+= 1;
                }
                if ( grade < 50) {
                    stars0 += 1;
                }
                else if ( grade < 60) {
                    stars1 += 1;
                }
                else if ( grade < 70 ) {
                    stars2 += 1;
                }
                else if ( grade < 80 ) {
                    stars3 += 1;
                }
                else if ( grade < 90) {
                    stars4 += 1;
                }
                else {
                    stars5 += 1;
                }
            }
        }

        System.out.println("Point average (all): " + (double) points/sum);
        if ( sumOfPassing == 0) {
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        }
        else {
            System.out.println("Point average (passing): " + (double) pointsOfPassing / sumOfPassing);
            System.out.println("Pass percentage: " + (double)  sumOfPassing / sum * 100 );
        }
        
        System.out.println("Grade distribution: ");

        System.out.print("5:" );
        for (int j = 0; j < stars5 ; j++) {
            System.out.println("*");
        }
        if (stars5 == 0) {
            System.out.println("");
        }
        
        System.out.print("4:" );
        for (int j = 0; j < stars4 ; j++) {
            System.out.println("*");
        }
        if (stars4 == 0) {
            System.out.println("");
        }
        
        System.out.print("3:" );
        for (int j = 0; j < stars3 ; j++) {
            System.out.println("*");
        }
        if (stars3 == 0) {
            System.out.println("");
        }
        
        System.out.print("2:" );
        for (int j = 0; j < stars2 ; j++) {
            System.out.println("*");
        }
        if (stars2 == 0) {
            System.out.println("");
        }
        
        System.out.print("1:" );
        for (int j = 0; j < stars1 ; j++) {
            System.out.println("*");
        }
        if (stars1 == 0) {
            System.out.println("");
        }
        
        System.out.print("0:" );
        for (int j = 0; j < stars0 ; j++) {
            System.out.print("*");
        }
        if (stars0 == 0) {
            System.out.print("");
        }
        
    }
}
