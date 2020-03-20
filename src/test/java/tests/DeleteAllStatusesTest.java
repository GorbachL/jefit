package tests;

import org.testng.annotations.Test;

public class DeleteAllStatusesTest extends BaseTest{

    @Test(enabled = false)
    public void deleteAllStatusesTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .deleteAllStatus();
    }
}
