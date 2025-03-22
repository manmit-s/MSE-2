import p1.Car;
import p1.LuxuryCar;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int days;
        Scanner in = new Scanner(System.in);
        Car c = new Car(111, "Honda", 2500, 4);
        System.out.println("Want CAR rent for how many days ?");
        days = in.nextInt();
        c.displayDetails();
        System.out.println("Total Rent: "+ days*c.rentalPricePerDay);
        System.out.println("--------------------------");

        LuxuryCar lc = new LuxuryCar(222, "BMW", 7000, 4, true);
        System.out.println("Want LUXURY CAR rent for how many days ?");
        days = in.nextInt();
        lc.displayDetails();
        System.out.println("Total Rent: "+ days*lc.rentalPricePerDay);
        System.out.println("--------------------------");

        in.close();
    }
}