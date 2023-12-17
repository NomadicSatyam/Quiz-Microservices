package com.quiz.quizservice.controllers;
import com.quiz.quizservice.entities.Quiz;
import com.quiz.quizservice.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    // Create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz) {
        return quizService.add(quiz);
    }

    // Get All
    @GetMapping
    public List<Quiz> get() {
        return quizService.get();
    }

    // Get One
    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id) {
        return quizService.getOne(id);
    }


}
