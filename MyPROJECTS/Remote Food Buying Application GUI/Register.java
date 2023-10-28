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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
;

public class Register extends JFrame {
    
    private JPanel panel0;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel Apanel;
    private JLabel Firstname_Label; 
    private JLabel Lastname_Label; 
    private JLabel username_Label;
    private JLabel email_Label;
    private JLabel password1_Label; 
    private JLabel Cpassword1_Label;
    private JLabel phone_Label;
    private JLabel gender_Label; 
    private JTextField FirstnameTextField; 
    private JTextField LastnameTextField; 
    private JTextField emailTextField;
    private JTextField password1TextField; 
    private JTextField Cpassword1TextField;  
    private JTextField PhoneTextField;  
    private JButton LoginButton;
    private JComboBox Jgender ;
    private JTextField usernameTextField;
    public static String userr,password;
    
    public Register(){
        setTitle("GRAB AND GO APPLICATION");
        setSize(1500,430);
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\donaa\\OneDrive\\سطح المكتب\\My project (5).jpg")));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        panel0=new JPanel();
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();
        panel5=new JPanel();
        panel6=new JPanel();
        panel7=new JPanel();
        panel8=new JPanel();
        
        String[]  gender = {"female","male"};
        Firstname_Label=new JLabel("First name:");
        Firstname_Label.setFont(new Font("serif",Font.BOLD,18));
        FirstnameTextField=new JTextField(20);
        panel0.add(Firstname_Label);
        panel0.add(FirstnameTextField);
        panel0.setOpaque(false);
        
        Lastname_Label=new JLabel("Last name:");
        Lastname_Label.setFont(new Font("serif",Font.BOLD,18));
        LastnameTextField=new JTextField(20);
        panel1.add(Lastname_Label);
        panel1.add(LastnameTextField);
        panel1.setOpaque(false);
    
        email_Label=new JLabel("Email:");
        email_Label.setFont(new Font("serif",Font.BOLD,18));
        emailTextField =new JTextField(20);
        panel2.add(email_Label);
        panel2.add(emailTextField);
        panel2.setOpaque(false);
    
        phone_Label=new JLabel("Phone.no:");
        phone_Label.setFont(new Font("serif",Font.BOLD,18));
        PhoneTextField =new JTextField(20);
        panel8.add(phone_Label);
        panel8.add(PhoneTextField);
        panel8.setOpaque(false);
    
        username_Label=new JLabel("Username:");
        username_Label.setFont(new Font("serif",Font.BOLD,18));
        usernameTextField=new JTextField(20);
        panel3.add(username_Label);
        panel3.add(usernameTextField);
        panel3.setOpaque(false);
    
        gender_Label=new JLabel("Gender:");
        gender_Label.setFont(new Font("serif",Font.BOLD,18));
        Jgender =new JComboBox(gender);
        Jgender.setFont(new Font("serif",Font.BOLD,18));
        LoginButton=new JButton("    login    ");
        LoginButton.setFont(new Font("serif",Font.BOLD,18));
        LoginButton.setBackground(Color.WHITE);
        LoginButton.addActionListener(new loginButtonEvent());
        panel4.add(gender_Label);
        panel4.add(Jgender);
        panel4.setOpaque(false);
    
        password1_Label=new JLabel("Password:");
        password1_Label.setFont(new Font("serif",Font.BOLD,18));
        password1TextField=new JTextField(20);
        Cpassword1_Label=new JLabel("Confirm Password:");
        Cpassword1_Label.setFont(new Font("serif",Font.BOLD,18));
        Cpassword1TextField =new JTextField(20);
        panel5.add(password1_Label);
        panel5.add(password1TextField);
        panel5.setOpaque(false);
        panel6.add(Cpassword1_Label);
        panel6.add(Cpassword1TextField);
        panel6.setOpaque(false);
        
        panel7.add(LoginButton);
        panel7.setOpaque(false);
        
        Apanel=new JPanel( new GridLayout(5,2));
        Apanel.add(panel0);
        Apanel.add(panel1);
        Apanel.add(panel3);
        Apanel.add(panel5);
        Apanel.add(panel2);
        Apanel.add(panel6);
        Apanel. add(panel8);
        Apanel.add(panel4);
        Apanel.setOpaque(false);

   
        add(Apanel,BorderLayout.CENTER);
        add(panel7,BorderLayout.SOUTH);
    
        setVisible(true);
       
    }
    
    
    public void Validation()throws InvalidInputException{
        
        try
        {
            if (!validateFName()) {
                throw new InvalidInputException(" first name ");
            }
    
            if (!validateLName()) {
            //only letters
                throw new InvalidInputException(" last name ");
            }
            
            if (!validatePass()) {
                throw new InvalidInputException(" password ");       
            }
            
            if (!validateEmail()) {
                throw new InvalidInputException(" email ");
            }
            
            if (!validatePhone()) {
                throw new InvalidInputException("phone");
            }
        }
        
        catch(InvalidInputException e){
         JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    
    private boolean validateFName() {
        return FirstnameTextField.getText().matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    
    private boolean validateLName() {
        return LastnameTextField.getText().matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    private boolean validatePass() {
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m= p.matcher(password1TextField.getText());
        
        return m.matches();
    }

    private boolean validateEmail() {
        return emailTextField.getText().matches("^(.+)@(.+)$");
    }

    private boolean validatePhone() {
        return PhoneTextField.getText().matches("(05)[0-9]{8}");
    }

    
    public void CreatFile() throws IOException {
        
        PrintWriter f2=new PrintWriter(new FileOutputStream("userinfo.txt",true));
        f2.println("First name : "+FirstnameTextField.getText()+"\n");
        f2.println("Last name: "+LastnameTextField.getText()+"\n");
        String user=usernameTextField.getText()+" ";
        String pass=password1TextField.getText();
        String info=user.concat(pass);
        f2.println(info+"\n"); 
        f2.println("Email: "+emailTextField.getText()+"\n");
        f2.println("phone Number: "+PhoneTextField.getText()+"\n");
        f2.println("Gender: "+(String)Jgender.getSelectedItem()+"\n");
        f2.close();
    }
    
    private class loginButtonEvent implements ActionListener {
        public void actionPerformed(ActionEvent e){
            try {
                Validation();
            } catch (InvalidInputException ex) {
                JOptionPane.showMessageDialog(null," Error ");
            }
            
            String fname=FirstnameTextField.getText();
            String lname=LastnameTextField.getText();
            userr= usernameTextField.getText();
            password =password1TextField.getText();
            String cpass=Cpassword1TextField.getText();
            String email= emailTextField.getText();
            String phone= PhoneTextField.getText();         
            
            if(!(password.equals(cpass))){
                
                JOptionPane.showMessageDialog(null,"your password and confrimation password do not match");
            }
            
            try {
                
                FileWriter f2=new FileWriter("userinfo.txt",true);
               
                f2.write("username: "+userr+"password: "+password+"\nFirst name: "+fname+"\nLast name: "+lname+"\nemail: "+email+"\nphone number: "+phone+"\n");
                f2.close();
            } catch (IOException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            new Login().setVisible(true);
        }
    }
       
     
    public static void main(String[] args) {
        new Register();
    }

}
