package pages;

import com.codeborne.selenide.Condition;
import lombok.extern.log4j.Log4j2;
import utils.AllureUtils;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Log4j2
public class RoutinePage extends BasePage {


    private static final String ROUTINE_MANAGER = ".nav-item > a[href*='routine-manager']";
    private static final String CREATE_NEW_ROUTINE_BUTTON = "a[href*='action=create']";
    private static final String SET_AS_CURRENT_BUTTON = "a[href*='action=setcurrent']";
    private static final String SAVE_BUTTON = "[name=Submit]";
    private static final String ROUTINE_NAME_INPUT = "[name=rpname]";
    private static final String ROUTINE_DESCRIPTION = "[name=rptext]";
    private static final String ROUTINE_TAGS = "[name=rtags]";
    private static final String EDIT = "a[href*='action=edit']";
    private static final String COOKIALERT = ".btn.btn-primary.btn-sm.acceptcookies";
    private static final String STATUS_INPUT = "#statusinputbox";

    public RoutinePage openPage() {
        isPageOpened();
        return this;
    }

    void isPageOpened() {
        $(ROUTINE_MANAGER).shouldBe(Condition.visible);
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
        $(ROUTINE_NAME_INPUT).val("Routine First Test");
        log.info("Routine Name is added");
        $(ROUTINE_DESCRIPTION).val("Routine First Description");
        log.info("Routine Description is added");
        AllureUtils.takeScreenshot(getWebDriver());
        $(ROUTINE_TAGS).val("Routine First Tag");
        log.info("Routine Tag is added");
        AllureUtils.takeScreenshot(getWebDriver());
        $(SAVE_BUTTON).click();
        log.info("First new Routine is saved");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void setAsCurrentRoutine() {
        $(SET_AS_CURRENT_BUTTON).scrollTo().click();
        log.info("Selected Routine is set as current");
        $(STATUS_INPUT).shouldBe(Condition.visible);
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void updateCreatedRoutine() {
        $(EDIT).click();
        AllureUtils.takeScreenshot(getWebDriver());
        $(ROUTINE_NAME_INPUT).clear();
        $(ROUTINE_NAME_INPUT).val("Routine SECOND UPDATED Name");
        log.info("Routine Name is Updated");
        $(ROUTINE_DESCRIPTION).clear();
        $(ROUTINE_DESCRIPTION).val("Routine SECOND UPDATED Description");
        log.info("Routine Description is Updated");
        AllureUtils.takeScreenshot(getWebDriver());
        $(ROUTINE_TAGS).clear();
        $(ROUTINE_TAGS).val("Routine SECOND UPDATED Tag");
        log.info("Routine Tag is Updated");
        AllureUtils.takeScreenshot(getWebDriver());
        $(SAVE_BUTTON).click();
        log.info("Routine is UPDATED");
        AllureUtils.takeScreenshot(getWebDriver());
    }
}
