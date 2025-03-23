package p1;

public class Employee {
    protected int employeeId;
    protected String name;
    protected double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
    public static class RegularEmployee extends Employee{
        public RegularEmployee(int employeeID, String name, double salary){
            super(employeeID, name, salary);
        }
        public void displayDetails() {
            System.out.println("Regular Employee Details:");
            super.displayDetails(); // Parent ka displayDetails call
            System.out.println("------------------------");
        }
    }
    public static class ContractEmployee extends Employee {
        private int contractDuration;

        public ContractEmployee(int employeeID, String name, double salary, int contractDuration) {
            super(employeeID, name, salary);
            this.contractDuration = contractDuration;
        }

        public void displayDetails() {
            System.out.println("Contract Employee Details");
            super.displayDetails();
            System.out.println("------------------------");
        }
    }

}