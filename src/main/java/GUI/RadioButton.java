package GUI;

import javax.swing.*;

public class RadioButton extends ButtonGroup {
JRadioButton buyButton = new JRadioButton("buy");
JRadioButton saleButton = new JRadioButton("sale");

    public RadioButton(){
        buyButton.setFocusable(false);
        saleButton.setFocusable(false);

//        buyButton.setBounds(0,0,0,0);
//        saleButton.setBounds(0,0,0,0);
        this.add(buyButton);
        this.add(saleButton);
        buyButton.setSelected(true);

    }

    public JRadioButton getBuyButton() {
        return buyButton;
    }

    public void setBuyButton(JRadioButton buyButton) {
        this.buyButton = buyButton;
    }

    public JRadioButton getSaleButton() {
        return saleButton;
    }

    public void setSaleButton(JRadioButton saleButton) {
        this.saleButton = saleButton;
    }
}
