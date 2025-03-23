import java.util.*;

class InvalidDiscountCode extends Exception{
    public InvalidDiscountCode(String message){
        super(message);
    }
}

class Checkout{
    public double totalCost;
    public Checkout(double totalCost){
        this.totalCost = totalCost;
    }
    public void applyDiscountCode(String code) throws InvalidDiscountCode{
        if(code.length() != 6 && code.length() != 9){
            throw new InvalidDiscountCode("Code must be 6-9 character long!");
        }
        if(!code.equals("SAVE10") && !code.equals("WELCOME20")){
            throw new InvalidDiscountCode("Invalid or Expired code!");
        }

        double discount = 0;
        if(code.equals("SAVE10")){
            discount = totalCost*0.1;
        }
        else if (code.equals("WELCOME20")){
            discount = totalCost*0.2;
        }
        totalCost = totalCost - discount;
        System.out.println("Discount has been applied. Code: "+code+", New Price: "+totalCost);
    }
}

public class Main {
    public static void main(String[] args) {
        double price = 4000;
//        String code = "SAVE10";
        String code = "WELCOME2";
        Checkout ck = new Checkout(price);
        try{
            ck.applyDiscountCode(code);
        }
        catch (InvalidDiscountCode e){
            System.out.println(e.getMessage());
            System.out.println("You can also proceed without discount, Price: Rs." + price);
        }
    }
}