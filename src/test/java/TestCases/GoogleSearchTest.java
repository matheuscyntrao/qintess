package TestCases;

import Driver.Driver;
import Tasks.GoogleHomeTasks;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchTest {

    WebDriver driver;
    GoogleHomeTasks googleHomeTasks;

    @Before
    public void init() throws InterruptedException {
        this.driver = Driver.ChromeDriverWindows32();
        this.driver.get("https://www.google.com.br");
        this.googleHomeTasks = new GoogleHomeTasks(this.driver);
    }

    @Test
    public void SearchForSometing() throws InterruptedException {
        this.googleHomeTasks.doSearch("qintess");
        Assert.assertTrue(driver.findElement(By.id("some_id")).isDisplayed());
    }

    @After
    public void tearDown() {
        this.driver.close();
        // TODO: Implementar metodo de gravação de execução para cenários críticos
        // TODO: Implementar paralelismo de execução Runnable
        // TODO: Implementar possiblidade de execução via Cucumber
    }
}
