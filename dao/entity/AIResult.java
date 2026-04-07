package com.example.Gombuless.dao.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@Table(name = "Gombul_AI")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AIResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long surveyId;
    @Column(columnDefinition = "TEXT")
    String aIResponse;
    @CreationTimestamp
    LocalDate createAt;

}
//ai den bize json metn gelri biz onu dietplanresponse dto sunun icine doldururuq
//buna deserialization deyilir
