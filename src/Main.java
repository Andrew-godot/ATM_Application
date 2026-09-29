import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Main {
    static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        if (accounts.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (Account account : accounts) {
                account.printInfo();
            }
        }

        accounts.add(new Account("John Smith", 5468224, 2000.00));
        accounts.add(new Account("Peter Vardy", 6513642, 15000));

        // Displays the information within ArrayList
        Account a1 = accounts.get(0);
        a1.printInfo();

        a1 = accounts.get(1);
        a1.printInfo();


        // Creates a new object ca1 of subclass CreditAccount, populates it with the 4 required parameters and displays the information
        CreditAccount ca1 = new CreditAccount("Peter Vardy", 6513642, 15000, 2500);
        ca1.printInfo();

        //Create Regular Account
        System.out.println("Enter the account name: ");
        String accName = input.nextLine();

        System.out.println("Enter the account number: ");
        int accNum = Integer.parseInt(input.nextLine());

        System.out.println("Enter the balance: ");
        double balance = parseDouble(input.nextLine());

        accounts.add(new Account(accName, accNum, balance));
        Account a2 = accounts.get(2);

        a2.printInfo();

        //Delete Regular Account
        accounts.remove(2);

        // Print remaining accounts
        for (Account account : accounts) {
            account.printInfo();
        }
    }
}
