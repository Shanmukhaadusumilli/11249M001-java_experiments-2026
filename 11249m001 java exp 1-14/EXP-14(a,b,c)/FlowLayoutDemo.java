import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Flow Layout");
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        for (int i = 1; i <= 8; i++) {
            f.add(new JButton("Button " + i));
        }

        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}