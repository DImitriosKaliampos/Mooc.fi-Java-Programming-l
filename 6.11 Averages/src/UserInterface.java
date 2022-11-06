import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(Object GradeRegister, Scanner scanner) {
        this.register = new GradeRegister();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        readPoints();
        System.out.println("");
        printGradeDistribution(); 
        printAverages(); 
    }

    public void readPoints() {
        while (true) {
            System.out.print("Points: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            int points = Integer.valueOf(input);
            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");
                continue;
            }
        
            this.register.addGradeBasedOnPoints(points);
        }
    }
    
    public void printAverages() {
        System.out.println("The average of grades: " + this.register.averageOfGrades());
        System.out.println("The average of points: " + this.register.averageOfPoints());
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
