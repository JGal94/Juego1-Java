/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameObject;


import input.KeyBoard;
import java.awt.Graphics;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import math.Vector2D;
import java.awt.Graphics2D;
import graphics.Assets;

/**
 *
 * @author juanf
 */
public class Player extends MovinObject {
    
    private Vector2D heading;
    private Vector2D aceleration;
    
    private final double ACC = 0.08;

    public Player(Vector2D position, Vector2D velocity,double maxVel, BufferedImage texture) {
        super(position, velocity, maxVel, texture);
        
        heading = new Vector2D(0,1);
        aceleration = new Vector2D();
        
        
        
    }
    
   
    @Override
    public void update() {
        
        
        if(KeyBoard.RIGHTD)
            angle += Math.PI/20;
        if(KeyBoard.LEFTA)
            angle -= Math.PI/20;
        
        if(KeyBoard.UPW){
            aceleration = heading.scale(ACC);
        }else{
            if(velocity.getMagnitude()!= 0){
                aceleration = (velocity.scale(-1).normalize().scale(ACC));
            }
                    
                    }
        velocity = velocity.add(aceleration);
        velocity.limit(maxVel);
        
        heading = heading.setDirection(angle-Math.PI/2);
        position = position.add(velocity);
        position = position.lmt(position);
        
        
       
        
       
       
    }

    @Override
    public void draw(Graphics g) {
       Graphics2D g2d = (Graphics2D)g;
		
		at = AffineTransform.getTranslateInstance(position.getX(), position.getY());
		
		at.rotate(angle, Assets.player.getWidth()/2, Assets.player.getHeight()/2);
		
		g2d.drawImage(Assets.player, at, null);
    }
    
    
}
