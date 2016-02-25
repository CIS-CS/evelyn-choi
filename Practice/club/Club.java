import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public boolean join(Membership member)
    {
        if (members.contains(member) != true){
            members.add(member);
            return true;
        }
        return false;
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    public ArrayList<Membership> purge (int month, int year){
        ArrayList<Membership> purgedMembers = new ArrayList<Membership>();
        Iterator<Membership> it = members.iterator();
        while(it.hasNext()){
         Membership member = it.next();
            if(member.getMonth() == month && member.getYear() == year){
                it.remove();
                purgedMembers.add(member);
            }
        }
        return purgedMembers;
    }
}
