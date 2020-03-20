package steps;

import io.qameta.allure.Step;
import models.Exercise;
import pages.ExercisePage;

public class ExerciseSteps {

    private ExercisePage exercisePage;

    public ExerciseSteps() {
        exercisePage = new ExercisePage();
    }

    @Step("Open Exercise Page")
    public ExerciseSteps verifyExerciseIsOpen() {
        exercisePage
                .openPage();
        return this;
    }

    @Step("Create Custom Exercise")
    public ExerciseSteps createCustomExercise() {
        String exerciseName = "My First Exercise";
        exercisePage
                .createMyCustomExercise(exerciseName);
        return this;
    }

    @Step("Create Custom Exercise using Builder")
    public void createCustomExerciseUsingDropdownOption(Exercise exercise, String name) {
        exercisePage
                .selectDropdownOption(exercise, name);
    }

    @Step("Edit Custom Exercise")
    public void editCustomExercise() {
        String exerciseName = "Edited my Exercise";
        exercisePage
                .editMyCustomExercise(exerciseName);
    }
}
