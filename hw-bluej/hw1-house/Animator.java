
/**
 * Write a description of class Animator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animator
{
    // instance variables - replace the example below with your own
    private int x;
    private Person p = new Person();
    private Circle circle = new Circle();

    /**
     * Constructor for objects of class Animator
     */
    public Animator()
    {
        // initialise instance variables
        x = 0;
    }

    public static void walk(){
        Picture walking = new Picture();
        walking.circularMove();
    }
    
    public void setup(){
        circle.makeVisible();
        p.moveVertical(0);
        p.moveHorizontal(-10);
        p.makeVisible();
    }
    
   public void walkAroundCircle(){
        p.makeVisible();
        circle.makeVisible();
        p.slowMoveHorizontal(50);
        p.slowMoveVertical(-150);
        p.slowMoveHorizontal(-100);
        p.slowMoveVertical(150);
        p.slowMoveHorizontal(100);
    }
    
   public void run(){
       setup();
       walkAroundCircle();
    }
    

   
}
