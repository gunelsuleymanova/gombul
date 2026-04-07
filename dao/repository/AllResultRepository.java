package com.example.Gombuless.dao.repository;

import com.example.Gombuless.dao.entity.AIResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllResultRepository extends JpaRepository<AIResult,Long> {
}
