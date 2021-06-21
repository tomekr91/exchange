package GUI;

import javax.swing.*;
import java.awt.*;

public class HeadPanel extends JPanel{


    public HeadPanel(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(720,180));
        this.setBackground(Color.lightGray);


        JLabel label1 = new JLabel("1. Choose your currency");
        JLabel label2 = new JLabel("2. Choose target currency");
        JLabel label3 = new JLabel("3. Choose whether you want to buy or sell");
        JLabel label4 = new JLabel("4. Type an amount to change");
        JLabel label5 = new JLabel("5. Click Calculate!");

        label1.setBounds(200,20, 500,20);
        label2.setBounds(200,50, 500,20);
        label3.setBounds(200,80, 500,20);
        label4.setBounds(200,110,500,20);
        label5.setBounds(200,140,500,20);

        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
    }
}
