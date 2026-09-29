import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new Account("John Smith", 5468224, 2000.00));
        accounts.add(new Account("Peter Vardy", 6513642, 15000));

        Account a1 = accounts.get(0);
        a1.deposit();
        a1.printInfo();
        a1.withdraw();
        a1.printInfo();

        a1 = accounts.get(1);
        a1.deposit();
        a1.printInfo();
        a1.withdraw();
        a1.printInfo();


    }
}
