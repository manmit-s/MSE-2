import p1.Employee.*;

public class Main {
    public static void main(String[] args) {
        RegularEmployee re = new RegularEmployee(101, "X", 56000);
        re.displayDetails();
        ContractEmployee ce = new ContractEmployee(404, "Y", 32000, 6);
        ce.displayDetails();
    }
}