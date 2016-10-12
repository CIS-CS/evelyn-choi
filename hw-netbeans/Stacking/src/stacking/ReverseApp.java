// StackTester.java
package stacking;

import java.io.IOException;
import java.util.Scanner;
import java.lang.reflect.Array;

/**
 *  StackTester.java
 *  A simple program that uses the Stack class.
 *  @author Mark Hayes
 */
public class ReverseApp {
    
    public static void main(String[] args) throws IOException {
        
        // Create the stack object
        Stack s = new Stack(5);
        
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        
        String[] words = sentence.split(" ");
        
        for (int i = 0; words.length > i; i++){
            try{
                s.push(words[i]);
            }
            catch (Exception e){
                System.out.println("Error: " + e);
                System.exit(0);
            }
            
        }
        
        System.out.println(s.toString());
        
        

      /*  try {
            s.push(100);
            s.push(101);
            s.push(102);
            s.push(103);
            s.push(104);
            //s.push(103);
            //s.push(104);
            s.pop();
            s.pop();
            
            System.out.println(s.toString());
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }*/
        

    }
    
}





