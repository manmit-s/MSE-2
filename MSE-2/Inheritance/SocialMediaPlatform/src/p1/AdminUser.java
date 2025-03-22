package p1;

public class AdminUser extends User {

    protected int adminLevel;

    public AdminUser(String username, String email, int adminLevel) {
        super(username, email);
        this.adminLevel = adminLevel;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Admin Level: " + adminLevel);
    }
}