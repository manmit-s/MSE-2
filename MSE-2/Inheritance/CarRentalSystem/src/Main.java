import p1.*;

public class Main {
    public static void main(String[] args) {
        Sedan s = new Sedan(5, 600);
        s.displayDetails();

        System.out.println("----------------------");

        SUV suv = new SUV(6, 750);
        suv.displayDetails();
    }
}