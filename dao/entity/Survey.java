package com.example.Gombuless.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;


@Entity
@Table(name = "Gombul_USER")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String fullName;
    Integer age;
    String phone;
    String email;
    Integer weightKg;
    Integer heightCm;
    String goal;
    String motivationLevel;
    String activityLevel;
    @Column(columnDefinition = "TEXT")
    String healthNotes;
    String dislikedFoods;
    @CreationTimestamp
    LocalDate createdAt;
    String token;
    boolean isUsedToken= false;



//    String country;
//    @Enumerated(EnumType.STRING)
//    Gender gender;
//    @CreationTimestamp
//    LocalDateTime createAt;
//    @UpdateTimestamp
//    LocalDateTime updateAt;

}
