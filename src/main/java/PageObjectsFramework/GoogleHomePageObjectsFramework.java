package PageObjectsFramework;

import Elements.Button;
import Elements.TextField;
import PageObjects.CalculatorPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjectsFramework {

    Button btnSearch;
    TextField txtFieldSearch;

    public GoogleHomePageObjectsFramework(WebDriver driver) {
        CalculatorPageObjects page = PageFactory.initElements(driver, CalculatorPageObjects.class);
        this.btnSearch = new Button(driver, page.getButtonSearch());
        this.txtFieldSearch = new TextField(driver, page.getTextFieldSearch());
    }

    public Button getButtonSearch() {
        return this.btnSearch;
    }

    public TextField getTextFieldSearch() { return this.txtFieldSearch; }
}
