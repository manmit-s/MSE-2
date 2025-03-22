import p1.Employee.*;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("John", 69000);
        System.out.println("Bonus for Manager: " + m.calculateBonus());

        System.out.println("-----------------------------------");

        Developer d = new Developer("Kelly", 96000);
        System.out.println("Bonus for Developer: " + d.calculateBonus());
        System.out.println("-----------------------------------");
    }
}