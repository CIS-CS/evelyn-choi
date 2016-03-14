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
public class Square extends Rectangle{
 
 
    public Square(){
         super();
    }

    public Square(double side){
        super(side, side);
    }
    
    public Square(double side, String col, boolean fill){
        super(side, side, col, fill);
    }
    
    public double getSide(){
        return super.getLength();
    }
    
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    @Override
    public double getArea(){
        return super.getWidth() * super.getLength();
    }
    
    @Override
    public double getPerimeter(){
        return 4 * super.getLength();
    }
    
    @Override
    public String toString(){
        return "A square with side = " + super.getLength() + ", which is a subclass of " + super.toString();
    }


}
