package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Exercise {

    String name;
    String majorMuscleGroup;
    String recordType;
    String otherMuscleGroups;
}
