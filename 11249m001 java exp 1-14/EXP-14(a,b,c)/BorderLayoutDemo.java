import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Dashboard");
        f.setLayout(new BorderLayout(5, 5));

        JLabel header = new JLabel("Header", JLabel.CENTER);
        header.setOpaque(true);
        header.setBackground(Color.LIGHT_GRAY);
        header.setPreferredSize(new Dimension(0, 50));

        JLabel footer = new JLabel("Footer", JLabel.CENTER);
        footer.setOpaque(true);
        footer.setBackground(Color.LIGHT_GRAY);
        footer.setPreferredSize(new Dimension(0, 40));

        JPanel menu = new JPanel(new GridLayout(4, 1, 5, 5));
        menu.add(new JButton("Home"));
        menu.add(new JButton("Profile"));
        menu.add(new JButton("Settings"));
        menu.add(new JButton("Logout"));

        JLabel right = new JLabel("East", JLabel.CENTER);
        right.setOpaque(true);
        right.setBackground(Color.PINK);
        right.setPreferredSize(new Dimension(80, 0));

        JLabel content = new JLabel("Content Area", JLabel.CENTER);
        content.setOpaque(true);
        content.setBackground(Color.WHITE);

        f.add(header, BorderLayout.NORTH);
        f.add(footer, BorderLayout.SOUTH);
        f.add(menu, BorderLayout.WEST);
        f.add(right, BorderLayout.EAST);
        f.add(content, BorderLayout.CENTER);

        f.setSize(500, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}