package p1;

public class ContractEmployee extends Employee{
    private int contractDuration;

    public ContractEmployee(int employeeID, String name, double salary, int contractDuration){
        super(employeeID, name, salary);
        this.contractDuration = contractDuration;
    }
    public void displayDetails(){
        System.out.println("Contract Employee Details");
        super.displayDetails();
        System.out.println("------------------------");
    }
}
