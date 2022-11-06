import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> packages;
    private int ttweight;

    public Package() {
        this.packages = new ArrayList<>(); 
    }

    public void addGift(Gift gift) {
        this.packages.add(gift);
        ttweight = ttweight + gift.getWeight();
    }

    public int totalWeight() {
        return ttweight;
    }
}
