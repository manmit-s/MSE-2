package p1;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(int accountNumber, String accountHolderName, double balance){
        super(accountNumber, accountHolderName, balance);
    }

    @Override  //Overriding parent class method
    public double calculateInterest(){
        return 0.04*balance;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Interest @4%: "+ calculateInterest());
        System.out.println("------------------------");
    }
}
