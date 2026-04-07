package com.example.Gombuless.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SurveyRequest2 {
    Integer weightKg;
    Integer heightCm;
    String goal;
    String motivationLevel;
    String activityLevel;
    String healthNotes;
    List<String> dislikedFoods;
}
