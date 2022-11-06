package Part4;

public class Main {
    public static void main(String[] args) {
        PaymentCard paulscard = new PaymentCard(20);
        PaymentCard mattscard = new PaymentCard(30);

        paulscard.eatHeartily();
        mattscard.eatAffordably();

        System.out.println("Paul: The card has a balance of: " + paulscard + " euros");
        System.out.println("Matt: The card has a balance of: " + mattscard + " euros");
        
        paulscard.addMoney(20);
        mattscard.eatHeartily();

        System.out.println("Paul: The card has a balance of: " + paulscard + " euros");
        System.out.println("Matt: The card has a balance of: " + mattscard + " euros");
        
        paulscard.eatAffordably();
        paulscard.eatAffordably();
        mattscard.addMoney(50);

        System.out.println("Paul: The card has a balance of: " + paulscard + " euros");
        System.out.println("Matt: The card has a balance of: " + mattscard + " euros");

    }
}

