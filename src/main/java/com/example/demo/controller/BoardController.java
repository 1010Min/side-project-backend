package com.example.demo.controller;

import com.example.demo.domain.BoardVO;
import com.example.demo.domain.ResultVO;
import com.example.demo.persistence.*;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class BoardController {
    private final BoardMapper boardMapper;

    @PostMapping("/board")
    public ResultVO addBoard(@RequestBody BoardVO boardVO) {
        int result = boardMapper.insertBoard(boardVO);
        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }
}
