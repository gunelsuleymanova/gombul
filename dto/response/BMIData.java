package com.example.Gombuless.dto.response;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "Gombul_BMI")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BMIData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    double value;
    String Category;
    String CategoryAz;
    double IdealWeightMin;
    double IdealWeightMax;
    double WeightToLose;
    double WeightToGain;
    List<String> AIAdvice;
}
