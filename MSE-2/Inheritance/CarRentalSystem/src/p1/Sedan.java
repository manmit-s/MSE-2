package p1;

public class Sedan implements FuelEfficiency, RentalCost{
    protected int days;
    protected double rent;

    public Sedan(int days, double rent){
        this.days = days;
        this.rent = rent;
    }
    public int getMileage() {
        return 30;
    }

    public double calculateRentalCost() {
        return days*rent;
    }

    public void displayDetails(){
        System.out.println("Details about Sedan - ");
        System.out.println("Mileage: " + getMileage());
        System.out.println("Total Rental Cost: Rs. " + calculateRentalCost());
    }
}
