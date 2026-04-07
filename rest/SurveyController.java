package com.example.Gombuless.rest;

import com.example.Gombuless.dto.request.SurveyRequest1;
import com.example.Gombuless.service.SurveyRegisterLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/survey")
@RequiredArgsConstructor
public class SurveyController {
    private final SurveyRegisterLoginService surveyRegisterLoginService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody SurveyRequest1 dto) {
        surveyRegisterLoginService.saveSurvey(dto);
        return ResponseEntity.ok("Qeydiyyat uğurlu! Maili yoxlayın.");
    }

    @GetMapping("/verify")
    public ResponseEntity<String> verify(@RequestParam String token) {
        surveyRegisterLoginService.verifySurvey(token);
        return ResponseEntity.ok("Mail uğurla təsdiqləndi!");
    }


    @PostMapping
    public void snfbn(@RequestParam String nd) {
        

    }


}

//    @PostMapping("/save")
//    public void saveSurvery(@RequestBody SurveyRequest1 dto){
//        surveyService.saveSurvey(dto);
//    }
//
//
//    @PostMapping("/login")
//    public String login(@RequestParam String token){
//        surveyService.verifySurvey(token);
//        return "Survey verified successfully";
//
//    }



