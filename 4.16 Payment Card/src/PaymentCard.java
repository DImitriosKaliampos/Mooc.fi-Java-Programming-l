package Part4;

public class PaymentCard {
    
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public double eatAffordably() {
        if (balance > 2.6) {
            return balance = balance - 2.6;
        }
        else{
            return balance;
        }
    }

    public double eatHeartily() {
        if (balance > 4.6) {
            return balance = balance - 4.6;
        }
        else {
            return balance;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            if (balance > 150) {
                balance = 150;
            }
        }
        
    }
}
