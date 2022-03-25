package com.example.demo.controller;

import com.example.demo.domain.ApplicationVO;
import com.example.demo.domain.ResultVO;
import com.example.demo.persistence.*;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.*;
import com.example.demo.persistence.TablesMapper;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@MapperScan(basePackages = "com.example.demo.persistence")

public class ApplicationController {

    private final ApplicationMapper applicationMapper;

    @GetMapping("/tables/application")
    public List<ApplicationVO> findApp() { return applicationMapper.findAppTable(); }

    @DeleteMapping("/tables/application")
    public ResultVO removeComment(@RequestParam int id) {
        int result = applicationMapper.deleteTable(id);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }
}