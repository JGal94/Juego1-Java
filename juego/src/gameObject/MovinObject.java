/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameObject;

import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import math.Vector2D;

/**
 *
 * @author juanf
 */
public abstract class MovinObject extends GameObject{
    
    protected Vector2D velocity;
    protected AffineTransform at;
    protected double angle;
    protected  double maxVel;
    

    public MovinObject(Vector2D position,Vector2D velocity,double maxVel, BufferedImage texture) {
        super(position, texture);
        this.velocity = velocity;
        this.maxVel = maxVel;
        angle = 0;
    }

    
    
}
