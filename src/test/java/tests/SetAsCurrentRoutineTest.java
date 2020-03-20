package tests;

import org.testng.annotations.Test;

public class SetAsCurrentRoutineTest extends BaseTest {

    @Test
    public void setAsCurrentRoutineTest() {
        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .openMyRoutinesTab()
                .openRoutineManagerTab()
                .createNewRoutine();
    }
}
