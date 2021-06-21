package GUI;

import javax.swing.*;

public class CurrencyComboBox extends JComboBox {
    private static String[] currencies = {"PLN", "EUR", "USD", "GBP", "CHF"};

    public CurrencyComboBox(){
        super(currencies);
    }
}
