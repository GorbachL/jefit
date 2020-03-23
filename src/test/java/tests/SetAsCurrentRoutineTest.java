package tests;

import org.testng.annotations.Test;

public class SetAsCurrentRoutineTest extends BaseTest {

    @Test(description = "setAsCurrent", groups = {"init"})
    public void setAsCurrentRoutineTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .openMyRoutinesTab();
        routineSteps
                .openRoutineManagerTab()
                .createNewRoutine()
                .setAsCurrent();
    }
}
