package tests;

import org.testng.annotations.Test;

public class DeleteStatusTest extends BaseTest {

    @Test(enabled = false)
    public void deleteStatusTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .postStatus()
                .deleteStatus();
    }
}
