import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase h: suitcases) {
            weight += h.totalWeight();
        }
        return weight;
    }
    
    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight() <= maxWeight)
            suitcases.add(suitcase);
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)" ;
    }
}
