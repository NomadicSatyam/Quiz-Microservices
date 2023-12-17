package com.question.QuestionService.services;

import com.question.QuestionService.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    Question getOne(Long id);

    List<Question> get();

    List<Question> getQuestionsOfQuiz(Long quizId);
}
