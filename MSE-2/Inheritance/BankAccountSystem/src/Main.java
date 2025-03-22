import p1.CurrentAccount;
import p1.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(696969, "John", 6699);
        sa.displayDetails();

        CurrentAccount ca = new CurrentAccount(969696, "Kelly", 9966);
        ca.displayDetails();
    }
}