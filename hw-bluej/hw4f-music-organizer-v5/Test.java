
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
    
    public void test()
    {
        MusicOrganizer musicOrg = new MusicOrganizer();
        int counter = 0;
        while (counter<25){
            //musicOrg.addFile("song"+counter);
            musicOrg.addTrack(new Track("artist","title"+counter, "song"+counter, 1, "2010"));
            counter++;
        }
        musicOrg.randomAll();
    }
}
