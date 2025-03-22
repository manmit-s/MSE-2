package p1;

public class Car extends Vehicle{
    private int numberOfSeats;
    public Car(int vehicleID, String brand, double rentalPricePerDay, int numberOfSeats){
        super(vehicleID, brand, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
    }
    public void displayDetails() {
        System.out.println("Car Details:");
        super.displayDetails();
        System.out.println("Number Of Seats: "+ numberOfSeats);
    }
}
