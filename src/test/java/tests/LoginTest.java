package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void logIn() {
        loginSteps
                .login("lenagmailinator", "qwerty12345");
    }
}
