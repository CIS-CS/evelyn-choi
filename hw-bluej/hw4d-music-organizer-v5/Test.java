
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void test(){
        MusicOrganizer musicOrg2 = new MusicOrganizer();
        int counter = 0;
        while (counter<100){
            musicOrg2.addFile("song"+counter);
            Track n = new Track("artist","title", "song"+counter, 1, "2010");
            musicOrg2.addTrack(n);
            counter++;
            System.out.println(n.getDetails());
        }
    }
}
