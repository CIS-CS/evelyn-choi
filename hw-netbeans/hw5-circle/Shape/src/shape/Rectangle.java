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
public class Rectangle extends Shape {
 
    private double width;
    private double length;
    
    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double wid, double leng){
        super();
        width = wid;
        length = leng;
    }
    
    public Rectangle(double wid, double leng, String col, boolean fill){
        super(col, fill);
        width = wid;
        length = leng;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double wid){
        width = wid;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double leng){
        length = leng;
    }
    

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2*length) + (2*width);
    }
    
    @Override
    public String toString(){
        return "A Rectangle with width = " + width + "and length = " + length +", which is a subclass of yyy" + super.toString();
    }
    
}

