//Note: This class is complete. Don’t change code in this class,
//unless you want to add more functionality  for Candidate object

package EpicVotingSystem;
/**
 * File Name : 
 * author : 
 * Date :
 * Description :
 */
public class Candidate
{
    int candidateCode = 999;//999 is not an eligible candidate
    String name = null;
    int votes = 0; //total votes

    //constructor
    public Candidate(int candidateCode, String name, int votes)
    {
        this.candidateCode = candidateCode;
        this.name = name;
        this.votes = votes;
    }

    public int getCandidateCode ()
    {
        return candidateCode;
    }

    public String getName()
    {
        return  name;
    }

    public int getVotes()
    {
        return  votes;
    }

    public void addVote()
    {
        votes++;
    }

}