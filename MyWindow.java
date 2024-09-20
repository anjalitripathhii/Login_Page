import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyWindow extends JFrame
{
    private JLabel heading;
    Font font=new Font("",Font.LAYOUT_LEFT_TO_RIGHT,20);

    private JPanel mainPanel;
    private JLabel nameLabel,passwordLabel;
    private JTextField nameTextField;
    private JPasswordField passwordField;
    private JButton button1,button2;

     public MyWindow(){
        super.setTitle("This is my First form..");
        super.setSize(600, 500);
        super.setLocation(100,100);

        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();

       //setVisible(true);
        super.setVisible(true);
        System.out.println("this is constructor..");
     }
     public void createGUI(){
        //this method create design of form
        this.setLayout(new BorderLayout());
        heading=new JLabel("Login Form");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);

        this.add(heading,BorderLayout.NORTH);

        //working with JPanel-----
        mainPanel =new JPanel();

        //set layout for mainPanel
        mainPanel.setLayout(new GridLayout(3,2));

        nameLabel=new JLabel("Enter name");
        nameLabel.setFont(font);

        passwordLabel=new JLabel("Enter password");
        passwordLabel.setFont(font);
        
        nameTextField=new JTextField();
        nameTextField.setFont(font);

        passwordField=new JPasswordField();
        passwordField.setFont(font);

        button1=new JButton("Submit");
        button1.setFont(font);

        button2=new JButton("Reset");
        button2.setFont(font);

        mainPanel.add(nameLabel);

        mainPanel.add(nameTextField);

        mainPanel.add(passwordLabel);

        mainPanel.add(passwordField);

        mainPanel.add(button1);
        mainPanel.add(button2);

        this.add(mainPanel,BorderLayout.CENTER);

     }
}
