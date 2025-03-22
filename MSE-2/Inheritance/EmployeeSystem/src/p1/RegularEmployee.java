package p1;

public class RegularEmployee extends Employee{
    public RegularEmployee(int employeeID, String name, double salary){
        super(employeeID, name, salary);
    }
    public void displayDetails() {
        System.out.println("Regular Employee Details:");
        super.displayDetails(); // Parent ka displayDetails call
        System.out.println("------------------------");
    }
}
