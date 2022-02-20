package com.example.demo.controller;

import com.example.demo.domain.BoardVO;
import com.example.demo.domain.ResultVO;
import com.example.demo.persistence.*;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/board/read")
    public List<BoardVO> findAllBoard() {
        return boardMapper.findBoard();
    }

    @GetMapping("/board/{id}")
    public BoardVO findOne(@PathVariable int id) {
        return boardMapper.findOneBoard(id);
    }

    @GetMapping("/board/count")
    public Integer countBoard() {
        return boardMapper.countBoard();
    }

    @DeleteMapping("/board")
    public ResultVO removeBoard(@RequestParam int questionid) {
        int result = boardMapper.deleteBoard(questionid);

        if (result > 0) {
            return new ResultVO(0, "success");
        } else {
            return new ResultVO(100, "fail");
        }
    }
}
