
/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double min;
    private double max;
    private double increment;
   
    public Heater(double minimum, double maximum)
    {
        temperature = 15.0;
        increment = 5.0;
        min = minimum;
        max = maximum;
    }

    public void warmer (){
        if (temperature + increment <= max){
            temperature += increment;
        }
        else{
            System.out.println("Too hot!");
        }
    }
    
    public void cooler (){
        if (temperature - increment >= min){
            temperature -= increment;
        }
        else{
            System.out.println("Too cold!");
        }
    }
    
    public boolean setIncrement(double incre){
        if (incre > 0){
            increment = incre;
            return true;
        }
        else{
           return false;
        }
    }
    
    public double getTemperature(){
        return temperature;
    }
}
