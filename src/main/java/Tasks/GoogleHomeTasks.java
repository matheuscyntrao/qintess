package Tasks;

import PageObjectsFramework.GoogleHomePageObjectsFramework;
import org.openqa.selenium.WebDriver;

public class GoogleHomeTasks {

    WebDriver driver;
    GoogleHomePageObjectsFramework googleHomePageObjectsFramework;

    public GoogleHomeTasks(WebDriver driver) {
        this.driver = driver;
        this.googleHomePageObjectsFramework = new GoogleHomePageObjectsFramework(this.driver);
    }

    public void doSearch(String textSearch) throws InterruptedException {
        this.googleHomePageObjectsFramework.getTextFieldSearch().sendKeys(textSearch);
        this.googleHomePageObjectsFramework.getButtonSearch().click();
    }

}
