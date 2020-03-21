package tests;

import org.testng.annotations.Test;

public class DeleteCommentTest extends BaseTest {

    @Test
    public void deleteCommentTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .postStatus()
                .addComment()
                .deleteComment();
    }
}
