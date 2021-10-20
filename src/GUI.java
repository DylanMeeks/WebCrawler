import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JFrame frame;
    private JLabel label, label2;
    private JTextField textField1, textField2;
    private JButton button1, button2;
    public String webUrl;
    public String word;

    public GUI(){
        //instantiate frame
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Totally Legit Webcrawler");
        frame.setLayout(null);

        //instantiates and position label
        label = new JLabel();
        label.setText("Website to crawl: ");
        label.setBounds(2,0,150,30);

        //instantiates and position textField1
        textField1 = new JTextField();
        textField1.setBounds(152,0,500,30);

        //instantiates and position button1
        button1 = new JButton("Enter");
        button1.setBounds(652,0,100,30);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                webUrl = textField1.getText();
            }
        });

        //instantiates and position label2
        label2 = new JLabel();
        label2.setText("What am I looking for: ");
        label2.setBounds(2,30,150,30);

        //instantiates and position textLabel2
        textField2 = new JTextField();
        textField2.setBounds(152,30,500,30);

        //instantiates and position button2
        button2 = new JButton("Enter");
        button2.setBounds(652,30,100,30);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                word = textField2.getText();
            }
        });

        frame.add(label); frame.add(label2);
        frame.add(textField1); frame.add(textField2);
        frame.add(button1); frame.add(button2);


        frame.setSize(750,200);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
