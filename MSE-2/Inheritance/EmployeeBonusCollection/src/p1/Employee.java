package p1;

public abstract class Employee {
    protected String name;
    protected double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public abstract double calculateBonus();

    public static class Manager extends Employee{
        public Manager(String name, double salary){
            super(name, salary);
        }
        public double calculateBonus() {
            return salary*0.3; //assuming 30% of salary bonus
        }
    }

    public static class Developer extends Employee{
        public Developer(String name, double salary){
            super(name, salary);
        }

        public double calculateBonus() {
            return salary*0.6; //assuming 60% of salary bonus
        }
    }
}
