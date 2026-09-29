import java.util.Scanner;

public class Account {
    private String accName;
    private int accNum;
    private double balance;

    Scanner input = new Scanner(System.in);

    public Account(String accName, int accNum, double balance){
        this.accName=accName;
        this.accNum=accNum;
        this.balance=balance;
    }

    public void deposit(){
        System.out.println("Enter deposit amount: ");
        int amount = Integer.parseInt(input.nextLine());

        while (amount <= 0) {
            System.out.println("Cannot process deposit (enter valid amount)");
            System.out.println("Enter deposit amount: ");
            amount = Integer.parseInt(input.nextLine());
        }

        balance += amount;
        System.out.println("Your new balance is: " + balance);
    }

    public void withdraw() {
        System.out.println("Enter withdrawal amount: ");
        int amount = Integer.parseInt(input.nextLine());

        while (amount <= 0 || amount > balance) {
            System.out.println("Cannot process withdrawal (enter valid amount)");
            System.out.println("Enter withdrawal amount: ");
            amount = Integer.parseInt(input.nextLine());
        }

        balance -= amount;
        System.out.println("Your new balance is: " + balance);
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccNum(int accNum){
        this.accNum = accNum;
    }


    public void setBalance(double balance){
        this.balance = balance;
    }

    public int getAccountNum(){
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void printInfo(){
        System.out.println("Account Name: " + accName);
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

