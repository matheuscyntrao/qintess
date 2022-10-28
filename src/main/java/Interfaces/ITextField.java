package Interfaces;

public interface ITextField {

    //TODO: Implementar explici wait para cada tipo de WebElement do framework
    void sendKeys(CharSequence keysToSend);

    String getText();

    boolean isDisplayed();

    boolean isReadOnly();

    String getAttribute(String propertyName);
}
