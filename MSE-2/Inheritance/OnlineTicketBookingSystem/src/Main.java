import p1.Ticket.*;

public class Main {
    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket(6969, 800, "50 Shades of Yellow");
        mt.displayDetails();

        ConcertTicket ct = new ConcertTicket(9696, 150, "Dhinchak Dooja");
        ct.displayDetails();
    }
}