package com.example.Gombuless.dto.request;

import com.example.Gombuless.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SurveyRequest1 {
    String fullName;
    Integer age;
    String phone;
    String email;
    String country;
    String goal;
    Gender gender;
}
