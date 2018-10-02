package EpicVotingSystem;
/**
 * File Name :
 * author :
 * Date :
 * Description :
 */
import java.io.*;
import java.util.*;

public class VotingController
{
    //Create an Arraylist read & store staff & candidate data from file
    private ArrayList staffs = new ArrayList();
    private ArrayList candidates = new ArrayList();

   //Type to access individual staff & candidate from array list
    private Staff theStaff;
    private Candidate theCandidate;

    //VotingController constructor
    public VotingController()
    {
        loadStaffData();
        loadCandidateData();
    }

    //loads candidates from file. This method is complete and working ok.
    public void loadCandidateData()
    {
        try
        {
             String fileName = "candidates.txt";
             File theFile = new File(fileName);
             BufferedReader reader = new BufferedReader(new FileReader(theFile));

             String candidateData;

             while((candidateData = reader.readLine())!= null)
             {
                 String[] candidateDetails = candidateData.split(",");
                 int code = Integer.parseInt(candidateDetails[0]);
                 int votes = Integer.parseInt(candidateDetails[2]);
                 theCandidate = new Candidate(code, candidateDetails[1], votes);
                 candidates.add(theCandidate);
             }
             reader.close();
         }
         catch(IOException e)
         {
             System.out.println("Error! There was a problem with loading candidate names from file");
         }
    }

    //returns a staff if found in the staffs ArrayList
    public Staff getStaff(int id)
    {
        Iterator it = staffs.iterator();
        while(it.hasNext())
        {
            theStaff = (Staff) it.next();
            if(theStaff.getId()== id)
            {
                return theStaff;
            }
        }
        return null;
    }

	
    //returns the collection of candidates
    public ArrayList getCandidates()
    {
        return candidates;
    }


    //returns total number of staffs in the collection
    public int getTotalVoters()
    {
        return staffs.size();
    }


    //every staff vote must be saved to file
    public void recordVote()
    {
        theStaff.setVoted();
        theCandidate.addVote();
        saveStaffData();//save to file
        saveCandidateData();//save to file
    }


    //wites staffs back to file
    public void saveStaffData()
    {
        try
        {
            BufferedWriter writer = new  BufferedWriter(new FileWriter("staff.txt"));
            Iterator it = staffs.iterator();
            String staffDetails;
            while(it.hasNext())
            {
                theStaff = (Staff) it.next();
                staffDetails = theStaff.getId() + "," +theStaff.getName() + "," + theStaff.hasVoted() +"\n";
                writer.write(staffDetails);
            }
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    //=================================================================
    //writes candidates date back to file
    public void saveCandidateData()
    {
        // Assignment 2 Note : use this method to write data back to candidate text file
        // Write the code for this method by using saveStaffData() as sample syntax
    }
    //=================================================================
	
    //=================================================================
    //loads staff names from file.
    public void loadStaffData()
    {
        // Assignment 2 Note : use this method to read data from staff text file
	// and store in arraylist .
	// Write the code for this method by using loadCandidateData() as sample syntax
    }
    //=================================================================

    //=================================================================
    public Candidate getCandidate(int candidateCode)
    {
        // Assignment 2 Note : use this method to return the candidate if found in the candidates ArrayList
        //  Write the code for this method by using getStaff() as sample syntax
        return null;
    }
    //=================================================================

}