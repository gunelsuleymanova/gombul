package com.example.Gombuless.dto.response;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DayMenu {
    Integer day;
    Meals meals;

}
