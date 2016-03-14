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
public class Circle extends Shape{
    private double radius;
    
    
    public Circle(){
        super();
        radius = 1.0;
    }

    public Circle(double rad){
        super();
        radius = rad;
    }
    
    public Circle(double rad, String col, boolean fill){
        super(col, fill);
        radius = rad;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double rad){
        radius = rad;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString(){
        return "A circle with radius = " + radius + ", which is a subclass of " + super.toString();
    }
    
}
