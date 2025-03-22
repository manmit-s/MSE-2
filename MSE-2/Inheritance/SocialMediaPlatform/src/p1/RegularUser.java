package p1;

public class RegularUser extends User{
        protected int postCount;
        public RegularUser(String username, String email, int postCount){
            super(username, email);
            this.postCount = postCount;
        }

        public void displayDetails() {
            super.displayDetails();
            System.out.println("No. of posts: " + postCount);
        }
}
