package pages;


import com.codeborne.selenide.*;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import utils.AllureUtils;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Log4j2
public class HomePage extends BasePage {

    private static final String TOOLBAR_CSS = "#navbarSupportedContent";
    private static final String MY_ROUTINES = ".leftList li > a[href*='my-routines']";
    private static final String ROUTINE_MANAGER = "a[href*='routine-manager']";
    private static final String STATUS_INPUT = "#statusinputbox";
    private static final String STATUS_POST = "[value=Post]";
    private static final String STATUS_TEXT = "#statusText";
    private static final String STATUS_DELETE = ".row .col.text-right";
    private static final String ADD_COMMENT_BUTTON = ".fa.fa-comment";
    private static final String WRITE_COMMENT_INPUT = "[name=feedcomment]";
    private static final String SEND_COMMENT_BUTTON = "[value=Send]";
    private static final String COOKIALERT = ".btn.btn-primary.btn-sm.acceptcookies";
    private static final String MY_CUSTOM_EXERCISES = ".leftList a[href*='my-exercises']";
    private static final String EXERCISES_NAME = "[name=newename]";
    private static final String COMMENT_TREE = ".threecomments";
    private static final String COMMENT_CELL = ".commentcell2";

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
        $(ROUTINE_MANAGER).shouldBe(Condition.visible);
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void openMyExercises() {
        $(MY_CUSTOM_EXERCISES).click();
        $(EXERCISES_NAME).shouldBe(Condition.visible);
        log.info("Create Custom Exercise should be open");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void postStatus(String status) {
        $(COOKIALERT).click();
        $(STATUS_INPUT).click();
        $(STATUS_INPUT).val(status);
        AllureUtils.takeScreenshot(getWebDriver());
        $(STATUS_POST).click();
        $(STATUS_TEXT).shouldBe(Condition.text(status));
        log.info("New Status is Posted");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void updateStatus(String statusUpdated) {
        $(STATUS_INPUT).click();
        $(STATUS_INPUT).val(statusUpdated);
        AllureUtils.takeScreenshot(getWebDriver());
        $(STATUS_POST).click();
        $(STATUS_TEXT).shouldBe(Condition.text(statusUpdated));
        log.info("Status is Updated");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void deleteStatus() {
        refresh();
        $(STATUS_DELETE).hover();
        $(STATUS_DELETE).click();
        refresh();
        $(COMMENT_TREE);
        log.info("Status is deleted");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void deleteAllStatuses() {
        $(COOKIALERT).click();
        if ($(STATUS_DELETE).hover().exists()) {
            do {
                $(STATUS_DELETE).click();
                refresh();
            } while ($(STATUS_DELETE).exists());
        }
        log.info("All statuses are deleted");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void addCommentToStatus(String comment) {
        refresh();
        $(ADD_COMMENT_BUTTON).click();
        $(ADD_COMMENT_BUTTON).click();
        log.info("Add comment button is clicked");
        $(WRITE_COMMENT_INPUT).scrollTo().click();
        $(WRITE_COMMENT_INPUT).val(comment);
        log.info("Comment is entered");
        $(SEND_COMMENT_BUTTON).scrollTo();
        $(SEND_COMMENT_BUTTON).click();
        log.info("Comment is sent");
        AllureUtils.takeScreenshot(getWebDriver());
    }
}
