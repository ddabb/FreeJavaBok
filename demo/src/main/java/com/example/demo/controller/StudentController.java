package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.demo.entity.student;
import com.example.demo.repository.StutentRepository;

@RestController
public class StudentController {
    @Autowired
    private StutentRepository stutentRepository;

    @GetMapping(value = "/studentList")
    public List<student> studentList() {
        return stutentRepository.findAll();
    }
}
