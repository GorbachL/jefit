package tests;

import org.testng.annotations.Test;

public class UpdateStatusTest extends BaseTest {

    @Test(description = "edit status", groups = {"data"})
    public void updateStatusTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .postStatus()
                .updateStatus();
    }
}
