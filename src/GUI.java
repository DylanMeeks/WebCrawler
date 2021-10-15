import javax.swing.*;

public class GUI {

    private JFrame frame;
    private JLabel label;
    private JTextField textField;
    private JButton button1;
    private JButton button2;

    public GUI(){
        frame = new JFrame();
        label = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("Totally Legit Webcrawler");
        frame.setLayout(null);

        label.setText("Website to crawl: ");
        label.setSize(100,10);

        textField = new JTextField();
        textField.setSize(100,10);

        frame.add(label);
        frame.add(textField);

        frame.setVisible(true);
    }
}
