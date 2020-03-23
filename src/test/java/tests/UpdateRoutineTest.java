package tests;

import org.testng.annotations.Test;

public class UpdateRoutineTest extends BaseTest {

    @Test(description = "edit routine", groups = {"init"})
    public void editRoutineTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .openMyRoutinesTab();
        routineSteps
                .openRoutineManagerTab()
                .createNewRoutine()
                .updateRoutine();
    }
}
