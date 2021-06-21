package BusinessLogic;

import GUI.MainPanel;
import model.CurrencySet;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.regex.Pattern;

public class Calculator {
    private CurrencySet currencySet = new CurrencySet();

    public void setCourse(MainPanel panel){
        panel.getInputValues().setKey(panel.getInputValues().getYourCurrency()+"to"+panel.getInputValues().getTargetCurrency());
        if(panel.getInputValues().isBuyOrSell()){
            panel.getCourseLabel().setText(String.valueOf(currencySet.getBuyCourseList().get(panel.getInputValues().getKey())));
        }
        else panel.getCourseLabel().setText(String.valueOf(currencySet.getSellCourseList().get(panel.getInputValues().getKey())));
    }

    public void setBuyCourse(MainPanel panel){
        panel.getInputValues().setBuyOrSell(true);
        setCourse(panel);
    }

    public void setSellCourse(MainPanel panel){
        panel.getInputValues().setBuyOrSell(false);
        setCourse(panel);
    }

    public void setYourCurrency(MainPanel panel){
        panel.getInputValues().setYourCurrency(String.valueOf(panel.getCurrencies1().getSelectedItem()));
        setCourse(panel);
    }

    public void setTargetCurrency(MainPanel panel){
        panel.getInputValues().setTargetCurrency(String.valueOf(panel.getCurrencies2().getSelectedItem()));
        setCourse(panel);
    }

    public String calculate(MainPanel panel){
        BigDecimal result = new BigDecimal("0");
        Pattern costPattern = Pattern.compile("[0-9]{0,9}\\.?[0-9]{0,2}");
        if(costPattern.matcher(panel.getTextField().getText()).matches()){
            panel.getInputValues().setAmount(new BigDecimal(panel.getTextField().getText()));
            if(panel.getInputValues().isBuyOrSell()){
                result = panel.getInputValues().getAmount().multiply(currencySet.getBuyCourseList().get(panel.getInputValues().getKey())).setScale(2, RoundingMode.HALF_UP);
            }
            else{
                result = panel.getInputValues().getAmount().multiply(currencySet.getSellCourseList().get(panel.getInputValues().getKey())).setScale(2, RoundingMode.HALF_UP);
            }
        }
        else JOptionPane.showMessageDialog(null,"Jeżyk! Type a number!", "Error message", JOptionPane.WARNING_MESSAGE);
        return String.valueOf(result);
    }
}
