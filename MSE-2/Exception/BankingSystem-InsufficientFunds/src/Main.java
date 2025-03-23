import java.util.*;
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}

class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            double shortfall = amount - balance;
            throw new InsufficientFundsException("Insufficient Balance, Shortfall: Rs." + shortfall);
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal successful, New Balance: Rs." + balance);
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double accountBalance = 69000.0;
        BankAccount account = new BankAccount(accountBalance);

        System.out.print("Enter the amount for withdrawal - ");
        double amount = in.nextDouble();

        try{
            System.out.printf("Requesting to withdraw %f .... \n", amount);
            account.withdraw(amount);
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}