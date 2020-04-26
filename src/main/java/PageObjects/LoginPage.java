package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    @FindBy(name = "userName")
    private WebElement userName;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(name = "login")
    private WebElement login;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

  public void login(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.login.click();
    }
}
