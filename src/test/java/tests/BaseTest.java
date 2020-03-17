package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import steps.LoginSteps;
import utils.PropertyManager;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Listeners(TestListener.class)
public class BaseTest {

    PropertyManager prop;
    LoginSteps loginSteps;

    @BeforeClass
    public void setupDriver() {
        //Configuration.headless = true;
        Configuration.startMaximized = true;
        Configuration.timeout = 20000;
        loginSteps = new LoginSteps();
    }

    @BeforeClass
    public void loadProperties() {
        prop = new PropertyManager();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        getWebDriver().quit();
    }
}
