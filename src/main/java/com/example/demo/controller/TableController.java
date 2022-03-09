package com.example.demo.controller;

import com.example.demo.domain.TableVO;

import com.example.demo.persistence.*;
import com.example.demo.persistence.TablesMapper;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@MapperScan(basePackages = "com.example.demo.persistence")

public class TableController {

    private final TablesMapper tablesMapper;

    @GetMapping("/tables")
    public List<TableVO> findAll() {
        return tablesMapper.findTable();
    }
}
