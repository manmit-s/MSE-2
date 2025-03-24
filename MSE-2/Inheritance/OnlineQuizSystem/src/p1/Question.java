package p1;

public class Question {
    protected String questionText;
    protected int marks;
    public Question(String questionText, int marks){
        this.questionText = questionText;
        this.marks = marks;
    }
    public void displayQuestion(){
        System.out.println(questionText);
    }

    public static class MultipleChoice extends Question{
        protected String a, b, c;
        public MultipleChoice(String questionText, int marks, String a, String b, String c){
            super(questionText, marks);
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void displayQuestion() {
            super.displayQuestion();
            System.out.println("a. " + a);
            System.out.println("b. " + b);
            System.out.println("c. " + c);
        }
    }
    public static class TrueFalse extends Question{
        protected String t, f;
        public TrueFalse(String questionText, int marks){
            super(questionText, marks);
        }

        public void displayQuestion() {
            super.displayQuestion();
            System.out.println("True or False");
        }
    }
}
