package p1;

public class LuxuryCar extends Car{
    boolean hasSunroof;
    public LuxuryCar(int vehicleID, String brand, double rentalPricePerDay, int numberOFSeats, boolean hasSunroof){
        super(vehicleID, brand, rentalPricePerDay, numberOFSeats);
        this.hasSunroof = hasSunroof;
    }
    public void displayDetails() {
        System.out.println("Luxury Car Details:");
        super.displayDetails();
        System.out.println("Sunroof: Yes");
    }
}
