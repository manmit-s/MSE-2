import java.time.*;

class TimeExceededException extends Exception{
    public TimeExceededException(String message){
        super(message);
    }
}

class Exam{
    protected LocalDateTime startTime;
    protected double durationInMinutes = 60;

    public Exam(LocalDateTime startTime){
        this.startTime = startTime;
        System.out.println("Exam started at: " + startTime);
    }

    public void submitExam() throws TimeExceededException{
        LocalDateTime submitTime = LocalDateTime.now();
        int elapsedMin = (int)Duration.between(startTime, submitTime).toMinutes();

        if(elapsedMin > durationInMinutes){
            throw new TimeExceededException("Time Exceeded!! Cannot submit sorry.... Time taken: " + elapsedMin);
        }
        else {
            System.out.println("Congratulations exam has been submited. You took: " + elapsedMin + " minutes.");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        LocalDateTime stime = LocalDateTime.now();
        Exam exam = new Exam(stime);

        try{
            exam.submitExam();
        } catch (TimeExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}