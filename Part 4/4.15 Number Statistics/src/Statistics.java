

public class Statistics {
    
    
    private int count;
    private int sum;
    private double average;
    

    
    public Statistics() {
        count = 0;
        sum = 0;
    }
    
    public void addNumber(int number) {
        count ++;
        sum += number;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return this.average = (double) sum / count;
    }

    public  int getCount() {
        return count;
    }
}
