import java.applet.Applet;
import java.awt.*;


public class ShapesApplet extends Applet {

    public void paint(Graphics g) {
      
        g.setColor(Color.RED);
        g.drawRect(30, 40, 120, 70);
        g.drawString("Rectangle", 55, 130);

      
        g.setColor(Color.BLUE);
        g.drawOval(200, 40, 80, 80);
        g.drawString("Circle", 225, 140);

        g.setColor(Color.MAGENTA);
        g.drawLine(330, 40, 450, 120);
        g.drawString("Line", 375, 140);

             int[] x = {520, 480, 560};
        int[] y = {40, 120, 120};
        g.setColor(new Color(0, 128, 0));
        g.drawPolygon(x, y, 3);
        g.drawString("Triangle", 500, 140);
    }
}