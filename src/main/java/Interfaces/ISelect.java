package Interfaces;

public interface ISelect {

    //TODO: Implementar explici wait para cada tipo de WebElement do framework
    void sendKeys(CharSequence keysToSend);

    void click();

    boolean isDisplayed();

    boolean selectOption(String option) throws InterruptedException;

}
