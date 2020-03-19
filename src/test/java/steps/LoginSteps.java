package steps;

import io.qameta.allure.Step;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage();
    }

    @Step("Login using userName '{userName}' and password '{password}'")
    public HomePage login(String userName, String password) {
        loginPage
                .openPage()
                .login(userName, password);
        return new HomePage();
    }
}
