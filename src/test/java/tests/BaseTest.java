package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import steps.LoginSteps;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    LoginSteps loginSteps;

    @BeforeClass
    public void setupDriver() {
        Configuration.startMaximized = true;
        Configuration.timeout = 20000;
        loginSteps = new LoginSteps();
    }

//    @AfterMethod(alwaysRun = true)
//    public void closeBrowser() {
//        getWebDriver().quit();
//    }
}
