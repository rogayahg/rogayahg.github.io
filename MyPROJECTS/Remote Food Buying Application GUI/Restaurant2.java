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

public class Restaurant2 extends JFrame {
    private JPanel panel = new JPanel();
    
    private JPanel BurgersP ;
    private JCheckBox Bburger;
    private JCheckBox Cburger;
    private JCheckBox TripleSburger;
    private JCheckBox Aburger;
    
    private JPanel slidersP; 
    private JLabel sideLabel;
    private JLabel sliderLabel;
    private JCheckBox side1;
    private JCheckBox side2;
    private JCheckBox side3;
    private JCheckBox slider1;
    private JCheckBox slider2;
    private JCheckBox slider3;
    
    private JPanel drinkContainer;
    private JPanel drinksPanel;
    private JPanel selectedDrinksP;
    private JList drinklist;
    private JList selecteddrinklist;
    private JScrollPane scrollpanel;
    private JScrollPane scrollpane2;
    private String[] drinks = {" 7 SAR - Water", "12 SAR - Coca Cola", "15 SAR - Passion Fruit Mojito", "12 SAR - Lemon Mint", "12 SAR - Seven-Up"};
    private JButton drinksButton;
    private JPanel drinkbuttonP;
    
    private JPanel rNBanner; 
    private JPanel buttonPanel; 
    private JButton backButton; 
    private JButton checkOutButton; 
    private JButton exitButton;
    
    private JPanel recieptpanel;
    private JTextArea textarea;
    
    public Restaurant2(){
        setTitle("Section-B");
        
        setSize(1300,430);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setContentPane(new JLabel (new ImageIcon("C:\\Users\\drmga\\OneDrive\\Desktop\\Rogayah\\Picture1.jpg")));
        
        setLayout(new BorderLayout(7,7));
        
        buildPanel();
        
        setLocationRelativeTo(null);
        
        setVisible(true);
    }
    
    private void buildPanel (){
        BurgersP = new JPanel();
        slidersP = new JPanel();
        drinkContainer = new JPanel();
        rNBanner = new JPanel();
        
        //Menu Title
        JLabel title = new JLabel ("Menu");
        title.setFont(new Font("Sans_Serif", Font.BOLD, 21));
        rNBanner.add(title);
        
        //Sliders and Sides Panel
        slidersP.setLayout(new GridLayout(8, 1));
        
        sliderLabel = new JLabel("Sliders");
        sliderLabel.setFont(new Font("Serif", Font.BOLD, 17));
        sliderLabel.setForeground(Color.red);
        sideLabel = new JLabel("Sides");
        sideLabel.setFont(new Font("Serif", Font.BOLD, 17));
        sideLabel.setForeground(Color.RED);
        
        slider1 = new JCheckBox("25 SAR - Mini Angus Beef Burger");
        slider2 = new JCheckBox("23 SAR - Mini Crispy Fried Chicken Burger");
        slider3 = new JCheckBox("23 SAR - Mini Spicy Crispy Fried Chicken");
        side1 = new JCheckBox("11 SAR - French Fries with Cheese & Bacon");
        side2 = new JCheckBox("10 SAR - Sweet Potato Fries");
        side3 = new JCheckBox("10 SAR - Herb-Seasoned French Fries");
        slidersP.setBorder(BorderFactory.createTitledBorder("Sliders & Sides"));
        
        slidersP.add(sliderLabel);
        slidersP.add(slider1);
        slidersP.add(slider2);
        slidersP.add(slider3);
        slidersP.add(sideLabel);
        slidersP.add(side1);
        slidersP.add(side2);
        slidersP.add(side3);
        
        //Main Course Panel
        BurgersP.setLayout(new GridLayout(4, 1));
        Bburger = new JCheckBox("30 SAR - Angus Beef Burger");
        Cburger = new JCheckBox("27 SAR - Crispy Fried Chicken Burger");
        TripleSburger = new JCheckBox("27 SAR - Spicy Crispy Fried Chicken");
        Aburger = new JCheckBox("32 SAR - Prime Ribeye Burger");
        BurgersP.setBorder(BorderFactory.createTitledBorder("Burgers"));
        BurgersP.add(Bburger);
        BurgersP.add(Cburger);
        BurgersP.add(Aburger);
        BurgersP.add(TripleSburger);
        
        
        //Drinks Panel
        drinkContainer = new JPanel();
        drinkContainer.setLayout(new GridLayout(3,1));
        drinkContainer.setBorder(BorderFactory.createTitledBorder("Drinks"));
        
        //Drinks List
        drinksPanel = new JPanel();
        drinklist = new JList(drinks);
        
        drinklist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        drinklist.setVisibleRowCount(3);
        
        scrollpanel = new JScrollPane(drinklist);
        drinksPanel.add(scrollpanel);
        drinkContainer.add(drinksPanel);
        
        // Selected Drinks
        selectedDrinksP = new JPanel();
        selecteddrinklist = new JList();
        
        selecteddrinklist.setVisibleRowCount(3);
        
        scrollpane2 = new JScrollPane (selecteddrinklist);
        
        selectedDrinksP.add(scrollpane2);
        
        
        drinkContainer.add(selectedDrinksP);
        
        //Button
        drinkbuttonP= new JPanel();
        drinksButton = new JButton("Get Selections");
        drinkbuttonP.add(drinksButton);
        drinksButton.addActionListener( new drinkselectedButtonListener());
        drinkContainer.add(drinkbuttonP);
         
        panel.setLayout(new BorderLayout());
        panel.add(BurgersP, BorderLayout.WEST);
        panel.add(drinkContainer,BorderLayout.CENTER);
        
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
        textarea = new JTextArea(); 
        recieptpanel.setLayout(new GridLayout());
    
        recieptpanel.add(textarea);
        
        // Set Opaque
        panel.setOpaque(false);
        rNBanner.setOpaque(false);
        BurgersP.setOpaque(false);
        Bburger.setOpaque(false);
        Cburger.setOpaque(false);
        Aburger.setOpaque(false);
        TripleSburger.setOpaque(false);
        sliderLabel.setOpaque(false);
        sideLabel.setOpaque(false);
        slider1.setOpaque(false);
        slider2.setOpaque(false);
        slider3.setOpaque(false);
        side1.setOpaque(false);
        side2.setOpaque(false);
        side3.setOpaque(false);
        slidersP.setOpaque(false);
        drinksPanel.setOpaque(false);
        selectedDrinksP.setOpaque(false);
        drinkContainer.setOpaque(false);
        drinkbuttonP.setOpaque(false);
        buttonPanel.setOpaque(false);
        
        add(rNBanner,BorderLayout.NORTH);
        add(slidersP,BorderLayout.WEST);
        add(panel,BorderLayout.CENTER);
        add(recieptpanel,BorderLayout.EAST);
        add(buttonPanel,BorderLayout.SOUTH);
    }
    private class drinkselectedButtonListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            Object[] selections = drinklist.getSelectedValues();
            selecteddrinklist.setListData(selections);
        }
    }
    private class checkoutButtonListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
         //
        recieptpanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Order Reciept", TitledBorder.CENTER, TitledBorder.TOP));
        textarea.setText("\t         Section - B   Restaurant             \n\n");
        textarea.setEditable(false);
        
        double subtotal=0,tax=0.20,total=0, selection;
         
        // appetizer
        if (slider1.isSelected()){
            selection = 25;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Mini Angus Beef Burger\t\t" + selection + " \n");
        }
        if (slider2.isSelected()){
            selection = 23;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Mini Crispy Fried Chicken Burger\t" + selection + " \n");
        }
        if (slider3.isSelected()){
            selection = 23;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Mini Spicy Crispy Fried Chicken\t" + selection + " \n");
        }
        if (side1.isSelected()){
            selection = 10;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "French Fries with Cheese & Bacon\t" + selection + " \n");
        }
        if (side2.isSelected()){
            selection = 10;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Sweet Potato Fries\t\t" + selection + " \n");
        }
        if (side3.isSelected()){
            selection = 10;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Herb-Seasoned French Fries\t" + selection + " \n");
        }
        
        //main course
          if (Bburger.isSelected()){
            selection = 30;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Angus Beef Burger\t\t" + selection + " \n");
        }
        if (Cburger.isSelected()){
            selection = 27;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Crispy Fried Chicken Burger\t\t" + selection + " \n");
        }
        if (TripleSburger.isSelected()){
            selection = 27;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "Spicy Crispy Fried Chicken\t\t" + selection + " \n");
        }
        if (Aburger.isSelected()){
            selection = 32;
            subtotal+=selection;
            textarea.setText(textarea.getText() + "1    " + "rime Ribeye Burger\t\t" + selection + " \n");
        }
        //drink
         int[] drink = drinklist.getSelectedIndices();
            
            for(int i=0; i<drink.length;i++){
                if(drink[i]==0){
                    selection = 7;
                    subtotal+=selection;
                    textarea.setText(textarea.getText() + "1    " + "Water\t\t\t" + selection + " \n");
                }
                if(drink[i]==1){
                    selection = 12;
                    subtotal+=selection;
                    textarea.setText(textarea.getText() + "1    " + "Coca Cola\t\t\t" + selection + " \n");
                }
                if(drink[i]==2){
                    selection = 15;
                    subtotal+=selection;
                    textarea.setText(textarea.getText() + "1    " + "Passion Fruit Mojito\t\t" + selection + " \n");
                }
                if(drink[i]==3){
                    selection = 12;
                    subtotal+=selection;
                    textarea.setText(textarea.getText() + "1    " + "Lemon Mint\t\t\t" + selection + " \n");
                }
                if(drink[i]==4){
                    selection = 12;
                    subtotal+=selection;
                    textarea.setText(textarea.getText() + "1    " + "Seven-Up\t\t\t" + selection + " \n");
                }
                
            
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
        new Restaurant2();
    }
}

