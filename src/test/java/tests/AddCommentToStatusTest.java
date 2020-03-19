package tests;

import org.testng.annotations.Test;

public class AddCommentToStatusTest extends BaseTest {

    @Test
    public void addCommentToStatusTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .postStatus()
                .addComment();
    }
}
