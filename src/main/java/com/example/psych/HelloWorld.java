package com.example.psych;

import com.example.psych.models.Question;
import com.example.psych.repositories.PlayerRepository;
import com.example.psych.repositories.QuestionsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dev")
public class HelloWorld {
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private QuestionsRepositories questionsRepositories;
    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionsRepositories.findAll();
    }

}
