package evil;

/*
 * Simple swing app to show boo.
 * Adapted from HelloWorldSwing at
 * https://docs.oracle.com/javase/tutorial/uiswing/examples/start/index.html
 */
import javax.swing.*;
import java.awt.Font;

public class EvilSwing {
    /**
     * Create the GUI and show it.
     */
    private static void createAndShowGUI() {
        JFrame evilFrame = new JFrame("EvilSwing");
        evilFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Boo!");
        label.setFont(new Font(label.getFont().toString(), Font.PLAIN, 200));
        evilFrame.getContentPane().add(label);

        // Show the Window.
        evilFrame.pack();
        evilFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}