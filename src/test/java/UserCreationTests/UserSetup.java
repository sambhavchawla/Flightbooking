package UserCreationTests;

import Driver.Driver;
import Driver.SeleniumDriver;
import PageObjects.LoginPage;
import PageObjects.Registration;
import PageObjects.RegistrationConfirmation;
import Property.PropertyReader;
import UserData.NewUser;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class UserSetup {

    protected WebDriver driver;

    protected String registrationLink = PropertyReader.getProperty("registration.link");
    protected Registration registration;
    protected RegistrationConfirmation registrationConfirmation;
    protected LoginPage loginPage;

    @Before
    public void setup() {
        driver = SeleniumDriver.getWebDriver(Driver.CHROME);
        registration = new Registration(driver);
        driver.get(registrationLink);
    }

    @After
    public void cleanUp() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    protected NewUser getFakeUserData(){
        Faker faker = new Faker();
        NewUser user = new NewUser();
        user.setFirstName(faker.name().firstName());
        user.setLastName(faker.name().lastName());
        user.setPhoneNumber(faker.phoneNumber().phoneNumber());
        user.setEmail(faker.internet().emailAddress());
        user.setAddress1(faker.address().streetAddress());
        user.setAddress2(faker.address().buildingNumber());
        user.setCity(faker.address().city());
        user.setState(faker.address().state());
        user.setPincode(faker.address().zipCode());
        user.setCountryIndex(new Random().nextInt(150));
        user.setUsername(faker.name().username());
        String password = faker.internet().password();
        user.setPassword(password);
        user.setConfirmPassword(password);
        return user;
    }
}
