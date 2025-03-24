//doesn't check end cases
import java.util.Arrays;

class DuplicateVoteExeption extends Exception{
    public DuplicateVoteExeption(String message){
        super(message);
    }
}

class VotingSystem{
    protected String[] userIdVoted = {"U1001", "U1002", "U1003"}; //already voted
    protected String voteCaster;
    public VotingSystem(String voteCaster){
        this.voteCaster = voteCaster;
    }
    public void duplicateVoteChecker() throws DuplicateVoteExeption{
        if(Arrays.asList(userIdVoted).contains(voteCaster)){
            throw new DuplicateVoteExeption("Each user can vote only once!");
        }
        else {
            System.out.println("Voted Successfully.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String vote = "U1001";
//        String vote = "P1001";
        VotingSystem vs = new VotingSystem(vote);

        try{
            vs.duplicateVoteChecker();
        } catch (DuplicateVoteExeption e) {
            System.out.println(e.getMessage());
        }
    }
}