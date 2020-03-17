package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {

    private static final String URL = "https://www.jefit.com/login/";
    private static final String USER_NAME_CSS = "#navbar_username";
    private static final String PASSWORD_CSS = "#navbar_password";
    private static final String LOGIN_BUTTON_CSS = ".loginblueButton1";

    private static final String TOOLBAR_CSS = "#navbarSupportedContent";

    public LoginPage openPage() {
        open(URL);
        isPageOpened();
        return this;
    }

    void isPageOpened() {
        $(LOGIN_BUTTON_CSS).shouldBe(Condition.visible);
    }

    public LoginPage login(String username, String password) {
        $(USER_NAME_CSS).sendKeys(username);
        $(PASSWORD_CSS).sendKeys(password);
        $(LOGIN_BUTTON_CSS).click();
        $(TOOLBAR_CSS).shouldBe(Condition.visible);
        return this;
    }
}
