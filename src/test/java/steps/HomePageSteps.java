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
    public HomePageSteps createNewRoutine() {
        homePage
                .createNewRoutine();
        return this;
    }

    @Step("Update Cretaed Routine")
    public HomePageSteps updateRoutine() {
        homePage
                .updateCreatedRoutine();
        return this;
    }

    @Step("Update Status")
    public HomePageSteps updateStatus() {
        homePage
                .updateStatus();
        return this;
    }
}
