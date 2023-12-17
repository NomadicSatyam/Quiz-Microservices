package com.quiz.quizservice.services;
import com.quiz.quizservice.entities.Quiz;
import java.util.List;

public interface QuizService {

    Quiz add(Quiz quiz);

    Quiz getOne(Long id);

    List<Quiz> get();



}
