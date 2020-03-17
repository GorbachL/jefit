package steps;

import io.qameta.allure.Step;
import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage();
    }

    @Step("Login using userName '{userName}' and password '{password}'")
    public LoginSteps login(String userName, String password) {
        loginPage
                .openPage()
                .login(userName, password);
        return this;
    }
}
