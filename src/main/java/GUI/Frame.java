package GUI;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private MainPanel mainPanel = new MainPanel();
    private HeadPanel headPanel = new HeadPanel();

    public Frame(){
        ImageIcon euro = new ImageIcon(getClass().getResource("/euro.png"));
        this.setIconImage(euro.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 720);
        this.setTitle("Currency Exchanger");
        this.setResizable(false);

        this.add(mainPanel, BorderLayout.CENTER);
        this.add(headPanel, BorderLayout.NORTH);
        this.setVisible(true);
    }

    public MainPanel getMainPanel() {
        return mainPanel;
    }

    public HeadPanel getHeadPanel() {
        return headPanel;
    }


}
