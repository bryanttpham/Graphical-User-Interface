import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{

        private static JLabel userLabel;
        private static JTextField userText;
        private static JLabel passwordLabel;
        private static JPasswordField passwordText;
        private static JButton button;
        private static JLabel success;
        private static JFrame frame;
    public static void main(String[] args)
    {
        JPanel panel= new JPanel();
        frame= new JFrame();
        frame.setSize( 400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setResizable(false); 
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        panel.setLayout(null);
        
        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        passwordLabel= new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        userText= new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);
        success.setText("");

        frame.setVisible(true);

        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user=userText.getText();
        String password= passwordText.getText();
        System.out.println(user+", "+ password);

        if(user.equals("Bryant")&& password.equals("fluffydragon"))
        {
            success.setText("Login Successful!");
            JOptionPane.showMessageDialog(frame,"You are successfully logged in");
        }
        else{
            success.setText("Login Failure, Please Try Again.");
        }
    }
}