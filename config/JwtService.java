package com.example.Gombuless.config;

import com.example.Gombuless.dao.entity.Survey;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class JwtService {

    private final JwtConfig jwtConfig;

        public String generateAccessToken(Survey survey) {
            Map<String, Object> extraClaims = new HashMap<>();
            extraClaims.put("surveyId", survey.getId()); // ID bura qoyulur

            return Jwts.builder()
                    .setClaims(extraClaims)
                    .setSubject(survey.getEmail())
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + jwtConfig.getExpiration()))
                    .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                    .compact();
        }

        public Long extractSurveyId(String token) {
            Claims claims = extractAllClaims(token);
            return claims.get("surveyId", Long.class); // Email yox, ID-ni götürürük
        }

        private Claims extractAllClaims(String token) {
            return Jwts.parserBuilder()
                    .setSigningKey(getSignInKey())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
        }

        private Key getSignInKey() {
            byte[] keyBytes = Decoders.BASE64.decode(jwtConfig.getSecretKey());
            return Keys.hmacShaKeyFor(keyBytes);
        }
    }
