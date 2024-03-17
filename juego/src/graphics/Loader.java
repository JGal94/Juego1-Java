package graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 *
 * @author juanf
 */
public class Loader {
    public static BufferedImage ImageLoader(String path){
        try {
            return ImageIO.read(Loader.class.getResource(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
        
    }
    
}
