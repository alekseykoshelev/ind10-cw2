package com.example.demo.services;

import com.example.demo.entity.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;


public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
