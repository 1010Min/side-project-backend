package com.example.demo.controller;

import com.example.demo.domain.FaqVO;
import com.example.demo.persistence.*;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class FAQController {
    private final FAQMapper faqMapper;

    @GetMapping("/FAQ")
    public List<FaqVO> findAll() {
        return faqMapper.findAll();
    }
}