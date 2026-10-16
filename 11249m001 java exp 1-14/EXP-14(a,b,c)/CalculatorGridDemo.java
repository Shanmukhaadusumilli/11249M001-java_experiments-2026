import javax.swing.*;
import java.awt.*;

public class CalculatorGridDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        f.setLayout(new BorderLayout(5, 5));

        JTextField display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        f.add(display, BorderLayout.NORTH);

        String[] labels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        JPanel buttons = new JPanel(new GridLayout(4, 4, 5, 5));
        for (String s : labels) {
            buttons.add(new JButton(s));
        }
        f.add(buttons, BorderLayout.CENTER);

        f.setSize(300, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}