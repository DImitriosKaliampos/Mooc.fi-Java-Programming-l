public class Counter {
    
    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }
    
    public Counter() {
        this.startValue = 0;
    }

    public int value() {
        return this.startValue;
    }

    public void increase(int increaseBy) {
        this.startValue = this.startValue + increaseBy;
    }

    public void decrease(int decreaseBy) {
        this.startValue = this.startValue - decreaseBy;
    }

    @Override
    public String toString() {
        return "" + this.startValue;
    }
}
