package p1;

public class DomesticFlight implements BaggageAllowances, MealServices{
    private String fligtNumber;

    public DomesticFlight(String fligtNumber){
        this.fligtNumber = fligtNumber;
    }

    public int getBaggageLimit() {
        return 15;  //assuming 15kg is limit for domestic flight
    }

    public boolean isMealProvided() {
        return false; //meals are not provided in domestic flight
    }

    public String getFligtNumber() {
        return fligtNumber;
    }
}
