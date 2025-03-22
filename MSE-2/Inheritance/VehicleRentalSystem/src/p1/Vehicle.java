package p1;

public class Vehicle {
    protected int vehicleID;
    public  String brand;
    public double rentalPricePerDay;

    public Vehicle(int vehicleID, String brand, double rentalPricePerDay){
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    public void displayDetails(){
        System.out.println("Vehicle ID: " + vehicleID);
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Rental Price Per Day: " + rentalPricePerDay);
    }
}
