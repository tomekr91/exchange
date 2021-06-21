package GUI;

import javax.swing.*;
import java.awt.*;

public class SubmitButton extends JButton {


    public SubmitButton(){
        this.setPreferredSize(new Dimension(100,30));
        this.setText("Calculate!");
        this.setFocusable(false);
    }


}
