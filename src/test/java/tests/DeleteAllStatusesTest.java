package tests;

import org.testng.annotations.Test;

public class DeleteAllStatusesTest extends BaseTest {

    @Test
    public void deleteAllStatusesTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .deleteAllStatuses();
    }
}
