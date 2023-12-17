package com.question.QuestionService.services.implemention;
import com.question.QuestionService.entities.Question;
import com.question.QuestionService.repositories.QuestionRepository;
import com.question.QuestionService.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImplemention implements QuestionService {

    private QuestionRepository questionRepository;

    public QuestionServiceImplemention(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question create(Question question)
    {
        return questionRepository.save(question);
    }

    public Question getOne(Long id)
    {
        return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("Question Not Foound"));
    }

    public List<Question> get()
    {
        return questionRepository.findAll();
    }

    public List<Question> getQuestionsOfQuiz(Long quizId)
    {
        return questionRepository.findByQuizId(quizId);
    }
}
