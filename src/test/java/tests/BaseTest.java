package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import steps.ExerciseSteps;
import steps.HomePageSteps;
import steps.LoginSteps;
import steps.RoutineSteps;
import utils.PropertyManager;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Listeners(TestListener.class)
public class BaseTest {

    PropertyManager prop;
    LoginSteps loginSteps;
    HomePageSteps homePageSteps;
    ExerciseSteps exerciseSteps;
    RoutineSteps routineSteps;

    @BeforeClass
    public void setupDriver() {
        Configuration.startMaximized = true;
        Configuration.timeout = 20000;
        loginSteps = new LoginSteps();
        homePageSteps = new HomePageSteps();
        exerciseSteps = new ExerciseSteps();
        routineSteps = new RoutineSteps();
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
