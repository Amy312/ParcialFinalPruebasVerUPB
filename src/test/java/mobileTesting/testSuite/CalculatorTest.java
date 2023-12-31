package mobileTesting.testSuite;

import mobileTesting.activities.calculator.MainCalculator;
import mobileTesting.session.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    MainCalculator mainCalculator = new MainCalculator();
    @Test
    public void verifyAddCalculator(){
        mainCalculator.fiveButton.click();
        mainCalculator.addButton.click();
        mainCalculator.sevenButton.click();
        mainCalculator.equalButton.click();
        Assertions.assertEquals("12",mainCalculator.resultLabel.getText(),
                "ERROR la suma es incorrecta");

    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }



}