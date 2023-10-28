/*
 * 
 * Student: Dona AlThunayan - ID: 2110395
 * Student: Rogayah Garout - ID: 2112035
 * 
 */

package businessmenu;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*; 

public class Cafe1 extends JFrame {
    private JPanel panel = new JPanel();
    
    private JPanel CoffeeP ;
    private JLabel hotdrinkLabel;
    private JLabel colddrinkLabel;
    private JCheckBox hdrink1;
    private JCheckBox hdrink2;
    private JCheckBox hdrink3;
    private JCheckBox cdrink1;
    private JCheckBox cdrink2;
    private JCheckBox cdrink3;
    
    private JPanel NonCoffeeP; 
    private JCheckBox ncdrink1;
    private JCheckBox ncdrink2;
    private JCheckBox ncdrink3;
    
    private JPanel FoodP;
    private JLabel LunchLabel;
    private JLabel BreakfastLabel;
    private JCheckBox food1;
    private JCheckBox food2;
    private JCheckBox food3;
    private JCheckBox food4;
    private JCheckBox food5;
    
    private JPanel rNBanner; 
    private JPanel buttonPanel; 
    private JButton checkOutButton; 
    private JButton exitButton;
    private JButton backButton;
    
    private JPanel recieptpanel;
    private JTextArea textarea;
    
    public Cafe1(){
        setTitle("Starbucks");
        
        setSize(1570,460);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setContentPane(new JLabel (new ImageIcon("C:\\Users\\drmga\\OneDrive\\Desktop\\Rogayah\\Picture1.jpg")));

        
        setLayout(new BorderLayout(7,7));
        
        buildPanel();
        
        setLocationRelativeTo(null);
        
        setVisible(true);
    }
    
    private void buildPanel (){
        CoffeeP = new JPanel();
        NonCoffeeP = new JPanel();
        FoodP = new JPanel();
        rNBanner = new JPanel();
        
        //Menu Title
        JLabel title = new JLabel ("Menu");
        title.setFont(new Font("Sans_Serif", Font.BOLD, 21));
        rNBanner.add(title);
        
        //Coffee Panel
        CoffeeP.setLayout(new GridLayout(4, 2));
        
        hotdrinkLabel = new JLabel("Hot Coffee");
        hotdrinkLabel.setFont(new Font("Serif", Font.BOLD, 17));
        hotdrinkLabel.setForeground(Color.red);
        
        colddrinkLabel = new JLabel("Cold Coffee");
        colddrinkLabel.setFont(new Font("Serif", Font.BOLD, 17));
        colddrinkLabel.setForeground(Color.red);
        
        
        hdrink1 = new JCheckBox("17 SAR - Capucinno");
        hdrink2 = new JCheckBox("15 SAR - Flat White");
        hdrink3 = new JCheckBox("17 SAR - Cortado");
        cdrink1 = new JCheckBox("19 SAR - Cold Brew");
        cdrink2 = new JCheckBox("19 SAR - Iced Latte"); 
        cdrink3 = new JCheckBox("21 SAR - Classic Double Shot Ice-Shaken");
        CoffeeP.setBorder(BorderFactory.createTitledBorder("Coffee Selection"));
        
        CoffeeP.add(hotdrinkLabel);
        CoffeeP.add(colddrinkLabel);
        CoffeeP.add(hdrink1);
        CoffeeP.add(cdrink1);
        CoffeeP.add(hdrink2);
        CoffeeP.add(cdrink2);
        CoffeeP.add(hdrink3);
        CoffeeP.add(cdrink3);
        
        
        
        //NonCoffee Panel
        NonCoffeeP.setLayout(new GridLayout(4, 1));
        ncdrink1 = new JCheckBox("17 SAR - Earl Grey Tea");
        ncdrink2 = new JCheckBox("19 SAR - Matcha Latte");
        ncdrink3 = new JCheckBox("15 SAR - Iced Chocolate");
        
        NonCoffeeP.setBorder(BorderFactory.createTitledBorder("NonCoffee Selections"));
        NonCoffeeP.add(ncdrink1);
        NonCoffeeP.add(ncdrink2);
        NonCoffeeP.add(ncdrink3);
        
        //Food SeLECTIOM
        FoodP.setLayout(new GridLayout(5, 2));
        
        LunchLabel = new JLabel("Lunch");
        LunchLabel.setFont(new Font("Serif", Font.BOLD, 17));
        LunchLabel.setForeground(Color.red);
        
        BreakfastLabel = new JLabel("Breakfast");
        BreakfastLabel.setFont(new Font("Serif", Font.BOLD, 17));
        BreakfastLabel.setForeground(Color.red);
        
        food1 = new JCheckBox("19 SAR - Blueberrry Muffin");
        food2 = new JCheckBox("26 SAR - Cheese & Turkey Sandwich");
        food3 = new JCheckBox("20 SAR - English Cake");
        food4 = new JCheckBox("21 SAR - Ricotta Salad");
        food5 = new JCheckBox("25 SAR - Breakfast Bagel");
        FoodP.setBorder(BorderFactory.createTitledBorder("Food Selection"));
        
        FoodP.add(BreakfastLabel);
        FoodP.add(LunchLabel);
        FoodP.add(food1);
        FoodP.add(food2); 
        FoodP.add(food3);
        FoodP.add(food4); 
        FoodP.add(food5);
        
        panel.setLayout(new BorderLayout());
        panel.add(NonCoffeeP, BorderLayout.CENTER);
        panel.add(FoodP,BorderLayout.WEST);
        
        
        // Button Panel 
        buttonPanel = new JPanel();
        checkOutButton = new JButton("Calculate");
        exitButton = new JButton ("Exit");
        backButton = new JButton("Return ⏎");
        checkOutButton.setBackground(Color.WHITE);
        exitButton.setBackground(Color.WHITE);
        backButton.setBackground(Color.WHITE);
        
        buttonPanel.add(backButton);
        buttonPanel.add(checkOutButton);
        buttonPanel.add(exitButton);
        
        backButton.addActionListener(new gobackButtonListener());
        checkOutButton.addActionListener(new checkoutButtonListener());
        exitButton.addActionListener(new exitButtonListener());
        
       //Reciept
        recieptpanel = new JPanel();
        recieptpanel.setLayout(new GridLayout());
        textarea = new JTextArea(); 
        
        
        
        textarea.setEditable(false);
        recieptpanel.add(textarea);
        
        //Set Opaque
        panel.setOpaque(false);
        rNBanner.setOpaque(false);
        CoffeeP.setOpaque(false);
        hdrink1.setOpaque(false);
        hdrink2.setOpaque(false);
        hdrink3.setOpaque(false);
        cdrink1.setOpaque(false);
        cdrink2.setOpaque(false);
        cdrink3.setOpaque(false);
        NonCoffeeP.setOpaque(false);
        ncdrink1.setOpaque(false);
        ncdrink2.setOpaque(false);
        ncdrink3.setOpaque(false);
        FoodP.setOpaque(false);
        food1.setOpaque(false);
        food2.setOpaque(false);
        food3.setOpaque(false);
        food4.setOpaque(false);
        food5.setOpaque(false);
        buttonPanel.setOpaque(false);
        
        //Adding contents
        add(rNBanner,BorderLayout.NORTH);
        add(CoffeeP,BorderLayout.WEST);
        add(panel,BorderLayout.CENTER);
        add(recieptpanel,BorderLayout.EAST);
        add(buttonPanel,BorderLayout.SOUTH);
    }
    private class checkoutButtonListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
         //
        recieptpanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Order Reciept", TitledBorder.CENTER, TitledBorder.TOP));
        textarea.setText(" \t             Starbucks               \n\n");
        textarea.setEditable(false);
        
        double subtotal=0,tax=0.20,total=0, selection;
         
        if (hdrink1.isSelected()){
            selection = 17;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Capucinno\t\t\t" + selection + " \n");
        }
        if (hdrink2.isSelected()){
            selection = 15;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Flat White\\tt\t" + selection + " \n");
        }
        if (hdrink2.isSelected()){
            selection = 17;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Cortado\t\t\t" + selection + " \n");
        }
        if (cdrink1.isSelected()){
            selection = 19;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Cold Brew\t\t\t" + selection + " \n");
        }
        if (cdrink2.isSelected()){
            selection = 19;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Iced Latte\t\t\t" + selection + " \n");
        }
        if (cdrink3.isSelected()){
            selection = 21;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Classic Double Shot Ice-Shaken\t" + selection + " \n");
        }
        
        //
        if (food1.isSelected()){
            selection = 19;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Blueberrry Muffin\t\t" + selection + " \n");
        }
        if (food2.isSelected()){
            selection = 26;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Cheese & Turkey Sandwich\t\t" + selection + " \n");
        }
        if (food3.isSelected()){
            selection = 20;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "English Cake\t\t" + selection + " \n");
        }
        if (food4.isSelected()){
            selection = 21;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Ricotta Saladt\t\t" + selection + " \n");
        }
        if (food5.isSelected()){
            selection = 25;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Breakfast Bagel\t\t" + selection + " \n");
        }
        
        //
        if (ncdrink1.isSelected()){
            selection = 17;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "EEarl Grey Tea\t\t" + selection + " \n");
        }
        if (ncdrink2.isSelected()){
            selection = 19;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Matcha Latte\t\t" + selection + " \n");
        }
        if (ncdrink3.isSelected()){
            selection = 15;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Iced Chocolate\t\t" + selection + " \n");
        }
        //
        total+=(subtotal+(subtotal*tax));
        
        //
        textarea.setText(textarea.getText() + "  _______________________________________________  \n\n"
                        + "Subtotal:\t\t\t" + subtotal + "\n"
                        + "Tax:\t\t\t" + tax + " \n"
                        + "Total:\t\t\t" + total + "  \n");
    }
    }
    
    private class exitButtonListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    
    private class gobackButtonListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            new BusinessMenu().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Cafe1();
    }
}
