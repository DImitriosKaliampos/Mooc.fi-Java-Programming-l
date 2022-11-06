import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here

    public void addMeal(String Meal) {
        if (!meals.contains(Meal)) {
            this.meals.add(Meal);   
        }
    }

    public void printMeals() {
        System.out.println(meals);
    }

    public void clearMenu() {
        this.meals.clear();
    } 
}