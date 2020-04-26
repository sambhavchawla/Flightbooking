package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class RegistrationConfirmation {

    private WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'sign-in')]")
    private WebElement signin;

    public RegistrationConfirmation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<String> getAllTextFields() {
        List<WebElement> textElements = driver.findElements(By.xpath("//*[contains(@face,\'Arial, Helvetica, sans-seri\')]"));
        return textElements.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public  <T> T navigateToLoginPage(Class<T> expectedPage) {
        signin.click();
        return PageFactory.initElements(driver, expectedPage);
    }
}
