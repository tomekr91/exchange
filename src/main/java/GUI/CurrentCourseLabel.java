package GUI;

import model.CurrencySet;
import model.InputValues;

import javax.swing.*;
import java.awt.*;

public class CurrentCourseLabel extends JLabel {
    private CurrencySet currencySet = new CurrencySet();
    private InputValues inputValues = new InputValues();

    public CurrentCourseLabel(){
        this.setPreferredSize(new Dimension(200,30));
        this.setText(String.valueOf(currencySet.getBuyCourseList().get(inputValues.getKey())));
    }

}
