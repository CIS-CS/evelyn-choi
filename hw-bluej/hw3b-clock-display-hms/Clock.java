import java.util.Calendar;

/**
 * Uses a ClockDisplay to display the time.
 * 
 * @author MHayes 
 * @version Sep2015
 */
public class Clock
{
    private ClockDisplay clock = null;

    /**
     * Constructor for objects of class Clock
     */
    public Clock()
    {
        clock = new ClockDisplay(12,00,00,"a.m.");
    }
    
    public void tick() 
    {    
        int previousSecond = -1;
        
        while (true) {
            Calendar calendar  = Calendar.getInstance();
            int currentSecond = calendar.get(Calendar.SECOND);
            
            if (currentSecond != previousSecond)
            {
                clock.timeTick();
                System.out.println(clock.getTime());
                previousSecond = currentSecond;
                
            }
        }
    }    
}
    