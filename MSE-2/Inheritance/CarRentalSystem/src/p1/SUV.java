package p1;

public class SUV implements FuelEfficiency, RentalCost{
    protected int days;
    protected double rent;

    public SUV(int days, double rent){
        this.days = days;
        this.rent = rent;
    }

    public int getMileage() {
        return 25;
    }

    public double calculateRentalCost() {
        return days*rent;
    }

    public void displayDetails(){
        System.out.println("Details about SUV - ");
        System.out.println("Mileage: " + getMileage());
        System.out.println("Total Rental Cost: Rs. " + calculateRentalCost());
    }
}
