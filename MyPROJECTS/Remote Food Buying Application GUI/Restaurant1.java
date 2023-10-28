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

public class Restaurant1 extends JFrame {
    private JPanel panel = new JPanel();
    
    private JPanel mainCourseP ;
    private JCheckBox bolognese;
    private JCheckBox fettucinialfredo;
    private JCheckBox gnocchi;
    private JCheckBox margPizza;
    private JCheckBox burrataPizza;
    private JCheckBox salmon;
    private JCheckBox risotto;
    
    private JPanel appetizerP; 
    private JCheckBox salad1;
    private JCheckBox salad2;
    private JCheckBox app1;
    private JCheckBox app2;
    private JCheckBox fries;
    private JCheckBox fries1;
    
    private JPanel drinks;
    private JCheckBox drink1;
    private JCheckBox drink2;
    private JCheckBox drink3;
    private JCheckBox drink4;
    
    private JPanel rNBanner; 
    private JPanel buttonPanel; 
    private JButton checkOutButton; 
    private JButton exitButton;
    private JButton backButton;
    
    private JPanel recieptpanel;
    private JTextArea textarea;
    
    
    
    public Restaurant1(){
        setTitle("Piatto");
        
        setSize(1200,430);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setContentPane(new JLabel (new ImageIcon("C:\\Users\\drmga\\OneDrive\\Desktop\\Rogayah\\pngtree-light-blue-cute-striped-baby-blue-background-picture-image_1348681.jpg")));

        
        setLayout(new BorderLayout(7,7));
        
        buildPanel();
        
        setLocationRelativeTo(null);
        
        setVisible(true);
    }
    
    private void buildPanel (){
        mainCourseP = new JPanel();
        appetizerP = new JPanel();
        drinks = new JPanel();
        rNBanner = new JPanel();
        
        //Menu Title
        JLabel title = new JLabel ("Menu");
        title.setFont(new Font("Serif", Font.BOLD, 21));
        rNBanner.add(title);
        
        //Appetizers Panel
        appetizerP.setLayout(new GridLayout(6, 1));
        appetizerP.setBorder(BorderFactory.createTitledBorder("Appetizers"));
        salad1 = new JCheckBox("26 SAR - Arguula Salad");
        salad2 = new JCheckBox("24 SAR - Caesar Salar");
        app1 = new JCheckBox("23 SAR - Parmesan-Crusted Mozzarella");
        app2 = new JCheckBox("23 SAR - Italian Bread & Dip");
        fries = new JCheckBox("18 SAR - Honey Roasted Sweet Potatoes");
        fries1 = new JCheckBox("18 SAR - Herb-Seasoned French Fries");
        appetizerP.add(salad1);
        appetizerP.add(salad2);
        appetizerP.add(app1);
        appetizerP.add(app2);
        appetizerP.add(fries);
        appetizerP.add(fries1);
        
        //Main Course Panel
        mainCourseP.setLayout(new GridLayout(7, 1));
        bolognese = new JCheckBox("33 SAR - Nonna's Bolognese");
        fettucinialfredo = new JCheckBox("37 SAR - Wild Mushroom & Chicken Fettucini Alfredo");
        gnocchi = new JCheckBox("33 SAR - Pesto Gnocchi");
        margPizza = new JCheckBox("27 SAR - Margharita & Pepperoni Pizza");
        burrataPizza = new JCheckBox("27 SAR - Burrata Pizza");
        salmon = new JCheckBox("37 SAR - Grilled Lemon Salmon");
        risotto = new JCheckBox("38 SAR - Seafood Risotto with Lemon");
        mainCourseP.setBorder(BorderFactory.createTitledBorder("Main Courses"));
        
        mainCourseP.add(bolognese);
        mainCourseP.add(fettucinialfredo);
        mainCourseP.add(gnocchi);
        mainCourseP.add(margPizza);
        mainCourseP.add(burrataPizza);
        mainCourseP.add(salmon);
        mainCourseP.add(risotto);
        
        //Drinks Panel
        drinks.setLayout(new GridLayout(4, 1));
        drink1 = new JCheckBox(" 7 SAR - Water");
        drink2 = new JCheckBox("13 SAR - Ice-Tea Peach");
        drink3 = new JCheckBox("12 SAR - Coca Cola");
        drink4 = new JCheckBox("13 SAR - Lemon Mint Juice");
        drinks.setBorder(BorderFactory.createTitledBorder("Drinks"));
        drinks.add(drink1);
        drinks.add(drink2); 
        drinks.add(drink3);
        drinks.add(drink4); 
        
        panel.setLayout(new BorderLayout());
        panel.add(mainCourseP, BorderLayout.WEST);
        panel.add(drinks,BorderLayout.CENTER);
         
        //Button Panel
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
        
        //Setting Opaque
        panel.setOpaque(false);
        rNBanner.setOpaque(false);
        appetizerP.setOpaque(false);
        salad1.setOpaque(false);
        salad2.setOpaque(false);
        app1.setOpaque(false);
        app2.setOpaque(false);
        fries.setOpaque(false);
        fries1.setOpaque(false);
        mainCourseP.setOpaque(false);
        bolognese.setOpaque(false);
        fettucinialfredo.setOpaque(false);
        gnocchi.setOpaque(false);
        margPizza.setOpaque(false);
        burrataPizza.setOpaque(false);
        salmon.setOpaque(false);
        risotto.setOpaque(false);
        drinks.setOpaque(false);
        drink1.setOpaque(false);
        drink2.setOpaque(false);
        drink3.setOpaque(false);
        drink4.setOpaque(false);
        buttonPanel.setOpaque(false);
        
        add(rNBanner,BorderLayout.NORTH);
        add(appetizerP,BorderLayout.WEST);
        add(panel,BorderLayout.CENTER);
        add(recieptpanel,BorderLayout.EAST);
        add(buttonPanel,BorderLayout.SOUTH);
    }
    
    private class checkoutButtonListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
         //
        recieptpanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Order Reciept", TitledBorder.CENTER, TitledBorder.TOP));
        textarea.setText("\t         Piatto Restaurant             \n\n");
        textarea.setEditable(false);
        
        double subtotal=0,tax=0.20,total=0, appetizer, maincourse, drinks;
         
        // appetizer
        if (salad1.isSelected()){
            appetizer = 26;
            subtotal+=appetizer;
            textarea.setText(textarea.getText() + "1    " + "Argula Salad\t\t" + appetizer + " \n");
        }
        if (salad2.isSelected()){
            appetizer = 24;
            subtotal+=appetizer;
            textarea.setText(textarea.getText() + "1    " + "Caesar Salar\t\t" + appetizer + " \n");
        }
        if (app1.isSelected()){
            appetizer = 23;
            subtotal+=appetizer;
            textarea.setText(textarea.getText() + "1    " + "Parmesan-Crusted Mozzarella\t" + appetizer + " \n");
        }
        if (app2.isSelected()){
            appetizer = 23;
            subtotal+=appetizer;
            textarea.setText(textarea.getText() + "1    " + "Italian Bread & Dip\t\t" + appetizer + " \n");
        }
        if (fries.isSelected()){
            appetizer = 18;
            subtotal+=appetizer;
            textarea.setText(textarea.getText() + "1    " + "Honey Roasted Sweet Potatoes\t" + appetizer + " \n");
        }
        if (fries1.isSelected()){
            appetizer = 18;
            subtotal+=appetizer;
            textarea.setText(textarea.getText() + "1    " + "Herb-Seasoned French Fries\t" + appetizer + " \n");
        }
        
        //main course
        if (bolognese.isSelected()){
            maincourse = 33;
            subtotal+=maincourse;
            textarea.setText(textarea.getText() + "1    " + "Nonna's Bolognese\t\t" + maincourse + " \n\n");
        }
        if (fettucinialfredo.isSelected()){
            maincourse = 37;
            subtotal+=maincourse;
            textarea.setText(textarea.getText() + "1    " + "Wild Mushroom & Chicken Fettucini Alfredo\t" + maincourse + " \n\n");
        }
        if (gnocchi.isSelected()){
            maincourse = 33;
            subtotal+=maincourse;
            textarea.setText(textarea.getText() + "1    " + "Pesto Gnocchi\t\t" + maincourse + " \n\n");
        }
        if (margPizza.isSelected()){
            maincourse = 27;
            subtotal+=maincourse;
            textarea.setText(textarea.getText() + "1    " + "Margharita & Pepperoni Pizza\t" + maincourse + " \n\n");
        }
        if (burrataPizza.isSelected()){
            maincourse = 27;
            subtotal+=maincourse;
            textarea.setText(textarea.getText() + "1    " + "Burrata Pizza\t\t" + maincourse + " \n\n");
        }
        if (salmon.isSelected()){
            maincourse = 37;
            subtotal+=maincourse;
            textarea.setText(textarea.getText() + "1    " + "Grilled Lemon Salmon\t\t" + maincourse + " \n\n");
        }
        if (risotto.isSelected()){
            maincourse = 38;
            subtotal+=maincourse;
            textarea.setText(textarea.getText() + "1    " + "Seafood Risotto with Lemon\t\t" + maincourse + " \n\n");
        }
        
        //drink
         if (drink1.isSelected()){
            drinks = 7;
            subtotal+=drinks;
            textarea.setText(textarea.getText() + "1    " + "Water\t\t" + drinks + " \n\n");
        }
        if (drink2.isSelected()){
            drinks = 13;
            subtotal+=drinks;
            textarea.setText(textarea.getText() + "1    " + "Ice-Tea Peach\t\t" + drinks + " \n\n");
        }
        if (drink3.isSelected()){
            drinks = 12;
            subtotal+=drinks;
            textarea.setText(textarea.getText() + "1    " + "Coca Cola\t\t\t" + drinks + " \n\n");
        }
        if (drink4.isSelected()){
            drinks = 13;
            subtotal+=drinks;
            textarea.setText(textarea.getText() + "1    " + "Lemon Mint Juice\t\t" + drinks + " \n\n");
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
        new Restaurant1();
    }
}