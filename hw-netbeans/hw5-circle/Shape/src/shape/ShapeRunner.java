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
public class ShapeRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shape shape = new Shape(); 
        shape.setFilled(true);
        shape.setColor("red");
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());
        System.out.println(shape.toString());
        
        Rectangle square = new Square(2.0, "green", true);
        Rectangle rectangle = new Rectangle(3.0, 2.0, "blue", false);
        
        square.setLength(5);
        rectangle.setWidth(5);        
        
        System.out.println(square.getArea());
        System.out.println(rectangle.getArea());
        
        
        
    }
    
}
