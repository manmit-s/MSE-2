package p1;

public class InternationalFlight implements BaggageAllowances, MealServices{
    private String flightNumber;

    public InternationalFlight(String flightNumber){
        this.flightNumber = flightNumber;
    }

    public int getBaggageLimit() {
        return 30; //assuming 30kg is limit for international flights
    }

    public boolean isMealProvided() {
        return true; //meals are provided in international flights
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
