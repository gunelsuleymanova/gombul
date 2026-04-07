package com.example.Gombuless.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
//ai den gelen reponse
public class DietPlanResponse {
    Integer DurationWeeks;
    Integer DailyCalories;
    Macros macros;
    Rules rules;
    List<String> excludedFoods;
    List<String> sampleMenu;
    BMIData BMI;



}
