package tests;

import models.Exercise;
import org.testng.annotations.Test;

public class CreateExerciseUsingBuilderTest extends BaseTest {

    @Test
    public void createExerciseUsingBuilder() {
        Exercise exercise = Exercise.builder()
                .majorMuscleGroup("6")
                .recordType("4")
                .build();

        loginSteps
                .login(prop.get("username"), prop.get("password"));
        homePageSteps
                .verifyHomePageIsOpen()
                .openMyCustomExercises();
        exerciseSteps
                .createCustomExerciseUsingDropdownOption(exercise, "My Second Exercise");
    }
}
