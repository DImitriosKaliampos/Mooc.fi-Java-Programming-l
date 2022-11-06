import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) throws Exception {
        
        

        Scanner sc = new Scanner(System.in);

        while (true) {
            
            String input = sc.nextLine();
            
            if (input.equals("end")) {
                break;
            }

            int cube = (Integer.valueOf(input) ) * (Integer.valueOf(input) ) * (Integer.valueOf(input) );
            System.out.println(cube);
        }

    }
}
