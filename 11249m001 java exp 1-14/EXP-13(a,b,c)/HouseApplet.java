import java.applet.Applet;
import java.awt.*;

public class HouseApplet extends Applet {

    public void paint(Graphics g) {
        g.setColor(new Color(255, 228, 181));
        g.fillRect(100, 120, 200, 140);
        g.setColor(Color.BLACK);
        g.drawRect(100, 120, 200, 140);

        int[] rx = {80, 200, 320};
        int[] ry = {120, 40, 120};
        g.setColor(Color.RED);
        g.fillPolygon(rx, ry, 3);
        g.setColor(Color.BLACK);
        g.drawPolygon(rx, ry, 3);

        g.setColor(new Color(139, 69, 19));
        g.fillRect(180, 190, 40, 70);
        g.setColor(Color.YELLOW);
        g.fillOval(210, 225, 6, 6);

        g.setColor(Color.CYAN);
        g.fillRect(120, 145, 40, 40);
        g.fillRect(240, 145, 40, 40);
        g.setColor(Color.BLACK);
        g.drawRect(120, 145, 40, 40);
        g.drawRect(240, 145, 40, 40);
        g.drawLine(140, 145, 140, 185);
        g.drawLine(120, 165, 160, 165);
        g.drawLine(260, 145, 260, 185);
        g.drawLine(240, 165, 280, 165);

        g.setColor(new Color(34, 139, 34));
        g.fillRect(0, 260, 400, 20);
    }
}