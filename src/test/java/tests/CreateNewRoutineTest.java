package tests;

import org.testng.annotations.Test;

public class CreateNewRoutineTest extends BaseTest {

    @Test
    public void createNewRoutineTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .openMyRoutinesTab()
                .openRoutineManagerTab()
                .createNewRoutine();
    }
}
