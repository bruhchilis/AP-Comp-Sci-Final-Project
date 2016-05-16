
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class key extends KeyListenerTester
{
   

    
    public key(String a)
    {
        super(a);
        addKeyListener(this);
        setVisible(true);
    }

    public void keyReleased(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            player.X += 10;
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            player.X -= 10;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            player.Y -= 10;
        }
         if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            player.Y += 10;
        }
        
    }
    
}
