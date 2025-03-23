import java.util.*;
class InvalidPatientIDException extends Exception{
    public InvalidPatientIDException(String message){
        super(message);
    }
}

class PatientRecords{
    protected String patientId;
    public PatientRecords(String patientId){
        this.patientId = patientId;
    }
    public void accessRecord() throws InvalidPatientIDException{
        if(!patientId.contains("P")){
            throw new InvalidPatientIDException("Invalid ID, ID must contain P in it!");
        }
        if(patientId.length() != 5){
            throw new InvalidPatientIDException("Invalid number of characters in ID!");
        }

        if(patientId.equals("P1001") || patientId.equals("P1002") || patientId.equals("P1003")){
            System.out.println("Permission Granted.");
        }
        else{
            throw new InvalidPatientIDException("Enter a valid Id!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String patientId;
        System.out.println("Enter you Patient ID for entry: ");
        patientId = in.nextLine();

        PatientRecords pr = new PatientRecords(patientId);

        try{
            pr.accessRecord();
        }
        catch(InvalidPatientIDException e){
            System.out.println(e.getMessage());
        }
        in.close();
    }
}