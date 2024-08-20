public class GUIJFrame {
    public static void main(String[] args) {
        //JFrame - GUI window to add components to

        //can do it like this or make custom Jframe child class to parent JFrame class
//        JFrame frame = new JFrame(); //creates a frame
//        ImageIcon logoImage = new ImageIcon("Logo.jpg"); //create image icon
//
//        frame.setTitle("JFrame title goes here"); //sets title of frame
//        frame.setIconImage(logoImage.getImage()); //change icon of frame
//        //exit app when x button is hit, not default, which is hide
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false); //prevent frame from being resized
//        frame.setSize(420, 420); //sets x and y dimension
//        frame.setVisible(true); // makes frame visible\
//        frame.getContentPane().setBackground(new Color(45, 40, 50)); //change color of background

        new MyFrame();

    }
}
