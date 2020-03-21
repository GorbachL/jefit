package pages;

import com.codeborne.selenide.Condition;
import elements.MajorMuscleGroupSelect;
import elements.RecordTypeSelect;
import lombok.extern.log4j.Log4j2;
import models.Exercise;
import utils.AllureUtils;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Log4j2
public class ExercisePage extends BasePage {

    private static final String EXERCISES_NAME = "[name=newename]";
    private static final String MAJOR_MUSCLE_GROUP = "[name=selectpart]";
    private static final String RECORD_TYPE = "[name=select_recordtype]";
    private static final String SAVE_BUTTON = "[name=Submit]";
    private static final String EDIT = "a[href*='action=edit']";
    private static final String COOKIALERT = ".btn.btn-primary.btn-sm.acceptcookies";
    private static final String MY_CUSTOM_EXERCISES_LIST = "hor-minimalist_3";

    public ExercisePage openPage() {
        isPageOpened();
        return this;
    }

    public void isPageOpened() {
        $(EXERCISES_NAME).shouldBe(Condition.visible);
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void createMyCustomExercise(String exerciseName) {
        $(COOKIALERT).click();
        $(EXERCISES_NAME).val(exerciseName);
        $(MAJOR_MUSCLE_GROUP).selectOption("Back");
        $(RECORD_TYPE).selectOption("Reps Only");
        $(SAVE_BUTTON).click();
        log.info("Custom Exercise should be created");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void selectDropdownOption(Exercise exercise, String name) {
        $(COOKIALERT).click();
        $(EXERCISES_NAME).val(name);
        new MajorMuscleGroupSelect().selectMajorMuscleGroup(exercise.getMajorMuscleGroup());
        new RecordTypeSelect().selectRecordType(exercise.getRecordType());
        $(SAVE_BUTTON).click();
        log.info("New Custom Exercise should be created");
        AllureUtils.takeScreenshot(getWebDriver());
    }

    public void editMyCustomExercise(String exerciseNewName) {
        $(EDIT).click();
        $(EDIT).click();
        $(EXERCISES_NAME).val(exerciseNewName);
        $(MAJOR_MUSCLE_GROUP).selectOption("Chest");
        $(RECORD_TYPE).selectOption("Time Only");
        $(SAVE_BUTTON).click();
        log.info("Custom Exercise should be edited");
        AllureUtils.takeScreenshot(getWebDriver());
    }
}
