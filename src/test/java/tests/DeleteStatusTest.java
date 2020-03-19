package tests;

import org.testng.annotations.Test;

public class DeleteStatusTest extends BaseTest {

    @Test
    public void deleteStatusTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .postStatus()
                .deleteStatus();
    }
}
