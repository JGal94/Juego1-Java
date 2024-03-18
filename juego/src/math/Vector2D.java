/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;

import main.Window;

/**
 *
 * @author juanf
 */
public class Vector2D {
    private double x,y;
   
    
    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
        
        
    }
    
    public Vector2D(){
        x=0;
        y=0;
        
    }
    public Vector2D lmt(Vector2D p){
        if (x>Window.WIDTH +10)
            x = 0;
        if(y>Window.HEIGHT+10)
            y= 0;
        if (x<-10)
            x = Window.WIDTH ;
        if(y<-10)
            y= Window.HEIGHT;
        return new Vector2D(x,y);
        
    }
    public void limit(double value){
        if(x > value)
            x = value;
        if(x< -value)
            x=-value;
        if(y > value)
            y = value;
        if(y< -value)
            y=-value;
        
    }
    
    public Vector2D normalize(){
        return new Vector2D(x / getMagnitude(), y / getMagnitude());
    }
    public Vector2D add(Vector2D v){
        return new Vector2D(x+ v.getX(), y+ v.getY());
    }
    public Vector2D scale(double value){
        return new Vector2D(x*value, y*value);
    }
    
    public double getMagnitude(){
        return Math.sqrt(x*x + y*y);
    }
    
    public Vector2D setDirection(double angle){
        return new Vector2D(Math.cos(angle)*getMagnitude(), Math.sin(angle)*getMagnitude());
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
}
