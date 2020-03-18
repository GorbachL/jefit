package pages;


import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;
import utils.AllureUtils;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Log4j2
public class HomePage extends BasePage {

    private static final String TOOLBAR_CSS = "#navbarSupportedContent";
    private static final String MY_ROUTINES = ".leftList li > a[href*='my-routines']";
    private static final String ROUTINE_MANAGER = "a[href*='routine-manager']";
    private static final String CREATE_NEW_ROUTINE_BUTTON = "a[href*='action=create']";
    private static final String SAVE_BUTTON = "[name=Submit]";
    private static final String ROUTINE_NAME_INPUT = "[name=rpname]";
    private static final String ROUTINE_DESCRIPTION = "[name=rptext]";
    private static final String ROUTINE_TAGS = "[name=rtags]";
    private static final String EDIT_ROUTINE = "a[href*='action=edit']";
    private static final String STATUS_INPUT = "#statusinputbox";
    private static final String STATUS_POST = "[value=Post]";


    public HomePage openPage() {
        isPageOpened();
        return this;
    }

    public void isPageOpened() {
        $(TOOLBAR_CSS).shouldBe(Condition.visible);
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void openMyRoutines() {
        $(MY_ROUTINES).click();
        log.info("My Routines tab should be open");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void openRoutineManagerTab() {
        $(ROUTINE_MANAGER).click();
        log.info("Routine Manager tab should be open");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void createNewRoutine() {
        $(CREATE_NEW_ROUTINE_BUTTON).click();
        AllureUtils.takeScreenshot(getWebDriver());
        $(ROUTINE_NAME_INPUT).sendKeys("Routine Name Test");
        log.info("Routine Name is added");
        $(ROUTINE_DESCRIPTION).sendKeys("Routine Description");
        log.info("Routine Description is added");
        AllureUtils.takeScreenshot(getWebDriver());
        $(ROUTINE_TAGS).sendKeys("Routine Tag");
        log.info("Routine Tag is added");
        AllureUtils.takeScreenshot(getWebDriver());
        $(SAVE_BUTTON).click();
        log.info("New Routine is saved");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void updateCreatedRoutine() {
        $(EDIT_ROUTINE).click();
        AllureUtils.takeScreenshot(getWebDriver());
        $(ROUTINE_NAME_INPUT).clear();
        $(ROUTINE_NAME_INPUT).sendKeys("Routine Name Test UPDATED");
        log.info("Routine Name is Updated");
        $(ROUTINE_DESCRIPTION).sendKeys("Routine Description UPDATED");
        log.info("Routine Description is Updated");
        AllureUtils.takeScreenshot(getWebDriver());
        $(ROUTINE_TAGS).sendKeys("Routine Tag UPDATED");
        log.info("Routine Tag is Updated");
        AllureUtils.takeScreenshot(getWebDriver());
        $(SAVE_BUTTON).click();
        log.info("Routine is UPDATED");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void updateStatus() {
        $(STATUS_INPUT).click();
        $(STATUS_INPUT).val("My Status");
        AllureUtils.takeScreenshot(getWebDriver());
        $(STATUS_POST).click();
        log.info("Status is Updated");
        AllureUtils.takeScreenshot(getWebDriver());
    }

}
