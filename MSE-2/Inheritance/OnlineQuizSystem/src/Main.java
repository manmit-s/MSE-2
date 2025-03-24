import p1.Question.*;
public class Main {
    public static void main(String[] args) {
        String qs1 = "How many states are there in India?";
        String qs2 = "Taiwan is a country.";
        String a = "28", b = "29", c = "32";

        MultipleChoice mc = new MultipleChoice(qs1, 4, a, b, c);
        mc.displayQuestion();

        System.out.println("----------------------");

        TrueFalse tf = new TrueFalse(qs2, 2);
        tf.displayQuestion();
    }   
}