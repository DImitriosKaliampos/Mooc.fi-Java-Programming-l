
    import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> todolist;


    public TodoList() {
        this.todolist = new ArrayList<String>();
    }

    public void add(String task) {
        todolist.add(task);
    }

    public void print() {
        for (int i = 0; i < todolist.size(); i++) {
            System.out.println(i + 1 + ": " + todolist.get(i));
        }
    }

    public void remove(int number) {
        todolist.remove(number -1 );
    }
}

