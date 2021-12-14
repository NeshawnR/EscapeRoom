import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeRoom {

    static JTextField starter;
    private static JFrame window;
    private static JPanel panel;
    private static JButton room1;
    private static JButton room2;
    private static JButton room3;
    private static JButton room4;


    public static void main(String[] args) {

        window = new JFrame("Escape Room");
        panel = new JPanel();
        starter = new JTextField(10);
        room1 = new JButton("Room1");
        room2 = new JButton("Room2");
        room3 = new JButton("Room3");
        room4 = new JButton("Room4");
        JLabel starter = new JLabel("Welcome to the Escape Room");

        window.setSize(700, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        room1.addActionListener(new ClickerListener());
        room2.addActionListener(new ClickerListener());
        room3.addActionListener(new ClickerListener());
        room4.addActionListener(new ClickerListener());

        panel.add(room1);
        panel.add(room2);
        panel.add(room3);
        panel.add(room4);
        panel.add(starter);
        window.add(panel);
        window.setVisible(true);
    }

    private static class ClickerListener implements ActionListener {


        public void actionPerformed(ActionEvent actionEvent) {


            if (room1.isSelected()) {
                Double.parseDouble(JOptionPane.showInputDialog("What is 326 * 20"));
            }
        }


    }
}