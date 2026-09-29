public class CreditAccount extends Account {

    private int creditLimit;

    public CreditAccount(String accName, int accNum, double balance, int creditLimit){
        super(accName, accNum, balance);
        this.creditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void printInfo(){
        System.out.println("Account Name: " + this.getAccName());
        System.out.println("Account Number: " + this.getAccountNum());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Credit Limit: " + this.creditLimit);
        System.out.println();
    }
}
