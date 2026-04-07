package com.example.Gombuless.dto.response;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Meals {
    String breakfast;
    String breakfastInstruction;
    String lunch;
    String lunchInstruction;
    String dinner;
    String dinnerInstruction;
    String snack;
    String snackInstruction;

}
