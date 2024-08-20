import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        ImageIcon logoImage = new ImageIcon("Logo.jpg"); //create image icon

        this.setTitle("JFrame title goes here"); //sets title of frame
        this.setIconImage(logoImage.getImage()); //change icon of frame
        //exit app when x button is hit, not default, which is hide
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //prevent frame from being resized
        this.setSize(420, 420); //sets x and y dimension
        this.setVisible(true); // makes frame visible\
        this.getContentPane().setBackground(new Color(45, 40, 50)); //change color of background
    }
}
