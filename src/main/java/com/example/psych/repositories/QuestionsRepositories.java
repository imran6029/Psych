package com.example.psych.repositories;

import com.example.psych.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepositories extends JpaRepository<Question,Long> {
}
