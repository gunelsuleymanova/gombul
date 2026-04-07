package com.example.Gombuless.dto.response;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Rules {

     List<String> eatMore;
     List<String> reduce;
     List<String> notes;
}

