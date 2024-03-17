/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package math;

/**
 *
 * @author juanf
 */
public class Vector2D {
    private double x,y;
    private int s;
    
    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
        
        
    }
    
    public Vector2D(){
        x=0;
        y=0;
        s=0;
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
    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
    
    
}
