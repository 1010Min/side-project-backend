package com.example.demo.controller;

import com.example.demo.domain.TableVO;

import com.example.demo.persistence.*;
import com.example.demo.persistence.TableMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class TableController {

    private final TableMapper tableMapper;

    @GetMapping("/tables")
    public List<TableVO> findAll() {
        return tableMapper.findTable();
    }
}
