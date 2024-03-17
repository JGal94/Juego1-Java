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
public class Player extends GameObject {
    
    

    public Player(Vector2D position, BufferedImage texture) {
        super(position, texture);
        
        
    }

    @Override
    public void update() {
       
        switch (position.getS()){
            
            case 0:
                if(KeyBoard.RIGHTD){
           position.setX(position.getX()+1);
           
       }else if(KeyBoard.LEFTA){
           position.setX(position.getX()-1);
           
       }else if(KeyBoard.UPW){
           position.setY(position.getY()-1);
           
       }else if(KeyBoard.DOWNS){
           position.setY(position.getY()+1);
           
       }
                
                break;
             
            
            case 1:
                if(KeyBoard.RIGHTD){
                    for(int i=0;i<2;i++){
           position.setX(position.getX()+1);
           
                    }
           
       }else if(KeyBoard.LEFTA){
           for(int i=0;i<2;i++){
           position.setX(position.getX()-1);
           }
            
           
       }else if(KeyBoard.UPW){
           for(int i=0;i<2;i++){
           position.setY(position.getY()-1);
           }
           
           
       }else if(KeyBoard.DOWNS){
           for(int i=0;i<2;i++){
           position.setY(position.getY()+1);
           }
           
           
       }
                
                break;
                
                
            case 2:
                if(KeyBoard.RIGHTD){
                    for(int i=0;i<4;i++){
           position.setX(position.getX()+1);
                    }
           
       }else if(KeyBoard.LEFTA){
for(int i=0;i<4;i++){
           position.setX(position.getX()-1);
}
           
       }else if(KeyBoard.UPW){
for(int i=0;i<4;i++){
           position.setY(position.getY()-1);
}
           
       }else if(KeyBoard.DOWNS){
           for(int i=0;i<4;i++){
           position.setY(position.getY()+1);
           }
           
       }
                
                
                break;
                
                
            case 3:
                
                if(KeyBoard.RIGHTD){
           for(int i=0;i<8;i++){
           position.setX(position.getX()+1);
           }
           
       }else if(KeyBoard.LEFTA){
           for(int i=0;i<8;i++){
            position.setX(position.getX()-1);
           }
           
       }else if(KeyBoard.UPW){
           for(int i=0;i<8;i++){
           position.setY(position.getY()-1);
           }
           
       }else if(KeyBoard.DOWNS){
           for(int i=0;i<8;i++){
           position.setY(position.getY()+1);
           }
           
       }
                
                break;
                
                
            default:
                break;
            
            
        }
        if (position.getX() >=810){
            position.setX(0);
        }else if(position.getX() <=-10){
            position.setX(800);
        }
        if (position.getY() >=610){
            position.setY(0);
        }else if(position.getY()<=-30){
            position.setY(600);
        }
        
        if (KeyBoard.SPEED && position.getS() == 3) {
        // Si se cumple la condición, restablece position.getS() a 0
        position.setS(0);
    }
    // Si KeyBoard.SPEED está presionado y position.getS() no es 3, aumenta position.getS()
    else if (KeyBoard.SPEED && position.getS() < 3) {
        position.setS(position.getS() + 1);
    }
        System.out.println(position.getS());
        
       
       
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(texture, (int)position.getX(), (int)position.getY(), null);
    }
    
    
}
