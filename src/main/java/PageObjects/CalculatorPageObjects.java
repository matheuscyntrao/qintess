package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPageObjects {

    @FindBy(id = "selectBuild")
    private WebElement selectBuild;

    @FindBy(id = "number1Field")
    private WebElement txtFirstNumber;

    @FindBy(id = "number2Field")
    private WebElement txtSecondNumber;

    @FindBy(id = "selectOperationDropdown")
    private WebElement selectOperation;

    @FindBy(id = "calculateButton")
    private WebElement btnCalculate;

    @FindBy(id = "txtAnswer")
    private WebElement txtAnswer;

    @FindBy(id = "integerSelect")
    private WebElement cboxInteger;

    @FindBy(id = "clearButton")
    private WebElement btnClear;

    public WebElement getSelectBuild() { return this.selectBuild }
    public WebElement getTxtFirstNumber() { return this.txtFirstNumber; }
    public WebElement getTxtSecondNumber() { return this.txtSecondNumber; }
    public WebElement getSelectOperation() { return this.selectOperation; }
    public WebElement getCalculateButton() { return this.btnCalculate; }
    public WebElement getTxtAnswer() { return this.txtAnswer; }
    public WebElement getCboxInteger() { return this.cboxInteger; }
    public WebElement btnClear() { return this.btnClear; }

}
