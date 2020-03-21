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
    public void openMyRoutinesTab() {
        homePage
                .openMyRoutines();
    }

    @Step("Post Status")
    public HomePageSteps postStatus() {
        String status = "My New Status";
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

    @Step("Open My Custom Exercises")
    public void openMyCustomExercises() {
        homePage
                .openMyExercises();
    }

    @Step("Add comment")
    public HomePageSteps addComment() {
        String comment = "My Comment";
        homePage
                .addCommentToStatus(comment);
        return this;
    }

    @Step("Delete Comment")
    public void deleteComment() {
        homePage
                .deleteComment();
    }
}
