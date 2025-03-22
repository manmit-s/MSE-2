package p1;

public class BankAccount {
    protected int accountNumber;
    protected  String accountHolderName;
    protected  double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double calculateInterest(){
        return 0.0;
    }
    public void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
}
