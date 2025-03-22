import p1.*;

public class Main {
    public static void main(String[] args) {
        RegularUser ru = new RegularUser("hello_john", "john.4@gayhoo.com", 5);
        ru.displayDetails();
        System.out.println("---------------------------");
        AdminUser au = new AdminUser("hello_kelly", "kelly.69@lesbohoo.com", 69);
        au.displayDetails();
    }
}
