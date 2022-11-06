package Part4.Account;

public class YourFirstBankTransfer {
    
    public static void main(String[] args) {
        
        Account hisAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0);

        hisAccount.withdrawal(100.00);
        myAccount.deposit(100.00);

        System.out.println(hisAccount);
        System.out.println(myAccount);

    }
}
