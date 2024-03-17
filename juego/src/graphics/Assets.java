/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.image.BufferedImage;

/**
 *
 * @author juanf
 */
public class Assets {
    
    public static BufferedImage player;
    public static BufferedImage alien;
    public static BufferedImage bg;
    
    public static void init(){
        player = Loader.ImageLoader("/players/player.png");
        
        alien = Loader.ImageLoader("/players/alienp.png");
        
        bg = Loader.ImageLoader("/players/lm.jpg");
        
    }
}
