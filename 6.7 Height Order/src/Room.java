import java.util.ArrayList;

public class Room {
 
    private ArrayList<Person> list;

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        this.list.add(person);
    }

    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.list;
    }

    public Person shortest() {
        

        if (this.list.isEmpty()) {
            return null;
        }

        Person shortest = list.get(0);
        
        for (Person prs: list) {
            
            if (prs.getHeight() < shortest.getHeight()) {
                shortest = prs;
            }

        }
        return shortest;
    }

    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        Person returnedPerson = shortest(); 
        this.list.remove(shortest());
        return returnedPerson;
        
    }

}