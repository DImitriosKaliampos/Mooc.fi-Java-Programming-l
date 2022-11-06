import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> list;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.list.isEmpty()) {
            this.list.add(item);
        }
        else  {
            int totalWeight = 0;
            for (Item i: list) {
                totalWeight += i.getWeight();
            }
            if (totalWeight + item.getWeight() <= maxWeight)
                this.list.add(item);
        }
    }
    
    /* public void addItem(Item item) {
        if(item.getWeight() + this.totalWeight() > maxWeight) {
            return;
        }
        items.add(item);
    } */

    public String toString() {
        if (this.list.size() == 0) {
            return "0 items (0 kg)";
        }
        int totalWeight = 0;
        for (Item i: list) {
            totalWeight = totalWeight + i.getWeight();
        }
        if (list.size() == 1) {
            return this.list.size() + " item (" + totalWeight + " kg)";
        }
        else {
            return this.list.size() + " items (" + totalWeight() + " kg)";
        }
    }

    public void printItems() {
        for (Item i: list) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i: list) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (list.isEmpty()) {
            return null;
        }
        Item heaviestReturn = list.get(0);
        for (Item i: list) {
            if (i.getWeight() > heaviestReturn.getWeight() ) {
                heaviestReturn = i;
            }
        }
        return heaviestReturn;
    }
}
