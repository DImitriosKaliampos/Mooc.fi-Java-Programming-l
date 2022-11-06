import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public void drawJokes() {
        // initializing random class
        Random random_method = new Random();
        if (jokes.isEmpty()) {
            System.out.println("Jokes are in short supply");
        }
        int index = random_method.nextInt(jokes.size());
        System.out.println(jokes.get(index)); 
    }

    public void printJokes() {
        for (String i : jokes) {
            System.out.println(i);
        }
    }
}
