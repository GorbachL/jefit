package tests;

import org.testng.annotations.Test;

public class UpdateStatusTest extends BaseTest {

    @Test
    public void updateStatusTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .postStatus()
                .updateStatus();
    }
}
