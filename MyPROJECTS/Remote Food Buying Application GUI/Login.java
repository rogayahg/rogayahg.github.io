/*
 * 
 * Student: Dona AlThunayan - ID: 2110395
 * Student: Rogayah Garout - ID: 2112035
 * 
 */

package businessmenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login extends JFrame{
    
    private JPanel panel0;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel Title_Label; 
    private JLabel image_Label; 
    private JLabel username_Label; 
    private JLabel register_Label;
    private JLabel password_Label; 
    private JTextField userTextField; 
    private JTextField passTextField; 
    private JButton loginButton; 
    private JButton registerButton; 
    private String user,pass;
    
    public Login(){
        
        setTitle("GRABE AND GO APPLICATION");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500,430);
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\donaa\\OneDrive\\سطح المكتب\\My project (6).jpg")));
        setLocationRelativeTo(null);       

        setLayout (new GridLayout(5,1));
       
        panel0=new JPanel();
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();
      
      
        Title_Label=new JLabel("WELCOME TO GRAB AND GO APPLICATON");
        Title_Label.setForeground(Color.WHITE);
        Title_Label.setFont(new Font("serif",Font.BOLD,42));
        panel0.add(Title_Label);
     
        panel0.setOpaque(false);
        username_Label=new JLabel("Username:");
        username_Label.setFont(new Font("serif",Font.BOLD,20));

        userTextField=new JTextField(30);
        panel1.add(username_Label);
        panel1.add(userTextField); 
        panel1.setOpaque(false);

      
        password_Label=new JLabel("Password:");
        password_Label.setFont(new Font("serif",Font.BOLD,20));

        passTextField=new JTextField(30);
        panel2.add(password_Label);
        panel2.add(passTextField); 
        panel2.setOpaque(false);
      

        loginButton= new JButton("Login");
        loginButton.setBackground(Color.WHITE);
        loginButton.setFont(new Font("serif",Font.BOLD,18));
        loginButton.addActionListener(new FloginButtonEvent());
        panel3.add(loginButton);
        panel3.setOpaque(false);
     

        register_Label=new JLabel("Don't have an account? ");
        register_Label.setFont(new Font("serif",Font.BOLD,18));
        registerButton=new JButton("Register Here");
        registerButton.setBackground(Color.WHITE);
        registerButton.setFont(new Font("serif",Font.BOLD,18));
        registerButton.addActionListener(new RegisterButtonEvent());
        
        panel4.add(register_Label);
        panel4.add(registerButton);
        panel4.setOpaque(false);
        panel0.setOpaque(false);
      
        add(panel0);
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);

        //pack();
        setVisible(true);
    }  
    
    private class FloginButtonEvent implements ActionListener {
        public void actionPerformed(ActionEvent e){
            
            try{
                File f2 =new File("userinfo.txt");
                Scanner f = new Scanner(f2);
                
                while (f.hasNext())
                {  
                    
                    String s=userTextField.getText(); 
                    String p=passTextField.getText();
                    String str = f.nextLine();
                    user=Register.userr;
                    
                    if((str.contains(s))&& (str.contains(p))){ 
                        new BusinessMenu(); 
                        break; 
                    } 
                    
                    else{
                        JOptionPane.showMessageDialog(null, "Please try again");
                        break;
                    }
                }
                
                f.close();
            } 
            catch (FileNotFoundException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private class RegisterButtonEvent implements ActionListener {
        public void actionPerformed(ActionEvent e){
            new Register().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }

    
}