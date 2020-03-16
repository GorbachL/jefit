package steps;

import pages.LoginPage;

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage();
    }

    public LoginSteps login(String userName, String password) {
        loginPage
                .openPage()
                .login(userName, password);
        return this;
    }
}
