package pages;


import com.codeborne.selenide.*;
import lombok.extern.log4j.Log4j2;
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
    private static final String COMMENT_DELETE = ".commentcell.row.mx-0 .commentcell2.col-10.pl-1";
    private static final String ADD_COMMENT_BUTTON = ".fa.fa-comment";
    private static final String WRITE_COMMENT_INPUT = "[name=feedcomment]";
    private static final String SEND_COMMENT_BUTTON = "[value=Send]";
    private static final String COOKIALERT = ".btn.btn-primary.btn-sm.acceptcookies";
    private static final String MY_CUSTOM_EXERCISES = ".leftList a[href*='my-exercises']";
    private static final String EXERCISES_NAME = "[name=newename]";
    private static final String COMMENT_TREE = ".threecomments";
    private static final String COMMENT_CELL = ".commentcell.row.mx-0 .commentcell2.col-10.pl-1";

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
        refresh();
        $(ADD_COMMENT_BUTTON).scrollTo().click();
        $(ADD_COMMENT_BUTTON).click();
        log.info("comment button");
        $(WRITE_COMMENT_INPUT).val("comment");
        log.info("Comment");
        $(SEND_COMMENT_BUTTON).scrollTo().click();
        log.info("send");
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

    public void addCommentToStatus(String comment) {
        refresh();
        int countOfComment = $(COMMENT_TREE).$$(COMMENT_CELL).size();
        $(ADD_COMMENT_BUTTON).scrollTo().click();
        //$(ADD_COMMENT_BUTTON).click();
        log.info("Add comment button is clicked");
        AllureUtils.takeScreenshot(getWebDriver());
        $(WRITE_COMMENT_INPUT).scrollTo().click();
        $(WRITE_COMMENT_INPUT).val(comment);
        log.info("Comment is entered");
        AllureUtils.takeScreenshot(getWebDriver());
        $(SEND_COMMENT_BUTTON).scrollTo().click();
        //$(SEND_COMMENT_BUTTON).click();
        $(COMMENT_TREE).$$(COMMENT_CELL).shouldHaveSize(countOfComment);
        log.info("Comment is sent");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void deleteComment() {
        refresh();
        int countOfComment = $$(COMMENT_CELL).size();
        AllureUtils.takeScreenshot(getWebDriver());
        $(COMMENT_CELL).scrollTo().hover();
        $(COMMENT_CELL).hover();
        $(COMMENT_DELETE).hover().click();
        AllureUtils.takeScreenshot(getWebDriver());
        refresh();
        $$(COMMENT_CELL).shouldHaveSize(countOfComment);
        log.info("Comment is deleted");
        AllureUtils.takeScreenshot(getWebDriver());
    }
}
