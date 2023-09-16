package com.example.demo.controller;

import com.example.demo.entity.Question;
import com.example.demo.services.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {

    private final ExaminerService service;

    public ExamController(ExaminerService service) {
        this.service = service;
    }

    @GetMapping
    public Collection<Question> getQuestions(@RequestParam int amount) {
        return service.getQuestions(amount);
    }
}
