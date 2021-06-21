package GUI;

import BusinessLogic.Calculator;
import model.CurrencySet;
import model.InputValues;

import javax.swing.*;

public class MainPanel extends JPanel {
    private CurrencyComboBox currencies1 = new CurrencyComboBox();
    private CurrencyComboBox currencies2 = new CurrencyComboBox();
    private MyTextField textField = new MyTextField();
    private RadioButton radioButton = new RadioButton();
    private CurrentCourseLabel courseLabel = new CurrentCourseLabel();
    private InputValues inputValues = new InputValues();
    private SubmitButton button = new SubmitButton();
    private ResultLabel resultLabel = new ResultLabel();
    private CurrencySet currencySet = new CurrencySet();
    private Calculator calculator = new Calculator();

    public MainPanel(){
        //this.setLayout(null);

        currencies1.addActionListener(e -> calculator.setYourCurrency(this));

        currencies2.addActionListener(e -> calculator.setTargetCurrency(this));

        radioButton.buyButton.addActionListener(e -> calculator.setBuyCourse(this));

        radioButton.saleButton.addActionListener(e -> calculator.setSellCourse(this));

        button.addActionListener(e -> resultLabel.setText(calculator.calculate(this)));

        this.add(currencies1);
        this.add(currencies2);
        this.add(radioButton.getBuyButton());
        this.add(radioButton.getSaleButton());
        this.add(textField);
        this.add(courseLabel);
        this.add(button);
        this.add(resultLabel);

    }

    public CurrencyComboBox getCurrencies1() {
        return currencies1;
    }

    public CurrencyComboBox getCurrencies2() {
        return currencies2;
    }

    public MyTextField getTextField() {
        return textField;
    }

    public RadioButton getRadioButton() {
        return radioButton;
    }

    public CurrentCourseLabel getCourseLabel() {
        return courseLabel;
    }

    public InputValues getInputValues() {
        return inputValues;
    }
}
