package p1;

public class User {
    protected String userName, email;
    public User(String userName, String email){
        this.userName = userName;
        this.email = email;
    }
    public void displayDetails(){
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
    }
//    class RegularUser extends User{
//        protected int postCount;
//        public RegularUser(String username, String email, int postCount){
//            super(username, email);
//            this.postCount = postCount;
//        }
//
//        public void displayDetails() {
//            super.displayDetails();
//            System.out.println("No. of posts: " + postCount);
//        }
//    }
//    class AdminUser extends User{
//        protected int adminLevel;
//        public AdminUser(String username, String email, int adminLevel){
//            super(username, email);
//            this.adminLevel = adminLevel;
//        }
//
//        public void displayDetails() {
//            super.displayDetails();
//            System.out.println("Admin Level: " + adminLevel);
//        }
//    }
}
