
package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author juanf
 */
public class KeyBoard implements KeyListener{
    
    private boolean[] keys = new boolean[256];
    public static boolean UPW, LEFTA, RIGHTD, DOWNS, SPEED;
    
    
    public KeyBoard(){
        UPW = false;
        LEFTA = false;
        RIGHTD = false;
        DOWNS = false;
        SPEED = false;
    }
    
    public void update(){
        UPW = keys[KeyEvent.VK_W];
        LEFTA = keys[KeyEvent.VK_A];
        RIGHTD = keys[KeyEvent.VK_D];
        DOWNS = keys[KeyEvent.VK_S];
        SPEED = keys[KeyEvent.VK_SPACE];
        
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
            keys[e.getKeyCode()] = true;
            System.out.println("trueeeee");
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
    
}
