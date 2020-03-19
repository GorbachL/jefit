package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

    @Step("Update Status")
    public void updateStatus() {
        String status = "My Status UPDATED";
        homePage
                .updateStatus(status);
    }

    @Step("Delete Status")
    public void deleteStatus() {
        homePage
                .deleteStatus();
    }

    @Step("Add comment")
    public void addComment() {
        String comment = "My Comment";
        homePage
                .addCommentToStatus(comment);
    }
}
