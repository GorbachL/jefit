package tests;

import org.testng.annotations.Test;

public class PostStatusTest extends BaseTest {

    @Test
    public void postStatusTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .postStatus();
    }
}
