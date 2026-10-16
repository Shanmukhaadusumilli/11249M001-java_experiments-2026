import java.applet.Applet;
import java.awt.*;


public class FunApplet extends Applet {

    public void paint(Graphics g) {
        
        g.setColor(Color.RED);
        g.fillRect(40, 30, 150, 80);

        
        g.setColor(Color.BLUE);
        g.fillOval(220, 30, 150, 80);


        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 22));
        g.drawString("Java Applets are fun!", 90, 160);
    }
}