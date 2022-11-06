import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        if (this.stack.isEmpty()) {
            return this.stack; 
        }
        return stack;
    }

    public String take() {
        return this.stack.remove(this.stack.size()-1);
        
    }
}
