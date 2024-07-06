package com.shruti.quizapp.Controller;


import com.shruti.quizapp.Question;
import com.shruti.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();

    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable(value = "category") String category){
        return questionService.getQuestionsByCategory(category);
    }

}
