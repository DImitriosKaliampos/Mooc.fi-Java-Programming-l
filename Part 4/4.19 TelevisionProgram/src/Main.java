import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<TelevisionProgram> tvProgram = new ArrayList<>();

        while (true) {
            System.out.println("Name: ");
            String program = sc.nextLine();
            if ( program.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(sc.nextLine());

            TelevisionProgram tp = new TelevisionProgram(program, duration);
            tvProgram.add(tp);
        }

        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.valueOf(sc.nextLine());

        for (TelevisionProgram tp: tvProgram) {
            if ( maxDuration >= tp.getDuration() ) {
                System.out.println(tp);
            }
        }

    }
}
