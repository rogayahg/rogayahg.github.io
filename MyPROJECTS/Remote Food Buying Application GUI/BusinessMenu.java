/*
 * 
 * Student: Dona AlThunayan - ID: 2110395
 * Student: Rogayah Garout - ID: 2112035
 * 
 */


package businessmenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BusinessMenu extends JFrame {
    private JPanel panel0;
    private JPanel panel1;
    private JLabel resturant1;
    private JLabel resturant2;
    private JLabel coffeeshop1;
    private JLabel coffeeshop2;
    private JButton resturant1b;
    private JButton resturant2b;
    private JButton coffeeshop1b;
    private JButton coffeeshop2b;
    private JMenuBar menuBar;
    private JMenu aboutUS;
    private JMenu Contact_us;
    private JMenu logout;
    private JMenuItem  about_us;
    private JMenuItem  exit;
    private JLabel contact_num;
    private JLabel email;
    private ImageIcon image_r1;
    private JPanel panel;
    private JPanel panel3;
    private JLabel t1;




    public BusinessMenu(){
        
        setTitle("GRAB AND GO APPLICATION");
        setLayout(new GridLayout(3,1));
        setSize(1500,430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\donaa\\OneDrive\\سطح المكتب\\My project (5).jpg")));
        setLayout(new GridLayout(4,1));
        menuBar =new JMenuBar();
        panel0=new JPanel();
        panel1=new JPanel();
        panel=new JPanel();
        panel3=new JPanel();
     
        aboutUS=new JMenu("About Us");
        aboutUS.setFont(new Font("serif",Font.BOLD,18));
      

        about_us=new JMenuItem("About Us");
        about_us.addActionListener(new AboutUsEvent());
        aboutUS.add(about_us);
        Contact_us=new JMenu("Contact Us");
        Contact_us.setFont(new Font("serif",Font.BOLD,18));
        contact_num=new JLabel("Contact Number:055 987 8443 ");
        email=new JLabel("Email: grabandgo@gmail.com");
        logout=new JMenu("Logout");
        logout.setFont(new Font("serif",Font.BOLD,18));
        exit=new JMenuItem("Exit");
        exit.addActionListener(new ExitEvent());
        logout.add(exit);
      
        Contact_us.add(contact_num);
        Contact_us.add(email);
        menuBar.add(aboutUS);
        menuBar.add(Contact_us);
        menuBar.add(logout);
    
        coffeeshop1 =new JLabel();
        coffeeshop1b=new JButton("Starbucks");
        coffeeshop1b.setFont(new Font("serif",Font.BOLD,18));
        coffeeshop1b.setBackground(Color.WHITE);
        coffeeshop1b.addActionListener(new coffeeshop1Event());
        coffeeshop2 =new JLabel();
        coffeeshop2b=new JButton("Dunkin Donuts");
        coffeeshop2b.setFont(new Font("serif",Font.BOLD,18));
        coffeeshop2b.addActionListener(new coffeeshop2Event());
     
        coffeeshop2b.setBackground(Color.WHITE);
        coffeeshop1b.setIcon(new ImageIcon("C:\\Users\\donaa\\OneDrive\\سطح المكتب\\starbucks-logo-web-720x540_standard (2).jpg"));
        coffeeshop2b.setIcon(new ImageIcon("C:\\Users\\donaa\\OneDrive\\سطح المكتب\\dunkin_donuts_logo.jpg"));
        coffeeshop1b.setOpaque(false);
        coffeeshop2b.setOpaque(false);

        resturant1 =new JLabel();
        resturant1b=new JButton("Section-b");
        resturant1b.setFont(new Font("serif",Font.BOLD,18));
        resturant1b.setBackground(Color.WHITE);
        resturant1b.addActionListener(new Restaurant1Event());
        resturant2 =new JLabel();
        resturant2b=new JButton("Piatto");
        resturant2b.setFont(new Font("serif",Font.BOLD,18));
        resturant2b.setBackground(Color.WHITE);
        resturant2b.addActionListener(new Restaurant2Event());

       resturant1b.setIcon(new ImageIcon("C:\\Users\\donaa\\OneDrive\\سطح المكتب\\section-b (3).jpg"));
       resturant2b.setIcon(new ImageIcon("C:\\Users\\donaa\\OneDrive\\سطح المكتب\\piatto (1).jpg"));
       resturant1b.setOpaque(false);
       resturant2b.setOpaque(false);
       panel0.setLayout(new GridLayout(1,1));
       panel0.add(coffeeshop1);
       panel0.add(coffeeshop1b);
       panel0.add(coffeeshop2 );
       panel0.add(coffeeshop2b);
       panel0.setBorder(BorderFactory.createTitledBorder("Coffee Shops"));
       panel1.setLayout(new GridLayout(1,1));
     
       panel1.add(resturant1);
       panel1.add(resturant1b);
       panel1.add(resturant2);
       panel1.add(resturant2b);
       panel0.setOpaque(false);
       panel1.setOpaque(false);
       panel.add(panel0);
       panel.add(panel1);
       panel.setOpaque(false);
     
    
       panel1.setBorder(BorderFactory.createTitledBorder("Restaurants"));
       menuBar.setOpaque(false);
       add(menuBar,BorderLayout.NORTH);
       add(panel0);
       add(panel1);
     
       setVisible(true);
    //pack();
    }
    
     public static void main(String[] args) {
        new BusinessMenu();
    }
     
     private class ExitEvent implements ActionListener {
          public void actionPerformed(ActionEvent e){
              System.exit(0);
          }
      }
      
     private class AboutUsEvent implements ActionListener {
          public void actionPerformed(ActionEvent e){
       
   JOptionPane.showMessageDialog(null, "For saving your time , and best service order your delicious meals and refreshing drinks via Grab and Go\n"
            +"that is in collaboration with the best restaurants and coffee shops in KSA\n"
           + "No more worries about wasting your time while witing for long line to get your orde");
          
          }
     }
     
      private class coffeeshop1Event implements ActionListener {
          public void actionPerformed(ActionEvent e){
              new Cafe1().setVisible(true);
          }
      }
      
      private class coffeeshop2Event implements ActionListener {
          public void actionPerformed(ActionEvent e){
              new Cafe2().setVisible(true);
          }
      }
      
     private class Restaurant1Event implements ActionListener {
         public void actionPerformed(ActionEvent e){
             new Restaurant1().setVisible(true);
         }
     }
     
      private class Restaurant2Event implements ActionListener {
          public void actionPerformed(ActionEvent e){
              new Restaurant2().setVisible(true);
          }
      }
    
}
