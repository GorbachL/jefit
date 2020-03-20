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
    private static final String CREATE_NEW_ROUTINE_BUTTON = "a[href*='action=create']";
    private static final String SET_AS_CURRENT_BUTTON = "a[href*='action=setcurrent']";
    private static final String SAVE_BUTTON = "[name=Submit]";
    private static final String ROUTINE_NAME_INPUT = "[name=rpname]";
    private static final String ROUTINE_DESCRIPTION = "[name=rptext]";
    private static final String ROUTINE_TAGS = "[name=rtags]";
    private static final String EDIT = "a[href*='action=edit']";
    private static final String STATUS_INPUT = "#statusinputbox";
    private static final String STATUS_POST = "[value=Post]";
    private static final String STATUS_DELETE = ".row .col.text-right";
    private static final String ADD_COMMENT_BUTTON = ".fa.fa-comment";
    private static final String WRITE_COMMENT_INPUT = "[name=feedcomment]";
    private static final String SEND_COMMENT_BUTTON = "[value=Send]";
    private static final String COOKIALERT = ".btn.btn-primary.btn-sm.acceptcookies";
    private static final String MY_CUSTOM_EXERCISES = ".leftList a[href*='my-exercises']";
    private static final String EXERCISES_NAME = "[name=newename]";
    private static final String MAJOR_MUSCLE_GROUP = "[name=selectpart]";
    private static final String RECORD_TYPE = "[name=select_recordtype]";

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

    public void openMyExercises() {
        $(MY_CUSTOM_EXERCISES).click();
        log.info("Create Custom Exercise should be open");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void createMyCustomExercise(String exerciseName) {
        $(EXERCISES_NAME).val(exerciseName);
        $(MAJOR_MUSCLE_GROUP).selectOption("Back");
        $(RECORD_TYPE).selectOption("Reps Only");
        $(SAVE_BUTTON).click();
        log.info("Custom Exercise should be created");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void editMyCustomExercise(String exerciseNewName){
        $(EDIT).click();
        $(EDIT).click();
        $(EXERCISES_NAME).val(exerciseNewName);
        $(MAJOR_MUSCLE_GROUP).selectOption("Chest");
        $(RECORD_TYPE).selectOption("Time Only");
        $(SAVE_BUTTON).click();
        log.info("Custom Exercise should be edited");
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

    public void setAsCurrentRoutine() {
        $(SET_AS_CURRENT_BUTTON).click();
        log.info("Selected Routine is set as current");
    }

    public void updateCreatedRoutine() {
        $(EDIT).click();
        AllureUtils.takeScreenshot(getWebDriver());
        $(ROUTINE_NAME_INPUT).clear();
        $(ROUTINE_NAME_INPUT).sendKeys("Routine Name Test UPDATED");
        log.info("Routine Name is Updated");
        $(ROUTINE_DESCRIPTION).clear();
        $(ROUTINE_DESCRIPTION).sendKeys("Routine Description UPDATED");
        log.info("Routine Description is Updated");
        AllureUtils.takeScreenshot(getWebDriver());
        $(ROUTINE_TAGS).clear();
        $(ROUTINE_TAGS).sendKeys("Routine Tag UPDATED");
        log.info("Routine Tag is Updated");
        AllureUtils.takeScreenshot(getWebDriver());
        $(SAVE_BUTTON).click();
        log.info("Routine is UPDATED");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void postStatus(String status) {
        $(STATUS_INPUT).click();
        $(STATUS_INPUT).val(status);
        AllureUtils.takeScreenshot(getWebDriver());
        $(STATUS_POST).click();
        log.info("Status is Posted");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void updateStatus(String statusUpdated) {
        $(STATUS_INPUT).click();
        $(STATUS_INPUT).val(statusUpdated);
        AllureUtils.takeScreenshot(getWebDriver());
        $(STATUS_POST).click();
        log.info("Status is Updated");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void deleteStatus() {
        refresh();
        $(COOKIALERT).click();
        $(STATUS_DELETE).hover();
        $(STATUS_DELETE).click();
        log.info("Status is deleted");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void deleteAllStatus() {
        $(COOKIALERT).click();
        sleep(1000);
        if ($(STATUS_DELETE).hover().exists()) {
            do {
                $(STATUS_DELETE).click();
                sleep(1000);
                refresh();
            } while ($(STATUS_DELETE).hover().exists());
        }
        log.info("All statuses are deleted");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void addCommentToStatus(String comment) {
        refresh();
        $(COOKIALERT).click();
        sleep(1000);
        $(ADD_COMMENT_BUTTON).scrollTo();
        $(ADD_COMMENT_BUTTON).click();
        $(ADD_COMMENT_BUTTON).click();
        log.info("Add comment button is clicked");
        $(WRITE_COMMENT_INPUT).scrollTo().click();
        $(WRITE_COMMENT_INPUT).val(comment);
        log.info("Comment is entered");
        $(SEND_COMMENT_BUTTON).scrollTo();
        $(SEND_COMMENT_BUTTON).click();
        log.info("Comment is sent");
        $(ADD_COMMENT_BUTTON).click();
        AllureUtils.takeScreenshot(getWebDriver());
    }


}
