
package states;

import gameObject.Alien;
import gameObject.Player;
import graphics.Assets;
import java.awt.Graphics;
import math.Vector2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author juanf
 */
public class GameState {
    
    private Player player;
    private Alien alien;
    
    
    
    
    public GameState(){
        
        player = new Player(new Vector2D(100,500), new Vector2D(),5, Assets.player);
        alien = new Alien(new Vector2D(390,200), Assets.alien, player);
        
        
    }
    public void update(){
        player.update();
        alien.update();
    }
    public void draw(Graphics g){
        g.drawImage(Assets.bg, 0, 0, null);
        player.draw(g);
        alien.draw(g);
        
    }
  
    
}
