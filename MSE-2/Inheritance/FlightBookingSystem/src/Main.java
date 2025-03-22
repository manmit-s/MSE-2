import p1.*;
public class Main {
    public static void main(String[] args) {
        DomesticFlight df = new DomesticFlight("A6969");
        System.out.println("Domestic Flight: " + df.getFligtNumber());
        System.out.println("Baggage Limit: " + df.getBaggageLimit());
        System.out.println("Meals: " + (df.isMealProvided() ? "Yes":"No"));

        System.out.println("-----------------------------------");

        InternationalFlight inf = new InternationalFlight("B9696");
        System.out.println("International Flight: " + inf.getFlightNumber());
        System.out.println("Baggage Limit: " + inf.getBaggageLimit());
        System.out.println("Meals: " + (inf.isMealProvided() ? "Yes":"No"));
    }
}