import java.util.Scanner;
import java.nio.file.Paths;


public class SportStatistics {
    public static void main(String[] args)  {
    
        System.out.println("File: ");

        Scanner reader = new Scanner(System.in);

        String file = reader.nextLine();

        System.out.println("Team: ");

        String team = reader.nextLine();

        int games = 0;

        int wins = 0;

        int losses = 0;

        try {
            
            Scanner scanner = new Scanner(Paths.get(file));
            
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                String[] parts = line.split(",");

                String homeTeam = parts[0];

                String visitingTeam = parts[1];

                int homePoints = Integer.valueOf(parts[2]);

                int visitingPoints = Integer.valueOf(parts[3]);

                if ( team.equals(homeTeam)  ) {

                    if (homePoints > visitingPoints) {
                        
                        games++;

                        wins++;
                    
                    } else {

                        losses++;

                        games++;

                    }
                    

                } 
                else if ( team.equals(visitingTeam)  )  {

                    if (visitingPoints > homePoints) {

                        games++;
                    
                        wins++;
                    
                    } else {

                        games++;

                        losses++;
                        
                    }

                }

            }

        } catch (Exception e) {

            // TODO: handle exception
        
        }

        System.out.println("Games: " + games);

        System.out.println("Wins: " + wins);

        System.out.println("Losses: " + losses);

    }  
}
