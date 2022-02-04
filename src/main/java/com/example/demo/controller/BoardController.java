package com.example.demo.controller;

import com.example.demo.domain.BoardVO;
import com.example.demo.domain.ResultVO;
import com.example.demo.persistence.*;

import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
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
    public List<BoardVO> findAllBoard(@RequestParam @Nullable Integer page_number, @RequestParam @Nullable Integer page_size) {
        Integer offset = null;
        if (page_number != null && page_size != null) {
            offset = (page_number - 1) * page_size;
        }
        return boardMapper.findBoard(offset, page_size);
    }

    @GetMapping("/board/count")
    public Integer countBoard() {
        return boardMapper.countBoard();
    }
}
