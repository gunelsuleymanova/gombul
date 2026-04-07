package com.example.Gombuless.dao.repository;

import com.example.Gombuless.dao.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurveyRepository extends JpaRepository<Survey,Long> {
    Object findByEmail(String email);


    String existsByEmail(String email);


    Survey findByToken(String token);

    boolean existsByToken(String token);



//    @Query(value = "SELECT * FROM survey WHERE MONTH(dob) = :month AND DAY(dob) = :day", nativeQuery = true)
//    List<Survey> findUsersWithBirthday(@Param("month") int month, @Param("day") int day);

//    List<Survey> findByEmail(String email);


}


