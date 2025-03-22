package p1;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(int accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public double calculateInterest() {
        return 0.02*balance;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest @2%: "+calculateInterest());
        System.out.println("---------------------------------");
    }
}
