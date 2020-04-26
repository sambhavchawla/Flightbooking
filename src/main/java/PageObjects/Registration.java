package PageObjects;

import UserData.NewUser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration {

    private WebDriver driver;
    @FindBy(name = "firstName")
    private WebElement firstName;
    @FindBy(name = "lastName")
    private WebElement lastName;
    @FindBy(name = "phone")
    private WebElement phone;
    @FindBy(id = "userName")
    private WebElement email;
    @FindBy(name = "address1")
    private WebElement address1;
    @FindBy(name = "address2")
    private WebElement address2;

    @FindBy(name = "city")
    private WebElement city;

    @FindBy(name = "state")
    private WebElement state;

    @FindBy(name = "postalCode")
    private WebElement postalCode;
    @FindBy(name = "country")
    private WebElement country;

    @FindBy(id = "email")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;


    @FindBy(name = "register")
    private WebElement register;

    private Select getCountrySelect() {
        return new Select(country);
    }

    public Registration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void createUser(NewUser newUser){
        firstName.sendKeys(newUser.getFirstName());
        lastName.sendKeys(newUser.getLastName());
        phone.sendKeys(newUser.getPhoneNumber());
        email.sendKeys(newUser.getEmail());
        address1.sendKeys(newUser.getAddress1());
        address2.sendKeys(newUser.getAddress2());
        city.sendKeys(newUser.getCity());
        state.sendKeys(newUser.getState());
        postalCode.sendKeys(newUser.getPincode());
        getCountrySelect().selectByIndex(newUser.getCountryIndex());
        userName.sendKeys(newUser.getUsername());
        password.sendKeys(newUser.getPassword());
        confirmPassword.sendKeys(newUser.getConfirmPassword());
        register.click();
    }

    public  <T> T createUserAndNavigate(NewUser newUserInfo, Class<T> expectedPage) {
        createUser(newUserInfo);
        return PageFactory.initElements(driver, expectedPage);
    }
}
