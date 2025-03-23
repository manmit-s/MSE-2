package p1;

public class Ticket {
    protected int ticketId;
    protected double price;
    public Ticket(int ticketId, double price){
        this.ticketId = ticketId;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Price: " + price);
    }

    public static class MovieTicket extends Ticket{
        protected String movieName;
        public MovieTicket(int ticketId, double price, String movieName){
            super(ticketId, price);
            this.movieName = movieName;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("Movie Name: " + movieName);
            System.out.println("--------------------------");
        }
    }

    public static class ConcertTicket extends Ticket{
        protected String artistName;
        public ConcertTicket(int ticketId, double price, String artistName){
            super(ticketId, price);
            this.artistName = artistName;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("Artist Name: " + artistName);
            System.out.println("--------------------------");
        }
    }

}
