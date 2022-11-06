package Part4;

public class Agent {
    
    private String firstName;
    private String lastName;

    public Agent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //public void print() {
    //    System.out.println("My name is " + lastName + ", " + firstName + " " + lastName);
    
    public String toString() {
        return "My name is " + lastName + ", " + firstName + " " + lastName;
    }

}
