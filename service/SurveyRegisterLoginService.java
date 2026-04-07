package com.example.Gombuless.service;

import com.example.Gombuless.config.JwtService;
import com.example.Gombuless.dao.entity.Survey;
import com.example.Gombuless.dao.repository.SurveyRepository;
import com.example.Gombuless.dto.request.SurveyRequest1;
import com.example.Gombuless.mapper.SurveyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SurveyRegisterLoginService {
    private final SurveyRepository surveyRepository;
    private final SurveyMapper surveyMapper;
    private final MailService mailService;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;


        public void saveSurvey(SurveyRequest1 dto) {
            Survey survey = Survey.builder()
                    .fullName(dto.getFullName())
                    .email(dto.getEmail())
                    .age(dto.getAge())
                    .phone(dto.getPhone())
                    .isUsedToken(false)
                    .build();

            survey = surveyRepository.save(survey);
            String token = jwtService.generateAccessToken(survey);
            survey.setToken(token);
            surveyRepository.save(survey);

            String link = "http://localhost:8080/api/v1/survey/verify?token=" + token;
            System.out.println(link);
            String asd="asd";
            mailService.sendMailService(survey.getEmail(), "qeydiyyat tesdiqi", "tesdiq ucun link: " + link);
        }

        public void verifySurvey(String token) {
            Long surveyId = jwtService.extractSurveyId(token);

            Survey survey = surveyRepository.findById(surveyId)
                    .orElseThrow(() -> new RuntimeException("istifadeci tapilmadi"));

            if (survey.isUsedToken()) {
                throw new RuntimeException("bu link artiq istifade edilib");
            }

            survey.setUsedToken(true);
            surveyRepository.save(survey);
        }
    }


