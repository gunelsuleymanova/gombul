package com.example.Gombuless.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {
    private final JavaMailSender mailSender;

    public void sendMailService(String to,String title,String text){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(title);
        message.setText(text);
        mailSender.send(message);
    }
}
