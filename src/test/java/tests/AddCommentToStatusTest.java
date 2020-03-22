package tests;

import org.testng.annotations.Test;

public class AddCommentToStatusTest extends BaseTest {

    @Test(groups = {"regression"})
    public void addCommentToStatusTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .postStatus()
                .addComment();
    }
}
