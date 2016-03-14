/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author evelyc
 */
public class Shape {
    
    private String color;
    private boolean filled;
    
    /**
     * @param args the command line arguments
     */
    
    public Shape(){
        color = "red";
        filled = true;
    }
    
    public Shape(String col, boolean fill){
        color = col;
        filled = fill;
    }
    
    
   public String getColor(){
       return color;
   } 
   
   public void setColor(String col){
       color = col;
   }
   
   public boolean isFilled(){
       return filled;
   }
   
   public void setFilled(boolean fill){
       filled = fill;
   }
   
   public String toString(){
       return "A Shape with color of " + color + " and " + filled;
   }
}
