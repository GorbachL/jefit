package tests;

import org.testng.annotations.Test;

public class CreateNewRoutineTest extends BaseTest {

    @Test(description = "New Routine", groups = {"init"})
    public void createNewRoutineTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .openMyRoutinesTab();
        routineSteps
                .openRoutineManagerTab()
                .createNewRoutine();
    }
}
