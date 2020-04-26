package UserCreationTests;

import PageObjects.LoginPage;
import PageObjects.RegistrationConfirmation;
import UserData.NewUser;
import static org.junit.Assert.*;
import org.junit.Test;

public class RegistrationTest extends UserSetup {

    @Test
    public void singleUserCreationTest() {
        NewUser newUserInfo = getFakeUserData();
        registrationConfirmation = registration.createUserAndNavigate(newUserInfo, RegistrationConfirmation.class);
        assertTrue(registrationConfirmation.getAllTextFields().contains("Dear "+newUserInfo.getFirstName()+" "+newUserInfo.getLastName()+","));
        assertTrue(registrationConfirmation.getAllTextFields().contains("Note: Your user name is "+newUserInfo.getUsername()+"."));
        loginPage = registrationConfirmation.navigateToLoginPage(LoginPage.class);
        loginPage.login(newUserInfo.getUsername(),newUserInfo.getPassword());
    }



}
