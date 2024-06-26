/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameObject;


import input.KeyBoard;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import math.Vector2D;
/**
 *
 * @author juanf
 */
public class Alien extends GameObject{

    private final Player player;

    public Alien(Vector2D position, BufferedImage texture, Player player) {
        super(position, texture);
        
        this.player = player;
    }

    @Override
    public void update() {
        player.position.getX();
        position.setX(position.getX());
        position.setY(position.getY());
        
        if (player.position.getX()> position.getX()){
            position.setX(position.getX()+1);
        }
        if (player.position.getX()< position.getX()){
            position.setX(position.getX()-1);
            
        }
        if (player.position.getY()> position.getY()){
            position.setY(position.getY()+1);
        }
        if (player.position.getY()< position.getY()){
            position.setY(position.getY()-1);
            
        }
        
        
        position = position.lmt(position);
        
         
    }

    @Override
    public void draw(Graphics g) {
          g.drawImage(texture, (int)position.getX(), (int)position.getY(), null);
    }
    
}
