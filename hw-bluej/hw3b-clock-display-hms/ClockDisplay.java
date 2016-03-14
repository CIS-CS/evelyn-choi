
/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String meridiem;
    private String displayString;    // simulates the actual display
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        meridiem = "a.m.";
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute, int second, String meri)
    {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        meridiem = meri;
        setTime(hour, minute, second, meri);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    /*   public void minuteTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
            if (meridiem == "a.m."){
                meridiem = "p.m.";
            }
            else
                meridiem = "a.m.";
        }
        updateDisplay();
    }*/
    
    public void timeTick()
    {
        seconds.increment();
        if(seconds.getValue() == 0) {  // it just rolled over!
            minutes.increment();
            if(minutes.getValue() == 0) {  // it just rolled over!
                hours.increment();
                if (hours.getValue() == 0){
                    if (meridiem == "a.m."){
                        meridiem = "p.m.";
                    }
                    else 
                        meridiem = "a.m.";
                }
            }
        }
        updateDisplay();
    }

    
    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute, int second, String meri)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        meridiem = meri;
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {

            if (hours.getValue() == 0){
                displayString = "12";
            } 
            else{
                displayString = hours.getDisplayValue();
            }
            displayString += 
            ":" + 
            minutes.getDisplayValue() + 
            ":" +
            seconds.getDisplayValue() +
            " " +
            meridiem;
            ;
    }
}