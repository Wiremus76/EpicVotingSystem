package EpicVotingSystem;
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

/**
 * File Name :
 * author :
 * Date :
 * Description :
 */

public class VotingInterface
{
    private VotingController vc;
    private Staff theStaff;
    private Candidate theCandidate;
    private final String USERNAME = "admin";
    private final String PASSWORD ="123";
    private int numberOfCandidates = 0;

    private BufferedReader in = new BufferedReader( new InputStreamReader( System.in ));

	//Here is the start of your program. 
   public static void main(String[] args)
    {
        VotingInterface vi = new VotingInterface();
        vi.start();
    }

	//This methods is complete and does not require change.
    public void start()
    {
        vc = new VotingController();
        commenceVoting();
    }

	    	
	
	//This method helps to manage admin session after a successfull login
	 private boolean manageAdmin()
     {
        boolean adminQuit = false;
        boolean systemQuit = false;

        while (!adminQuit){
            System.out.println("\nTo continue voting enter\"C\".\nTo end voting enter \"Stop\" : ");
            String input = getInput();
            if (input.equalsIgnoreCase("C")){
                //back to voting
                adminQuit = true;
            }
            else if(input.equalsIgnoreCase("Stop")){
                //stop system
                adminQuit = true;
                systemQuit = true;
                System.out.println("Voting System Closed");
            }
            else{
                System.out.println("Cannot understand your input, please re-enter : \n\n");
            }
        }
        return systemQuit;
     }
	
     //validates administrator username & password. This method is complete and does not require additional code.
     public boolean validateAdmin(String username, String password)
     {
        if(username.equalsIgnoreCase(USERNAME)&&(password.equals(PASSWORD))){
            return true;
        }
        else{
            return false;
        }
     }
	 
	 //screen input reader. This method is complete and working ok.
     private String getInput()
     {
        String theInput = "";

        try
        {
            theInput = in.readLine().trim();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        return theInput;
     }
	 
   //=======================================================================
    public void commenceVoting()
    {
        
        // Assignment 2 Note :
        // Use this method to display menu to vote or login as admin.
        // get user input by using getInput() methods.
        // call  manageVote() or validateAdmin() then manageAdmin()  
        // based on user input
        
    }
    //====================================================================-==
	
     
    //=======================================================================
    public void manageVote()
    {

        // Assignment 2 Note :
        // Use this method to enable staff to login.

        // you can identify staff from arraylist by using
        // getStaff() as shown below
        // theStaff = vc.getStaff(Integer.parseInt(getInput()));

        // After a user login with a valid ID
        // call getStaffVote() if user has not voted , otherwise display
        // a message to inform the user that they can't vote again.

        // get user input by using getInput() methods.
        // call  manageVote() or validateAdmin() then manageAdmin()
        // based on user input


     }
   //=======================================================================


    //=======================================================================
     public void displayVotingScreen()
     {

        // Assignment 2 Note :
        // Use this methods to  welcome & display staff name after a successfull login 
	// then display candidate names and indtructions on how to place a vote.		
     }
    //=======================================================================
	
		
     //=======================================================================
    //manages a staff vote 
     private void getStaffVote()
     {
	// Assignment 2 Note :
        // Use this methods to  capture and confirm a vote for staff
	// then display candidate names and indtructions on how to place a vote.	
     }
	//=======================================================================
	
	
    //=======================================================================
     //prints out the voting results after a succsssfull admin login
     public void printVoteResults()
     {
        // Assignment 2 Note :
        // Use this methods to  display voting statitictics & results of votes  after 
	// a succsssfull admin login the call manageAdmin() method to determine what to do next.

    }
    //=======================================================================

}
