/* public class App {
    public static void main(String[] args)  { */
        /* GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);
        register.addGradeBasedOnPoints(88);

        System.out.println(register.averageOfGrades()); */

        /* GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);

        System.out.println(register.averageOfPoints());
         */
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
    }
}
