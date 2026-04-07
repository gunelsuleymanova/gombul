package com.example.Gombuless.service;

import com.example.Gombuless.dao.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SurveyApplyInfoService {
    private final SurveyRepository surveyRepository;

    public void calculateBMI(Integer height,Integer weight){

    }

}
