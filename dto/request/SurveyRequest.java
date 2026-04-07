package com.example.Gombuless.dto.request;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SurveyRequest {
    String fullName;
    Integer age;
    String phone;
    String email;
    Integer weightKg;
    Integer heightCm;
    String goal;
    String motivationLevel;
    String activityLevel;
    String healthNotes;
    List<String> dislikedFoods;
}
