package steps;

import io.qameta.allure.Step;
import pages.HomePage;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        homePage = new HomePage();
    }

    @Step("Open Home Page")
    public HomePageSteps verifyHomePageIsOpen() {
        homePage
                .openPage();
        return this;
    }

    @Step("Open My Routines")
    public HomePageSteps openMyRoutinesTab() {
        homePage
                .openMyRoutines();
        return this;
    }

    @Step("Open Routine Manager")
    public HomePageSteps openRoutineManagerTab() {
        homePage
                .openRoutineManagerTab();
        return this;
    }

    @Step("Create New Routine")
    public void createNewRoutine() {
        homePage
                .createNewRoutine();
    }

    @Step("Update Created Routine")
    public void updateRoutine() {
        homePage
                .updateCreatedRoutine();
    }

    @Step("Post Status")
    public HomePageSteps postStatus() {
        String status = "My Status";
        homePage
                .postStatus(status);
        return this;
    }

    @Step("Set Current Routine")
    public HomePageSteps setAsCurrent() {
        homePage
                .setAsCurrentRoutine();
        return this;
    }

    @Step("Update Status")
    public void updateStatus() {
        String status = "My Status UPDATED";
        homePage
                .updateStatus(status);
    }

    @Step("Open My Custom Exercises")
    public HomePageSteps openMyCustomExercises() {
        homePage
                .openMyExercises();
        return this;
    }

    @Step("Create Custom Exercise")
    public HomePageSteps createCustomExercise() {
        String exerciseName = "My Exercise";
        homePage
                .createMyCustomExercise(exerciseName);
        return this;
    }

    @Step("Edit Custom Exercise")
    public void editCustomExercise() {
        String exerciseName = "Edited Exercise";
        homePage
                .editMyCustomExercise(exerciseName);
    }

    @Step("Delete Status")
    public void deleteStatus() {
        homePage
                .deleteStatus();
    }

    @Step("Delete All Statuses")
    public void deleteAllStatus() {
        homePage
                .deleteAllStatus();
    }

    @Step("Add comment")
    public void addComment() {
        String comment = "My Comment";
        homePage
                .addCommentToStatus(comment);
    }
}
