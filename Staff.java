//Note: This class is complete. Don’t change code in this class,
//unless you want to add more functionality  for Staff object

package EpicVotingSystem;
/**
 * File Name :
 * author :
 * Date :
 * Description :
 */
public class Staff
{
    private int id;
    private String name;
    private int voted; //has the staff voted

    public Staff(int id, String name, int voted)
    {
            this.id = id;
            this.name = name;
            this.voted = voted;
    }

    public void setId(int id)
    {
       this.id = id;
    }

    public void setName(String name)
    {
            this.name = name;
    }

    public void setVoted()
    {
            this.voted = 1;
    }

    public int getId()
    {
       return id;
    }

    public String getName()
    {
            return name;
    }

    public int hasVoted()
    {
            return voted;
    }

}
