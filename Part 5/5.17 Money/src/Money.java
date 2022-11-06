public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(euros, cents);
        newMoney = new Money(euros + addition.euros, cents + addition.cents);
        return newMoney ;
    }

    public boolean lessThan(Money compared) {
        if ( euros + cents*0.01 <= compared.euros + compared.cents*0.01) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        Money newMoney2 = new Money(euros, cents);
        
        if ( ((euros + cents*0.01) - (decreaser.euros + decreaser.cents*0.01)) < 0) {
            newMoney2 = new Money(0, 0);
            return newMoney2;
        } 
        newMoney2 = new Money(euros - decreaser.euros, cents - decreaser.cents);
        if (cents - decreaser.cents < 0 ) {
            newMoney2 = new Money(euros - decreaser.euros -1, 100 + (cents - decreaser.cents));
        }
        return newMoney2;
        
    }
}
